package com.te.onetomanymapping;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClassOneToMany {

	public static void main(String[] args) {
		
		GirlOneToMany girl = new GirlOneToMany();
		girl.setGid(420);
		girl.setName("Ash");
		
		BoyManyToOne boy = new BoyManyToOne();
		boy.setBid(1);
		boy.setName("Vivek");
		boy.setBalance(5000);
		
		BoyManyToOne boy2 = new BoyManyToOne();
		boy2.setBid(2);
		boy2.setName("Salman");
		boy2.setBalance(7500);
		
		BoyManyToOne boy3 = new BoyManyToOne();
		boy3.setBid(3);
		boy3.setName("Abhishek");
		boy3.setBalance(4000);
		
		List<BoyManyToOne> listOfBoys=Arrays.asList(boy,boy2,boy3);
		girl.setBoy(listOfBoys);
		
		boy.setGirl(girl);
		boy2.setGirl(girl);
		boy3.setGirl(girl);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(boy);
		em.persist(boy2);
		em.persist(boy3);
		em.persist(girl);
		transaction.commit();

	}

}
