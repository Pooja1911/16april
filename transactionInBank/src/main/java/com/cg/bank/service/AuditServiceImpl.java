package com.cg.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.cg.bank.entities.AuditLog;

//@Service
public class AuditServiceImpl {
	/*
	 * @Autowired RestTemplate restTemplate;
	 */
	/*
	 * public AuditLog generateAudit(final AuditLog audit) {
	 */
	/*@Autowired
	RestTemplate restTemplate;
*/
	// public AuditLog updateName( AuditLog audit)
	// {
	// final String uri="http://mongo-client/audit";
	// final AuditLog response=restTemplate.postForObject(uri,audit,
	// AuditLog.class);
	// return response;
	// }
	// }

	/*public AuditLog generateAudit(AuditLog audit) {
		final String uri = "http://mongo-client/audit";
		final AuditLog response = restTemplate.postForObject(uri, audit, AuditLog.class);
		
		IAuditServiceS.createAudit(audit);
		return response;
	}*/
}

/*@FeignClient("mongo-client")
interface IAuditService {

	@PostMapping(path="/audit")
	AuditLog createAudit(AuditLog audit);
	

	
}*/


