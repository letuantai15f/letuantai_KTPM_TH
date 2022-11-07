package com.example.BillingService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BillingService.entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {
	@Query(value = "SELECT * FROM billing WHERE perssengerId = ?",nativeQuery = true)
	List<Billing> findBillingId(int id);
}
