package com.project.sell.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product{ 
	
	private LocalDate ManufactureDate; 
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, double price, LocalDate manufactureDate) {
		super(name, price);
		ManufactureDate = manufactureDate;
	}
	
	//Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
	@Override
	public String priceTag() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder(); 
		sb.append(Name + " (used) $" + String.format("%.2f", Price) 
						+ " (Manufacture date: "  +  fmt.format(ManufactureDate) + ")");
		return sb.toString(); 
	}
}
