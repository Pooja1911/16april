package com.mongodb.mon.repo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mongodb.mon.document.AuditLog;

/**
 * @author trainee
 *
 */
@Repository
public interface AuditMongoRepository extends MongoRepository<AuditLog,UUID>{
	
	/*@Repository
	public interface AuditMongoRepository extends CrudRepository <AuditLog,UUID>{*/
 
	/**
	 * @param eventName
	 * @return
	 */
	List<AuditLog> findByEventName(String eventName);
	/**
	 * @param eventType
	 * @return
	 */
	AuditLog findByEventType(String eventType);
	Optional<AuditLog> findByeventID(UUID id);
}
