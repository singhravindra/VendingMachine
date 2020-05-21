package com.vendingmachine.VendingMachineApplication;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class VendingResource {
	
	@GetMapping("/all-products")
	public List<String> getAllproducts(){
		
		
		return null;
		
	}
}
