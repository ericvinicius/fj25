package br.com.caelum.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Conta {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String titular;
	
	private String numero;
	
	private String banco;
	
	private String agencia;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public Conta autoCreate(){
		Conta conta = new Conta();
		conta.setAgencia("0000-0");
		conta.setBanco("Banco 666");
		conta.setNumero("00.000-0");
		conta.setTitular("Satan - AUTOCREATE");
		return conta;
	}
}
