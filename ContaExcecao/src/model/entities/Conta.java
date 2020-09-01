package model.entities;

import model.exceptions.ExcecoesDominio;

public class Conta {

	private Integer nConta;
	private String titular;
	private Double balanco;
	private Double limite;
	
	public Conta() {}

	public Conta(Integer nConta, String titular, Double balanco, Double limite) {
		this.nConta = nConta;
		this.titular = titular;
		this.balanco = balanco;
		this.limite = limite;
	}
	
	
	public Integer getnConta() {
		return nConta;
	}

	public void setnConta(Integer nConta) {
		this.nConta = nConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getBalanco() {
		return balanco;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public void saque(Double montante) {
		if(montante>limite) {
			throw new ExcecoesDominio("Limite de saque excedido");
		}
		else if (montante>balanco) {
			throw new ExcecoesDominio("Não há saldo suficiente");
		}
		else {		
		balanco -= montante;
		}
	}
}
