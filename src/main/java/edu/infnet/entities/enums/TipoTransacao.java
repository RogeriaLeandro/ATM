package edu.infnet.entities.enums;

public enum TipoTransacao {

	DEBITO("-"),
	CREDITO("+");
	
	private String sinal;
	
	private TipoTransacao(String sinal) {
		this.sinal = sinal;
	}
	
	public String getSinal() {
		return this.sinal;
	}
}
