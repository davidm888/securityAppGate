package com.dma.securityappgate.infrastructure;

import com.dma.securityappgate.dto.DomainRequestDTO;
import com.dma.securityappgate.dto.ValidateResponseDTO;

public interface DomainApi {

	public ValidateResponseDTO validateDomain(DomainRequestDTO domainRequestDTO);
}
