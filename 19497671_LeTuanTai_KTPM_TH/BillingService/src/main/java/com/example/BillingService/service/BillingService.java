package com.example.BillingService.service;

import java.util.List;

import com.example.BillingService.entity.Billing;


public interface BillingService {
	Billing createBill(Billing billing);
	List<Billing> getBill ();
	List<Billing> findBillByPerssenger(int id);


}
