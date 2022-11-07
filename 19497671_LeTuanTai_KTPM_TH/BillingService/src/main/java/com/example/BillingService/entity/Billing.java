package com.example.BillingService.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "billing")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Billing implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -541567967762173606L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
