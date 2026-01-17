package com.project.sell.modelo;

public class Produto {
	
	public String nome;  
	public double preco;  
	public int quantidade; 
	
	public Produto(String n, double p, int q) {
		this.nome = n; 
		this.preco = p; 
		this.quantidade = q; 
	}
	
	public double ValorTotalEmEstoque() {
		return preco * quantidade; 
	}
	
	public void AdicionarProdutos(int q) {
		this.quantidade += q; 
	}
	
	public void RemoverProdutos(int q) {
		this.quantidade -= q; 
	}
	
	@Override
	public String toString() {
		return 
			String.format("%s, $ %.2f, %d unidades, Total: $ %.2f",nome, preco, quantidade, ValorTotalEmEstoque()); 
	}

	/*public void ExibirResultadoAtualizacao() { 
		System.out.printf("\nDados atualizados: %s, $ %.2f, %d, Total: $ %.2f\n", this.nome, this.preco, this.quantidade, ValorTotalEmEstoque());
	}*/

}
