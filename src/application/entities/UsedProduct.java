package application.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
				+ sdf.format(manufactureDate)
				+ ")";

	}

}