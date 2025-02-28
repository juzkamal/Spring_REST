package com.example.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_demo.model.Vendor;

@RestController
@RequestMapping("/cloudvendor")
public class APIService {
	Vendor vendor;

	@GetMapping("{vendorId}")
	public Vendor getVendorDetails(String vendorId) {
		return vendor;
	}
	@PostMapping
	public String createVendorDetails(@RequestBody Vendor vendor) {
		this.vendor = vendor;
		return "Vendor created successfully";
	}
	
	@PutMapping
	public String updateVendorDetails(@RequestBody Vendor vendor) {
		this.vendor = vendor;
		return "updates successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteVendorDetails(String vendorId) {
		this.vendor = null;
		return "Vendor deleted successfully";
	}
}
