package com.algaworks.algafood.client;

import org.springframework.web.client.RestTemplate;

import com.algaworks.algafood.client.api.ClientApiException;
import com.algaworks.algafood.client.api.RestauranteClient;

//16.10. Implementando um client da REST API com Java e Spring (RestTemplate) - 15'

public class ListagemRestaurantesMain {

	public static void main(String[] args) {
		
		//16.11. Tratando respostas com código de erro no client Java - 12'
		try {
			RestTemplate restTemplate = new RestTemplate();
			
			RestauranteClient restauranteClient = new RestauranteClient(
					restTemplate, "http://localhost:8080");
			
			restauranteClient.listar().stream()
			.forEach(restaurante -> System.out.println(restaurante));			
		} catch (ClientApiException e) {
			if (e.getProblem() != null) {
				System.out.println(e.getProblem());
				System.out.println(e.getProblem().getUserMessage());
			} else {
				System.out.println("Erro desconhecido");
				e.printStackTrace();
			}
		}
	}
}
