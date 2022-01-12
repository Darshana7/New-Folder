package com.te.ecommercecartusingmapping;

import java.util.List;



@Entity
public class Cart {
	
	@Id
	private int cartId;
	
	private String name;
	
	private int quantity;
	
	@OneToMany(mappedBy ="cart")
	private List<Product> product;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int prodId) {
		this.cartId = prodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", name=" + name + ", quantity=" + quantity + ", product=" + product + "]";
	}

}
