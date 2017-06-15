package com.example.shoppingCart.services.impl;

import org.springframework.stereotype.Service;

import com.example.shoppingCart.RestClient;
import com.example.shoppingCart.entities.Product;
import com.example.shoppingCart.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService 
{

	@Override
	public void addProductToCart(Product product) 
	{
		if(RestClient.restCall(product.getCode())== true)
		{
			System.out.println("added to cart");
		}
		
	}
	


}
