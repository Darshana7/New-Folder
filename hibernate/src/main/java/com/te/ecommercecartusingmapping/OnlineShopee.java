package com.te.ecommercecartusingmapping;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class OnlineShopee {
	
	public static void main(String[] args) {
		
		Cart cart = new Cart();
		cart.setCartId(1);
		cart.setName("MyCart");
		cart.setQuantity(5);
		
		Product prod1 = new Product();
		prod1.setProductId(101);
		prod1.setProductName("HP 818 Perfume");
		prod1.setCost(329);
		prod1.setQuantity(2);
		
		Product prod2 = new Product();
		prod2.setProductId(102);
		prod2.setProductName("Boat rockerz 450");
		prod2.setCost(1499);
		prod2.setQuantity(1);
		
		Product prod3 = new Product();
		prod3.setProductId(103);
		prod3.setProductName("MI Smart Band");
		prod3.setCost(2499);
		prod3.setQuantity(1);
		
		Product prod4 = new Product();
		prod4.setProductId(104);
		prod4.setProductName("Ethnic jacket");
		prod4.setCost(812);
		prod4.setQuantity(1);
		
		List<Product> listOfProducts=Arrays.asList(prod1,prod2,prod3,prod4);
		cart.setProduct(listOfProducts);
		
		prod1.setCart(cart);
		prod2.setCart(cart);
		prod3.setCart(cart);
		prod4.setCart(cart);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(cart);
		em.persist(prod1);
		em.persist(prod2);
		em.persist(prod3);
		em.persist(prod4);
		transaction.commit();
		
	}

}
