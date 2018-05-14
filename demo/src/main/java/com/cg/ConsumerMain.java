package com.cg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.cg.model.Customer;

@SpringBootApplication
public class ConsumerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(ConsumerMain.class, args);
		
	createCustomer();
	updateMultipleCustomer();
	customerDelete();

	
	//////////////////////////////////////
	 try {

			URL url = new URL("http://localhost:8080/customerRetrive");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		  } catch (MalformedURLException e1) {

			e1.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	////////////////////////////////////////////////////
	
	
	public static  void createCustomer()
	{
		  Logger LOGGER = LoggerFactory.getLogger(ConsumerMain.class);
		final String uri = "http://localhost:8080/customerCreate";
	    RestTemplate restTemplate = new RestTemplate();
	    Customer customer=new Customer(1L,"pooja","sdad","dfs","dfds");
	    Customer cust=restTemplate.postForObject(uri,customer,Customer.class);
	    System.out.println(cust);
	}
	
	/////////////////////
	public static void updateMultipleCustomer()
	{
		 Logger LOGGER = LoggerFactory.getLogger(ConsumerMain.class);
		 final String uri = "http://localhost:8080/customerupdate";
		 RestTemplate restTemplate = new RestTemplate();
		   List<Customer> list=new ArrayList();
		   Customer customer=new Customer(2L,"pooja","sdad","dfs","dfds");
		   Customer customer1=new Customer(6L,"pooja","sdad","dfs","dfds");
		 
		   list.add(customer);
		   list.add(customer1);
		   restTemplate.put(uri, list);
		   
		   
	}
	///////////////////////////////////////
	public static void customerDelete()
	{
		 Logger LOGGER = LoggerFactory.getLogger(ConsumerMain.class);
		 final String uri = "http://localhost:8080/customerDelete/{id}";
		 Map<String, Integer> params = new HashMap<String, Integer>();
		    params.put("id", 3);
		 RestTemplate restTemplate = new RestTemplate();
		 restTemplate.delete(uri, params);
	}
	
}
