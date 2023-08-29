package com.itb.tcc.myproject2g.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	private String logradouro;
	private String cep;
	private String cidade;
	private String uf;
	
	private boolean codStatusCliente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public boolean getCodStatusCliente() {
		return codStatusCliente;
	}

	public void setCodStatusCliente(boolean codStatusCliente) {
		this.codStatusCliente = codStatusCliente;
	}
	
	
	
	

}
