package com.cg.bank.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.bank.entities.AuditLog;

@Service
public class AuditServiceImpl {

	
	public AuditLog generateAudit(final AuditLog audit)
	{
		final RestTemplate restTemplate=new RestTemplate();
		final String uri="http://localhost:8082/audit";
		System.out.println("audit obnject " + audit);
		final AuditLog audii=restTemplate.postForObject(uri, audit, AuditLog.class);
		return audii;
	}
}
 