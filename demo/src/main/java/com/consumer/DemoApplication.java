package com.consumer;

import java.lang.reflect.Method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.CheckAnnotation;
import com.cg.myAnnotation.Pooja;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		CheckAnnotation ca=new CheckAnnotation();
		try {
			Method m=ca.getClass().getMethod("demo");
			Pooja pooja=m.getAnnotation( Pooja.class);
			System.out.println("the value is"+pooja.value());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
