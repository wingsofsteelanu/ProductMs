package com.infosys.FA4Group6.Product.ProductRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.FA4Group6.Product.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

	List<Product> findByBrand(String brand);

	List<Product> findByProductname(String productname);

	List<Product> findByCategory(String category);

	Iterable<Product> findBySellerid(Integer sellerid);
	
}
