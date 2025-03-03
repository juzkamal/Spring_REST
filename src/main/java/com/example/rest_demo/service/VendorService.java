package com.example.rest_demo.service;

import java.util.List;
import com.example.rest_demo.model.Vendor;

public interface VendorService {
	public String createVendor(Vendor vendor);
	public String updateVendor(Vendor vendor);
	public String deleteVendor(String vendorId);
	public Vendor getVendor(String vendorId);
	public List<Vendor> getAllVendors();
}
