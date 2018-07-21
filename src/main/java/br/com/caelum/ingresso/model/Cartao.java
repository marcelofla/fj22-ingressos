package br.com.caelum.ingresso.model;

import java.time.YearMonth;



public class Cartao {

	private String numero;
	private String CVV;
	private YearMonth vencimento;
	public String getNumero() {
		return numero;
	}
	
	public Boolean isValido() {
		return vencimento.isAfter(YearMonth.now());
	}
	
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCVV() {
		return CVV;
	}
	public void setCVV(String cVV) {
		CVV = cVV;
	}
	public YearMonth getVencimento() {
		return vencimento;
	}
	public void setVencimento(YearMonth vencimento) {
		this.vencimento = vencimento;
	}
	
	
	
}
