package com.dma.securityappgate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dma.securityappgate.dto.DomainRequestDTO;
import com.dma.securityappgate.service.SecurityAppgateService;
import com.google.gson.Gson;

@RestController()
public class SecurityAppgateController {
	
	@Autowired
	SecurityAppgateService securityAppgateService;
	
	private static final Logger log = LoggerFactory.getLogger(SecurityAppgateController.class);

	@GetMapping("/healthCheck")
	public String healthCheck() {
		return securityAppgateService.healthCheck();
	}
	
	@GetMapping("/validate-domain")
	public String validateDomain(@RequestBody DomainRequestDTO domainRequestDTO) {
		log.info("[DomainRequestDTO]".concat(domainRequestDTO.toString()));
		String response  = securityAppgateService.validateDomain(domainRequestDTO);
		log.info("[ValidateResponseDTO]".concat(response));
		return response;
	}	

}
