package com.example.demo;

import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
@Service
public class ProductService 
{	
	@Autowired
	Productrepo repo;
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	List<Product> products=new ArrayList(Arrays.asList(
//			new Product(101,"MacBook",80000),
//			new Product(102,"Camera",50000),
//			new Product(103,"IQOOSE",35000)));
//	
	public List<Product> getProduct()
	{
		return repo.findAll();
		
	}
	public Product getProductById(int productId)
	{
		return repo.findById(productId).orElse(new Product());
	}
	public void addProduct(Product prod)
	{
		repo.save(prod);
	}
	public void updateProduct(Product prod)
	{
		repo.save(prod);
	}
	public void deleteProduct(int productId)
	{
		repo.deleteById(productId);
	}
}
