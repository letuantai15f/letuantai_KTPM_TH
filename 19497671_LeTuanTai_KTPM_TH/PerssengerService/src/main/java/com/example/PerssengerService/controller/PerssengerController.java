package com.example.PerssengerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.PerssengerService.entity.Billing;
import com.example.PerssengerService.entity.Perssenger;
import com.example.PerssengerService.service.PerssengerService;

@RestController
@RequestMapping("/perssenger")
public class PerssengerController {
	@Autowired
	private PerssengerService service;
	@Autowired
	private RedisTemplate template;
	
	@PostMapping("/create")
	public Perssenger createPerssenger(@RequestBody Perssenger perssenger) {
		perssenger=service.createPerssenger(perssenger);
		template.opsForHash().put("product", perssenger.getPerssengerId(), perssenger);
		return perssenger;
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
	@GetMapping("/{id}")
	public Perssenger getPerssenger2(@PathVariable("id") int id) {
		Perssenger perssenger=(Perssenger) template.opsForHash().get("product", id);
		System.out.println(perssenger);
		return perssenger;
	}
}
