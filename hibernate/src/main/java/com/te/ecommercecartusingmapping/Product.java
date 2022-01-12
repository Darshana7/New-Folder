package com.te.ecommercecartusingmapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	private int productId;
	
	private String productName;
	
	private int cost;
	
	private int quantity;
	
	@ManyToOne
	private Cart cart;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int itemId) {
		this.productId = itemId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + ", quantity="
				+ quantity + ", cart=" + cart + "]";
	}
	
}
