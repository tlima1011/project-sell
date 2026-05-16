package com.project.sell.modelo;

public class ImportedProduct extends Product{
	
	private double CustomsFee; 
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		CustomsFee = customsFee;
	}
	
	public double TotalPrice() { 
		return CustomsFee + super.Price; 
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(Name + " $" + String.format("%.2f", TotalPrice()) 
						+ " (Customs fee: $ "+ String.format("%.2f", CustomsFee)+ ")");
		return sb.toString(); 
	}
}
