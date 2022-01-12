package com.te.hibernateservlet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Insert extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		String parameter = req.getParameter("uname");
		String parameter2 = req.getParameter("upass");
		Login login = new Login();
		
		login.setUname(parameter);
		login.setUpass(parameter2);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Login");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(login);
		transaction.commit();
		
	}

}
