package com.codein.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codein.domain.Product;
import com.codein.service.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired private ProductRepository productRepository;
	
	@RequestMapping("/halo")
	public String halo(){
		return "Hello World!";
	}
	
	@RequestMapping("/product/list")
	public Iterable<Product> allProduct(){
		return productRepository.findAll();
	}
}
