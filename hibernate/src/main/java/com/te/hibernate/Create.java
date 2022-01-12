package com.te.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Create 
{
    public static void main( String[] args )
    {
//    	Scanner sc=new Scanner(System.in);
//    	System.out.println("Enter Id");
//    	int n1=sc.nextInt();
//    	System.out.println("Enter name of player");
//    	String s1=sc.nextLine();
//    	System.out.println("Enter salary");
//    	double d1=sc.nextDouble();
//    	System.out.println("Enter designation");
//    	String st1=sc.next();
    	
    	
        System.out.println( "Hello World!" );
        Team player1 = new Team();
        player1.setId(7);
        player1.setName("MS Dhoni");
        player1.setSalary(10000);
        player1.setDesignation("Captain Cool");
        
        Team player2 = new Team();
        player2.setId(18);
        player2.setName("King Kohli");
        player2.setSalary(7000);
        player2.setDesignation("Vice Captain");
        
        Team player3 = new Team();
        player3.setId(12);
        player3.setName("Yuvraj Singh");
        player3.setSalary(9000);
        player3.setDesignation("All Rounder");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("players");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction= em.getTransaction();
        transaction.begin();
        em.persist(player1);
        em.persist(player2);
        em.persist(player3);
        transaction.commit();
    }
}
