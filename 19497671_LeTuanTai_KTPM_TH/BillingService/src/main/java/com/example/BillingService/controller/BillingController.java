package com.example.BillingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BillingService.entity.Billing;
import com.example.BillingService.service.BillingService;


@RestController
@RequestMapping("/billing")
public class BillingController {
	@Autowired
	private BillingService service;
	
	@PostMapping("/bill")
	public Billing createBill (@RequestBody Billing bill) {
		Billing billing= service.createBill(bill);
		return billing;
	}
	@GetMapping("/perssenger/bill/{id}")
	public List<Billing> getBillidBillings(@PathVariable("id") int id){
		List<Billing> bills=(List<Billing>) service.findBillByPerssenger(id);
		return bills;
	}

	@GetMapping("")
	public List<Billing> getBill(){
		List<Billing> bills=(List<Billing>) service.getBill();
		return bills;
	}
}
