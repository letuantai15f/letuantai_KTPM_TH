package com.example.PerssengerService.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.PerssengerService.entity.Billing;
import com.example.PerssengerService.entity.Perssenger;
import com.example.PerssengerService.repository.PerssengerRepository;

@Service
public class PerssengerImlp implements PerssengerService {
	@Autowired
	private PerssengerRepository repository;
	@Autowired
	private RestTemplate restTemplate;
	@Override
	public Perssenger createPerssenger(Perssenger perssenger) {
		// TODO Auto-generated method stub
		return repository.save(perssenger);
	}

	@Override
	public Perssenger getPerssenger() {
		List<Perssenger> perssengers=(List<Perssenger>) repository.findAll();
		return perssengers.get(0);
	}

	@Override
	public String findPerssengerId(int id) {
		 HttpHeaders headers = new HttpHeaders();
		 headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 HttpEntity <String> entity = new HttpEntity<String>(headers);
		
		 return restTemplate.exchange("http://localhost:8081/billing/perssenger/bill/"+id, HttpMethod.GET, entity, String.class).getBody();
	}

	

}
