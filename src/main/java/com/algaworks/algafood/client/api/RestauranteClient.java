package com.algaworks.algafood.client.api;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.algaworks.algafood.client.model.RestauranteResumoModel;

import lombok.AllArgsConstructor;

//16.10. Implementando um client da REST API com Java e Spring (RestTemplate) - 4'

@AllArgsConstructor
public class RestauranteClient {

	private static final String RESOURCE_PATH = "/restaurantess";
	
	private RestTemplate restTemplate;
	private String url;
	
	public List<RestauranteResumoModel> listar() {
		URI resourceUri = URI.create(url + RESOURCE_PATH);
		
		RestauranteResumoModel[] restaurantes = restTemplate
				.getForObject(resourceUri, RestauranteResumoModel[].class);
		
		return Arrays.asList(restaurantes);
	}
}
