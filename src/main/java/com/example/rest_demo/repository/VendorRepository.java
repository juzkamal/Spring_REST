package com.example.rest_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest_demo.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, String>{

}
