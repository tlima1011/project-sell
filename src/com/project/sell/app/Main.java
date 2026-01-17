package com.project.sell.app;

import java.util.Locale;
import java.util.Scanner;

import com.project.sell.modelo.Produto;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Entre os dados do produto: "); 
		System.out.print("Nome: "); 
		String nome = ler.nextLine(); 
		System.out.print("Preço: "); 
		double preco = ler.nextDouble(); 
		System.out.print("Quantidade no estoque: "); 
		int quantidade = ler.nextInt(); 
		System.out.println();
		
		Produto p = new Produto(nome, preco, quantidade); 
				
		//double total = p.ValorTotalEmEstoque(); 
		//p.ExibirResultadoAtualizacao();
		System.out.println("Dados do Produto: " +p); 
				
		System.out.printf("\nDigite o número de produtos a ser adicionado ao estoque: ");
		quantidade = ler.nextInt();
		
		p.AdicionarProdutos(quantidade);
		//total = p.ValorTotalEmEstoque();
		//p.ExibirResultadoAtualizacao(); 
		System.out.println("Dados atualizados: " +p);
				
		System.out.printf("\nDigite o número de produtos a ser removido do estoque: "); 
		quantidade = ler.nextInt(); 
		
		p.RemoverProdutos(quantidade);
		System.out.println("Dados atualizados: " +p);
		//total = p.ValorTotalEmEstoque();
		//p.ExibirResultadoAtualizacao(); 
		
		ler.close();
	}
}
