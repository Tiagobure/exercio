package application.entities;

public final class ImportedProduct extends Product {

	private Double customFee;

	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	public Double totalPrice(double total) {

		return total += total + customFee;
	}

	@Override
	public String priceTag() {
		return "(Customs fee: $ " + customFee + ")";

	}

}