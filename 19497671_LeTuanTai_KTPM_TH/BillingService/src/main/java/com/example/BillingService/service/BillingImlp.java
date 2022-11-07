package com.example.BillingService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.BillingService.entity.Billing;
import com.example.BillingService.repository.BillingRepository;

@Service
public class BillingImlp implements BillingService{
	@Autowired
	private BillingRepository repository;
	@Override
	public Billing createBill(Billing billing) {
		// TODO Auto-generated method stub
		return repository.save(billing);
	}

	@Override
	public List<Billing> getBill() {
		List<Billing> bills = (List<Billing>) repository.findAll(); 
		System.out.println(bills);
		return bills;
	}

	@Override
	public List<Billing> findBillByPerssenger(int id) {
		List<Billing> list=repository.findBillingId(id);
		return list;
	}



}
