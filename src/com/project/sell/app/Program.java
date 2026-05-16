package com.project.sell.app;

import java.util.Locale;
import java.util.Scanner;

import com.project.sell.modelo.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		System.out.print("Name: "); 
		String name = ler.nextLine();
		//Name: Notebook
		//Price: 1100.00
		System.out.print("Product: "); 
		double Price = ler.nextDouble();
		
		Product product = new Product(name, Price); 
		
		System.out.println(product.priceTag());
		
		
		ler.close();
	}

}
