package com.dma.securityappgate.dto;

public class ValidateResponseDTO {
	
	private String domain;
	
	private String[] similar_domains;
	
	private String[] domains_sim_punycode;
	
	public static  class Builder {
		private String domain;
		
		private String[] similar_domains;
		
		private String[] domains_sim_punycode;
		
		public Builder(String domain) {
            this.domain = domain;
        }
		
		public Builder withSimilarDomains(String[] similar_domains) {
            this.similar_domains = similar_domains;
            return this;
        }
		
		public Builder withPunyCodeDomains(String[] domains_sim_punycode) {
            this.domains_sim_punycode = domains_sim_punycode;
            return this;
        }
		
		public ValidateResponseDTO build() {
			ValidateResponseDTO validateResponseDTO = new ValidateResponseDTO(); 
            validateResponseDTO.setDomain(this.domain);
            validateResponseDTO.setSimilar_domains(this.similar_domains);
            validateResponseDTO.setDomains_sim_punycode(this.domains_sim_punycode);
            return validateResponseDTO;
		}

	}
	
	private ValidateResponseDTO () {}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String[] getSimilar_domains() {
		return similar_domains;
	}

	public void setSimilar_domains(String[] similar_domains) {
		this.similar_domains = similar_domains;
	}

	public String[] getDomains_sim_punycode() {
		return domains_sim_punycode;
	}

	public void setDomains_sim_punycode(String[] domains_sim_punycode) {
		this.domains_sim_punycode = domains_sim_punycode;
	}
}
