package com.example.shoppingCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingCart.entities.Product;
import com.example.shoppingCart.services.ProductService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController 
{
  @Autowired
  private ProductService productService;
  
  @RequestMapping(value = "/addToCart/product", method = RequestMethod.POST)
  @ApiOperation(value="adding products to shopping cart")
  public Product addProductToCart(@RequestBody Product product)
  {
	  productService.addProductToCart(product);
	  return null;
  }
	
}
