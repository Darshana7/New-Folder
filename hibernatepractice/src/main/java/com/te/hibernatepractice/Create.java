package com.te.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Create {
	
	public static void main(String[] args) {
		
		Team player1 = new Team();
		player1.setId(7);
		player1.setName("Dhoni");
		player1.setSalary(10000);
		player1.setDesignation("Captain Cool");
		
		Team player2 = new Team();
		player2.setId(18);
		player2.setName("Virat Kohli");
		player2.setSalary(9000);
		player2.setDesignation("Vice Captain");
		
		Team player3 = new Team();
		player3.setId(12);
		player3.setName("Yuvraj Singh");
		player3.setSalary(9500);
		player3.setDesignation("All Rounder Cricketer");
		
		Team player4 = new Team();
		player4.setId(8);
		player4.setName("Jadeja");
		player4.setSalary(9800);
		player4.setDesignation("Bowler");
		
		Team player5 = new Team();
		player5.setId(1);
		player5.setName("KL Rahul");
		player5.setSalary(8000);
		player5.setDesignation("Batsmen");
		
		Team player6 = new Team();
		player6.setId(45);
		player6.setName("Rohit Sharma");
		player6.setSalary(9700);
		player6.setDesignation("Batsmen");
		
		Team player7 = new Team();
		player7.setId(80);
		player7.setName("Bumrah");
		player7.setSalary(8000);
		player7.setDesignation("Bowler");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("players");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(player1);
		em.persist(player2);
		em.persist(player3);
		em.persist(player4);
		em.persist(player5);
		em.persist(player6);
		em.persist(player7);
		transaction.commit();
	}

}
