package com.example.PerssengerService.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Billing implements Serializable {
	
	private int BillId;
	private String NameBill;
	private double Price;
	private int PerssengerId;
	public int getBillId() {
		return BillId;
	}
	public void setBillId(int billId) {
		BillId = billId;
	}
	public String getNameBill() {
		return NameBill;
	}
	public void setNameBill(String nameBill) {
		NameBill = nameBill;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getPerssengerId() {
		return PerssengerId;
	}
	public void setPerssengerId(int perssengerId) {
		PerssengerId = perssengerId;
	}
	public Billing() {
		super();
	}
	
	
	
}
