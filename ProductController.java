 package com.example.demo;


 import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProduct()
	{
		return service.getProduct();
	}
	@GetMapping("/products/{productId}")
	public Product getProductById(@PathVariable int productId)
	{
		return service.getProductById(productId);
	}
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod)
	{
		System.out.println(prod);
		service.addProduct(prod);
	}
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod)
	{
		System.out.println("Iam here");
		service.updateProduct(prod);
	}
	@DeleteMapping("/products/{productId}")
	public void deleteProduct(@PathVariable int productId)
	{
		service.deleteProduct(productId);
	}
}
