package com.dma.securityappgate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dma.securityappgate.dto.DomainRequestDTO;
import com.dma.securityappgate.dto.HealthCheckResponseDTO;
import com.dma.securityappgate.dto.ValidateResponseDTO;
import com.dma.securityappgate.infrastructure.DomainApi;
import com.google.gson.Gson;

@Service
public class SecurityAppgateService {
	
	@Autowired
	Gson gson;
	
	@Autowired
	DomainApi domainApi; 
	
	public String healthCheck() {
		HealthCheckResponseDTO response = new HealthCheckResponseDTO.Builder("OK").withVersion("1.0.0").build();
		return gson.toJson(response);
	}
	
	public String validateDomain(DomainRequestDTO domainRequestDTO) {
		ValidateResponseDTO response =  domainApi.validateDomain(domainRequestDTO);
		return gson.toJson(response);
	}

}
