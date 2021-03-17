package com.infosys.FA4Group6.Product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.infosys.FA4Group6.Product.dto.SubscriptionDTO;

@Entity
@Table(name = "subscribedproduct")
public class SubscribedProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subid", nullable = false, updatable = false)
	private Integer subId;
	@Column(name = "buyerid", nullable = false, updatable = false)
	private Integer buyerid;
	@Column(name = "prodid", nullable = false, updatable = false)
	private Integer prodid;
	@Column(name = "quantity", nullable = false)
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

	public SubscriptionDTO convertToDTO(){
        SubscriptionDTO subscription = new SubscriptionDTO();

        subscription.setBuyerid(this.getBuyerid());
        subscription.setProdid(this.getProdid());
        subscription.setQuantity(this.getQuantity());

        return subscription;
    }
}
