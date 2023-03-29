package com.algaworks.algafood.client.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class RestauranteResumoModel {

	private Long id;
	private String nome;
	private BigDecimal taxaFrete;
	private CozinhaModel cozinha;
	
	//16.10. Implementando um client da REST API com Java e Spring (RestTemplate) - 17'30"
	public String toString() {
		return nome + " - " + taxaFrete;
	}
	
}
