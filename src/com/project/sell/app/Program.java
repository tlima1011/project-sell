package com.project.sell.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import com.project.sell.modelo.ImportedProduct;
import com.project.sell.modelo.Product;
import com.project.sell.modelo.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int n = ler.nextInt();
		ler.nextLine();
		ArrayList<Product> products = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Product #%d data: \n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			Character opcao = ler.nextLine().charAt(0);
			opcao = opcao.toLowerCase(opcao);
			System.out.print("Name: ");
			String name = ler.nextLine();
			System.out.print("Price: ");
			double price = ler.nextDouble();
			ler.nextLine(); 
			if (opcao == 'c') {
				products.add(new Product(name, price));
			} else if (opcao == 'u') {
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate dt = LocalDate.parse(ler.nextLine(), fmt);
				products.add(new UsedProduct(name, price, dt));
			} else if (opcao == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = ler.nextDouble();
				ler.nextLine();
				products.add(new ImportedProduct(name, price, customsFee));
			}
			
		}

		
		

		ler.close();
	}

}
