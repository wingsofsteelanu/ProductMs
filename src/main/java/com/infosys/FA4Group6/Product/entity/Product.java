package com.infosys.FA4Group6.Product.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.infosys.FA4Group6.Product.dto.ProductDTO;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "prodid", nullable = false, updatable = false)
	private Integer prodId;
	@Column(name = "productname", nullable = false)
	private String productname;
	@Column(name = "brand", nullable = false)
	private String brand;
	@Column(precision=10,scale=2 )
	double price;
	@Column(name = "stock", nullable = false)
	private Integer stock;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "image", nullable = false)
	private String image;
	@Column(name = "sellerid", nullable = false, updatable = false)
	private Integer sellerid;
	@Column(name = "category", nullable = false)
	private String category;
	@Column(name = "subcategory")
	private String subcategory;
	@Column(name = "rating")
	private Integer rating;

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productName) {
		this.productname = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getSellerid() {
		return sellerid;
	}

	public void setSellerId(Integer sellerid) {
		this.sellerid = sellerid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubCategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public ProductDTO convertToDTO(){
        ProductDTO product = new ProductDTO();

        product.setProdId(this.getProdId());
        product.setBrand(this.getBrand());
        product.setCategory(this.getCategory());
        product.setDescription(this.getDescription());
        product.setImage(this.getImage());
        product.setPrice(this.getPrice());
        product.setProductname(this.getProductname());
        product.setRating(this.getRating());
        product.setSellerId(this.getSellerid());
        product.setStock(this.getStock());
        product.setSubCategory(this.getSubcategory());

        return product;
    }

}


