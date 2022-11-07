package com.example.PerssengerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PerssengerService.entity.Billing;
import com.example.PerssengerService.entity.Perssenger;
import com.example.PerssengerService.service.PerssengerService;

@RestController
@RequestMapping("/perssenger")
public class PerssengerController {
	@Autowired
	private PerssengerService service;
	
	@PostMapping("/create")
	public Perssenger createPerssenger(@RequestBody Perssenger perssenger) {
		Perssenger perssenger2=service.createPerssenger(perssenger);
		return perssenger2;
	}
	@GetMapping("/perssenger/bill/{id}")
	public String getPerssengerId(@PathVariable("id") int perssengerID) {
		
		return service.findPerssengerId(perssengerID);
	}
	@GetMapping("")
	public Perssenger getPerssenger() {
		Perssenger perssenger=service.getPerssenger();
		return perssenger;
	}
}
