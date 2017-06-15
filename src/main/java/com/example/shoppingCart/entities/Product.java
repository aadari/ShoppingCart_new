package com.example.shoppingCart.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModelProperty;


public class Product implements Comparable<Product> 
{
   
	@Id
	@ApiModelProperty(notes = "The mongodb generated product ID")
	private String code;
	@ApiModelProperty(notes = "The name of product") 
	private String name;
	@ApiModelProperty(notes = "The price of product") 
    private double price;
    private byte[] image;
 
    // For sort.
    private Date createDate;
 
    public Product() {
    }
 
    @Id
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 

    public Date getCreateDate() {
        return createDate;
    }
 
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
 
    public byte[] getImage() {
        return image;
    }
 
    public void setImage(byte[] image) 
    {
        this.image = image;
    }
    
	@Override
	public int compareTo(Product o) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
