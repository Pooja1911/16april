package com.cg.bank.service;

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


