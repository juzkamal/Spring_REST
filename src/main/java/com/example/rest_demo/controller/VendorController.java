package com.example.rest_demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_demo.model.Vendor;
import com.example.rest_demo.service.VendorService;

@RestController
@RequestMapping("/cloudvendor")
public class VendorController {
	
	VendorService vendorService;
	public VendorController(VendorService vendorService) {
		super();
		this.vendorService = vendorService;
	}

	@GetMapping("{vendorId}")
	public Vendor getVendorDetails(@PathVariable("vendorId") String vendorId) {
		return vendorService.getVendor(vendorId);
		
	}
	
	@GetMapping
	public List<Vendor> getAllVendorDetails() {
		return vendorService.getAllVendors();
		
	}
	
	@PostMapping
	public String createVendorDetails(@RequestBody Vendor vendor) {
		vendorService.createVendor(vendor);
		return "Vendor created successfully";
	}
	
	@PutMapping
	public String updateVendorDetails(@RequestBody Vendor vendor) {
		vendorService.updateVendor(vendor);
		return "Updated successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteVendorDetails(@PathVariable String vendorId) {
		vendorService.deleteVendor(vendorId);
		return "Vendor deleted successfully";
	}
}
