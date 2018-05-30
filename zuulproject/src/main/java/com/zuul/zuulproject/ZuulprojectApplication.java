package com.zuul.zuulproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.zuulproject.filter.PreFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulprojectApplication.class, args);
	}
	@Bean
	PreFilter preFilter()
	{
		return new PreFilter();
	}
}
