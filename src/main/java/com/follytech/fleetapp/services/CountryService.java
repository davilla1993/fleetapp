package com.follytech.fleetapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.follytech.fleetapp.models.Country;
import com.follytech.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> getCountries(){
		
		return countryRepository.findAll();
	}
	
	
	public void save(Country country) {
		
		countryRepository.save(country);
		
	}

}
