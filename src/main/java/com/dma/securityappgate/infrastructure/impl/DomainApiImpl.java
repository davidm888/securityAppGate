package com.dma.securityappgate.infrastructure.impl;

import org.springframework.stereotype.Service;

import com.dma.securityappgate.dto.DomainRequestDTO;
import com.dma.securityappgate.dto.ValidateResponseDTO;
import com.dma.securityappgate.infrastructure.DomainApi;

@Service
public class DomainApiImpl implements DomainApi {

	@Override
	public ValidateResponseDTO validateDomain(DomainRequestDTO domainRequestDTO) {
		return new ValidateResponseDTO.Builder("bancolombia.com").build();
	}

}
