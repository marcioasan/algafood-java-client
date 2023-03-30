package com.algaworks.algafood.client.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Problem {

	private Integer status;
	private OffsetDateTime timestamp;
	private String userMessage;

	private List<Object> objects = new ArrayList<>();
	
	//16.12. Desafio: Implementando uma requisição POST no client Java
	@Data
	public static class Object {
		
		private String name;
		private String userMessage;
		
	}
}
