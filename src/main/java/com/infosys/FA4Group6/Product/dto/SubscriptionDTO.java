package com.infosys.FA4Group6.Product.dto;

import com.infosys.FA4Group6.Product.entity.SubscribedProduct;

public class SubscriptionDTO {

    private Integer subId;
    private Integer buyerid;
    private Integer prodid;
    private Integer quantity;

    public Integer getBuyerid() {
        return buyerid;
    }

    public Integer getProdid() {
        return prodid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getSubId() {
        return subId;
    }

    public void setBuyerid(Integer buyerId) {
        this.buyerid = buyerId;
    }

    public void setProdid(Integer prodId) {
        this.prodid = prodId;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public SubscribedProduct convertToEntity(){
        SubscribedProduct subscribedProduct = new SubscribedProduct();
        subscribedProduct.setSubId(this.getSubId());
        subscribedProduct.setBuyerid(this.getBuyerid());
        subscribedProduct.setProdid(this.getProdid());
        subscribedProduct.setQuantity(this.getQuantity());

        return subscribedProduct;
    }
}
