package br.com.andrelemos.airlinesflights.api.model;

public enum Status {
	
	NO_HORARIO ("NO HORARIO"),
	ATRASADO ("ATRASADO"),
	CANCELADO ("CANCELADO");

	private String nome;

	Status(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
