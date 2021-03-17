//package com.infosys.FA4Group6.product;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.infosys.FA4Group6.Product.dto.ProductDTO;
//import com.infosys.FA4Group6.Product.service.ProductService;
//
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes=ProductApplicationTests.class)
//public class ProductApplicationTests{
//	@Mock
//	ProductService service = new ProductService();
//	
//	@Test
//	public void getSpecificProductTest() throws Exception{
//		ProductDTO productDTO = new ProductDTO();
//		
//		productDTO.setProdId(1);
//		productDTO.setBrand("Alisha");
//		productDTO.setCategory("Clothing");
//		productDTO.setDescription("Key Features of Alisha Solid Women\'s Cycling Shorts Cotton Lycra Navy, Red, Navy,Specifications of Alisha Solid Women\'s Cycling Shorts Shorts");
//		productDTO.setImage("\"http://img5a.flixcart.com/image/short/u/4/a/altht-3p-21-alisha-38-original-imaeh2d5vm5zbtgg.jpeg\"");
//		productDTO.setPrice(500.00f);
//		productDTO.setProductname("Alisha Solid Women\'s Cycling Shorts");
//		productDTO.setRating(null);
//		productDTO.setSellerId(7);
//		productDTO.setStock(50);
//		productDTO.setSubCategory("Women\'s Clothing");
//		
//		Mockito.when(service.getProductById(1)).thenReturn(productDTO);
//		assertEquals(service.getProductById(1), productDTO);	
//	}
//	
//	@Test
//	public void getSpecificProductTestInvalid() {
//		ProductDTO productDTO = new ProductDTO();
//		
//		productDTO.setProdId(2);
//		productDTO.setBrand("Alisha");
//		productDTO.setCategory("Clothing");
//		productDTO.setDescription("Key Features of Alisha Solid Women\'s Cycling Shorts Cotton Lycra Navy, Red, Navy,Specifications of Alisha Solid Women\'s Cycling Shorts Shorts");
//		productDTO.setImage("\"http://img5a.flixcart.com/image/short/u/4/a/altht-3p-21-alisha-38-original-imaeh2d5vm5zbtgg.jpeg\"");
//		productDTO.setPrice(500.00f);
//		productDTO.setProductname("Alisha Solid Women\'s Cycling Shorts");
//		productDTO.setRating(null);
//		productDTO.setSellerId(7);
//		productDTO.setStock(50);
//		productDTO.setSubCategory("Women\'s Clothing");
//		
//		Mockito.when(service.getProductById(1)).thenReturn(productDTO);
//		assertNotEquals(service.getProductById(1), null);
//	}
//}
