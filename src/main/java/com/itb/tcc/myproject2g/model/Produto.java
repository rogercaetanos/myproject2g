package com.itb.tcc.myproject2g.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Produto {
	
	private Long id;
	private String marca;
	private String nome;
	private String descricao;
	private double preco;
	private boolean codStatusProduto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean getCodStatusProduto() {
		return codStatusProduto;
	}
	public void setCodStatusProduto(boolean codStatusProduto) {
		this.codStatusProduto = codStatusProduto;
	}
	
	
	

}
