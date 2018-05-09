package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
