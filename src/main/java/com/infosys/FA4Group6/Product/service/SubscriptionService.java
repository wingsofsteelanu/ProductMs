package com.infosys.FA4Group6.Product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.FA4Group6.Product.ProductRepository.SubscriptionRepository;
import com.infosys.FA4Group6.Product.entity.SubscribedProduct;

@Service
public class SubscriptionService {

	@Autowired
	private SubscriptionRepository subscriptionRepository;

	public SubscribedProduct getSubscriptionById(Integer subid) {
		return subscriptionRepository.findById(subid).orElse(null);
	}

	public SubscribedProduct saveSubscription(SubscribedProduct subscribedProduct) {
		return subscriptionRepository.save(subscribedProduct);
	}

	public Iterable<SubscribedProduct> getSubscriptions(Integer buyerid) {
		return subscriptionRepository.findByBuyerid(buyerid);
	}

	public void deleteSubscription(SubscribedProduct subscribedProduct) {
		subscriptionRepository.delete(subscribedProduct);
	}

	public SubscribedProduct updateSubscription(SubscribedProduct subscribedProduct) {
		SubscribedProduct existingSubscription = subscriptionRepository.findById(subscribedProduct.getSubId()).orElse(null);
		if (existingSubscription != null) {
			existingSubscription.setQuantity(subscribedProduct.getQuantity());

			return subscriptionRepository.save(existingSubscription);
		}
		return null;
	}
}
