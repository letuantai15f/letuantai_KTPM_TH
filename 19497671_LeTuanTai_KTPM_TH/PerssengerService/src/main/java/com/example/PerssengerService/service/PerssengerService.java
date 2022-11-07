package com.example.PerssengerService.service;

import com.example.PerssengerService.entity.Billing;
import com.example.PerssengerService.entity.Perssenger;

public interface PerssengerService {
	Perssenger createPerssenger(Perssenger perssenger);
	Perssenger getPerssenger();
	String findPerssengerId(int id);

}
