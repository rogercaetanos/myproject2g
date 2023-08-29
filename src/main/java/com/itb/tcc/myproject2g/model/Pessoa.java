package com.itb.tcc.myproject2g.model;

import javax.persistence.Entity;

@Entity
public class Pessoa {
	
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	private String logradouro;
	private String cep;
	private String bairro;
	private String cidade;
	private String uf;
	
	private boolean codStatusPessoa;
	
	
}
