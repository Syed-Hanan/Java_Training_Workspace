package aadhaarserviceapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import addhaarserviceapp.entity.AddhaarService;
import addhaarserviceapp.service.AadhaarService;

@RestController
@RequestMapping("/aadhaar")
public class Aadhaarcontroller {
	
	private AadhaarService service;
	
	public AddhaarService saveAadhaar(@RequestBody AddhaarService aadhaar) {
		return service.saveAadhaar(aadhaar);
	}
	
	public AddhaarService getAadhaar(@PathVariable String addhaarNumber) {
		return service.getAadhaarDetails(addhaarNumber);
	}

}
