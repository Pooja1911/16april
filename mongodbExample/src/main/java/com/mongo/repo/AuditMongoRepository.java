package com.mongo.repo;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.document.AuditLog;

public interface AuditMongoRepository extends MongoRepository<AuditLog,UUID>{

}
