package com.te.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Login");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		String Query = "select password from Login where userName=:uname";
		javax.persistence.Query createQuery = em.createQuery(Query);
		String parameter = req.getParameter("uname");
		String parameter2 = req.getParameter("upass");
		createQuery.setParameter("uname", parameter);
		Object singleResult = null;
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("./invalid");
		try {
			singleResult = createQuery.getSingleResult();
		} catch (Exception e) {
			writer.println("Invalid Uname");
		}
		if(singleResult.equals(parameter2)) {
			
			if(parameter.equals("Darshana")) {
				requestDispatcher.forward(req, resp);
//				resp.sendRedirect("");
			} else {
				resp.sendRedirect("");
			}
		} else {
			writer.println("Invalid Password");
//			requestDispatcher.include(req, resp);
		}
		em.persist(Login);
		transaction.commit();
	}
}
