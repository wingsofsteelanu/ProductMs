package com.infosys.FA4Group6.Product.ProductRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.FA4Group6.Product.entity.SubscribedProduct;

@Repository
public interface SubscriptionRepository extends CrudRepository<SubscribedProduct, Integer> {

	Iterable<SubscribedProduct> findByBuyerid(Integer buyerid);
}
