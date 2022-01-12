package com.te.hibernate;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDemo {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("players");
		EntityManager createEntityManager = emf.createEntityManager();
//		String query="From TeamIndia";
//		Query createQuery = createEntityManager.createQuery(query);
//		List<Team> resultList = createQuery.getResultList();
//		resultList.forEach(System.out::println);
//		for (Team team : resultList) {
//			System.out.println(team);
//			
//		}
		String query1="Select min(salary) from TeamIndia";
		Query createQuery1 = createEntityManager.createQuery(query1);
		Double singleResult = (Double)createQuery1.getSingleResult();
		System.out.println(singleResult);
//		Object singleResult = createQuery.getSingleResult();
//		System.out.println(singleResult);
		
		EntityTransaction transaction = createEntityManager.getTransaction();
//		String query2="update TeamIndia set salary=150 where id=12";
		String query4="update TeamIndia set salary=:sal where id=:ramo";
		transaction.begin();
		Query createQuery = createEntityManager.createQuery(query4);
		System.out.println("take input");
		Scanner in = new Scanner(System.in);
		double d = in.nextDouble();
		int e =  in.nextInt();
		createQuery.setParameter("sal", d);
		createQuery.setParameter("ramo", e);
		int executeUpdate = createQuery.executeUpdate();
		transaction.commit();
		
//		transaction.begin();
//		Query createQuery = createEntityManager.createQuery(query2);
//		int executeUpdate = createQuery.executeUpdate();
//		transaction.commit();
		
//		String query3="delete TeamIndia where id=45";
//		transaction.begin();
//		Query createQuery = createEntityManager.createQuery(query3);
////		int executeUpdate3 = createQuery.executeUpdate();
//		transaction.commit();
		
	}

}
