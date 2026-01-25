package com.project.sell.modelo;

public class Produto {
	
	public String nome;  
	public double preco;  
	public int quantidade; 
	
	public Produto(String n) {
		nome = n; 
		preco = 110000.22; 
		quantidade = 2000; 
	}
	
	public Produto(String n, double p) {
		nome = n; 
		preco = p; 
		quantidade = 100; 
	}
	
	public Produto(String n, double p, int q) {
		this.nome = n; 
		this.preco = p; 
		this.quantidade = q; 
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
