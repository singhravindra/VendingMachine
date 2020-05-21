package com.vendingmachine.VendingMachineApplication;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Vendingdto {

	
	private Integer id;
	private String product;
	private double amount;
	private double refund_amt;
	
	public Vendingdto(){}

	
	public Vendingdto(Integer id, String product, double amount, double refund_amt) {
		super();
		this.id = id;
		this.product = product;
		this.amount = amount;
		this.refund_amt = refund_amt;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getRefund_amt() {
		return refund_amt;
	}

	public void setRefund_amt(double refund_amt) {
		this.refund_amt = refund_amt;
	}
	

	
}
