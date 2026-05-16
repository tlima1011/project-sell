package com.project.sell.app;

import java.util.Locale;
import java.util.Scanner;

import com.project.sell.modelo.Produto;

public class Main2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		
		Scanner ler = new Scanner(System.in); 
		
		Produto p = new Produto("TV"); 
		Produto p1 = new Produto("Desktop",2500.88);
		Produto p2 = new Produto("Notebook"); 
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		
		ler.close();
	}
}
