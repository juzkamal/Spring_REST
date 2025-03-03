package com.example.rest_demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest_demo.model.Vendor;
import com.example.rest_demo.repository.VendorRepository;
import com.example.rest_demo.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {
	
	VendorRepository vendorRepository;

	public VendorServiceImpl(VendorRepository vendorRepository) {
		super();
		this.vendorRepository = vendorRepository;
	}

	@Override
	public String createVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vendorRepository.save(vendor);
		return "success";
	}

	@Override
	public String updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vendorRepository.save(vendor);
		return "update success";
	}

	@Override
	public String deleteVendor(String vendorId) {
		// TODO Auto-generated method stub
		vendorRepository.deleteById(vendorId);
		return "delete success";
	}

	@Override
	public Vendor getVendor(String vendorId) {
		// TODO Auto-generated method stub
		return vendorRepository.findById(vendorId).get();
		
	}

	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return vendorRepository.findAll();
		
	}

}
