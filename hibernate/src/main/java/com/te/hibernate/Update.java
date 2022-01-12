package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("players");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
//		Team player = em.find(Team.class, 45); //retrieve,fetch
//		System.out.println(player);
		
		/*
		 * Deleting the data
		 */
		
//		Team vk = em.find(Team.class, 18);
//		transaction.begin();
//		em.remove(vk);
//		transaction.commit();
		
		/*
		 * Updating the data
		 */
		
//		Team kl = em.find(Team.class, 1);
//		if(kl!=null) {
//			kl.setDesignation("VC");
//			transaction.begin();
//			transaction.commit();
//			System.out.println("Updated");
		
		Team uv = em.find(Team.class, 12);
		if(uv!=null) {
			uv.setDesignation("All Rounder");
			transaction.begin();
			transaction.commit();
			System.out.println("Updated");
		}
		
		
	}
}
