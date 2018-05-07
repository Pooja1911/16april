package com.cg.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.config.ApplicationConfig;
import com.cg.model.Customer;
import com.cg.service.IRetailerService;
import com.cg.service.RetailerServiceImpl;
@WebServlet("/ServletConsume")
public class ServletConsume extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	//doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	
		IRetailerService retailerService = context.getBean("retailerService",
				RetailerServiceImpl.class);
		List<Customer> customerList = retailerService.viewCustomer("R2");
		
		
		request.setAttribute("list8", customerList);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(request, response);
		//doGet(request, response);
	}
	
	

}
