package com.cg.bank.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.cg.bank.entities.AuditLog;

@FeignClient("mongo-client")
public interface IAuditService {

	@PostMapping("/audit")
	AuditLog createAudit(@RequestBody final AuditLog audit);
}
