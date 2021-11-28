package com.dma.securityappgate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SecurityAppgateController {

	@GetMapping("/healthCheck")
	public String healthCheck() {
		return "{version: 1.0.0, status: 'OK' }";
	}
	
	@GetMapping("/validate-domain")
	public String validateDomain() {
		return "{dominio:\"bancolombia.com\", dominios_similares:[], dominios_sim_punycode:[]}";
	}	

}
