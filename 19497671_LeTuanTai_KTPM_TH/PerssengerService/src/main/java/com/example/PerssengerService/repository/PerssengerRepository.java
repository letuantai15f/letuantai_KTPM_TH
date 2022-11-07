package com.example.PerssengerService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.PerssengerService.entity.Perssenger;
@Repository
public interface PerssengerRepository extends JpaRepository<Perssenger, Long> {
//		Perssenger findPerssengerId(int id);

}
