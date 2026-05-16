package com.project.sell.modelo;

public class Produto {
	
	private String nome;  
	private double preco;  
	private int quantidade; 
	
	public Produto() {
		this.quantidade = 2000; 
		this.preco = 110000.22; 
	}
	
	public Produto(String n) {
		this(); 
		nome = n; 
	}
	
	public Produto(String n, double p){
		nome = n; 
		preco = p; 
		quantidade = 1000; 
	}
	
	public Produto(String n, double p, int q){
		this.nome = n; 
		this.preco = setPreco(); 
		this.quantidade = q; 
	}
	
	public void setPreco(double p) {
		if(preco < 0.0) {
			this.preco = 1.0; 
		}
		else {
			this.preco = p; 
		}
	}
	
	public double setPreco() { 
		return preco; 
	}
	
	public void setQuantidade(int q) {
		if(quantidade < 0) {
			this.quantidade = 0; 
		}
		else {
			this.quantidade = q;
		}
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	
	public double ValorTotalEmEstoque() {
		return preco * quantidade; 
	}
	
	public void AdicionarProdutos(int q) {
		quantidade += q; 
	}
	
	public void RemoverProdutos(int q) {
		this.quantidade -= q; 
	}
	
	@Override
	public String toString() {
		return 
			String.format("%s, $ %.2f, %d unidades, Total: $ %.2f",nome, preco, quantidade, ValorTotalEmEstoque()); 
	}
}
