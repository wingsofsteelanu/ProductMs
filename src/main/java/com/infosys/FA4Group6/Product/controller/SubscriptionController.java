package com.infosys.FA4Group6.Product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infosys.FA4Group6.Product.dto.SubscriptionDTO;
import com.infosys.FA4Group6.Product.entity.SubscribedProduct;
import com.infosys.FA4Group6.Product.model.Message;
import com.infosys.FA4Group6.Product.service.SubscriptionService;

import java.util.List;

@RestController
@RequestMapping("api/subscriptions")
public class SubscriptionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubscriptionController.class);

   // @Value("${buyerAPIURL}")
   public String buyerAPIURI;
    @Autowired
    public RestTemplate restTemplate;
    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping()
    public Object getSubscription(@RequestParam(name = "buyerid") Integer buyerId) {
        LOGGER.info("Retrive SubscribedProduct For buyer " + buyerId);

        List<SubscribedProduct> subscribedProducts = (List<SubscribedProduct>) subscriptionService.getSubscriptions(buyerId);

        if (subscribedProducts.size() == 0) {
            Message msg = new Message();
            msg.setMessage("No Subscriptions done yet");
        }

        return subscribedProducts;
    }

    @PostMapping("/add")
    public Object addSubscription(@RequestBody SubscriptionDTO subscription) {
        LOGGER.info("Add SubscribedProduct For buyer " + subscription.getBuyerid());

        ResponseEntity<Boolean> responseEntity = restTemplate.getForEntity(buyerAPIURI + subscription.getBuyerid(), Boolean.class);

        if (responseEntity.getBody() != null && responseEntity.getBody()) {
            subscriptionService.saveSubscription(subscription.convertToEntity());
            Message msg = new Message();
            msg.setMessage("SubscribedProduct Successful :)");
            return msg;
        }

        Message msg = new Message();
        msg.setMessage("SubscribedProduct Failed! You have to be a Privileged Buyer :(");
        return msg;
    }

    @DeleteMapping("/remove")
    public Object removeSubscription(@RequestBody SubscriptionDTO subscription) {
        subscriptionService.deleteSubscription(subscription.convertToEntity());

        if (subscriptionService.getSubscriptionById(subscription.getSubId()) == null) {
            LOGGER.info("Remove SubscribedProduct For buyer " + subscription.getBuyerid());

            Message msg = new Message();
            msg.setMessage("SubscribedProduct Cancelled Successfully :)");
            return msg;
        }
        Message msg = new Message();
        msg.setMessage("SubscribedProduct Cancelled has Failed :(");
        return msg;
    }

    @PutMapping("/update")
    public Object updateSubscription(@RequestBody SubscriptionDTO subscription) {
        LOGGER.info("Update SubscribedProduct For buyer " + subscription.getBuyerid());

        try {
            subscriptionService.updateSubscription(subscription.convertToEntity());
            Message msg = new Message();
            msg.setMessage("SubscribedProduct Updated Successfully :)");
            return msg;
        } catch (Exception e){
            Message msg = new Message();
            msg.setMessage("SubscribedProduct Updated Failed :( Make sure you have a subscription First");
            return msg;
        }


    }
}
