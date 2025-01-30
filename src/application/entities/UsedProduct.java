package application.entities;

import java.util.Date;

public final class UsedProduct extends Product {

	
	public Date manufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return "(used)" 
				+ super.priceTag() 
				+ "(Manufacture date: " 
				+ manufactureDate + ")";
					
	}
	
	
	
}