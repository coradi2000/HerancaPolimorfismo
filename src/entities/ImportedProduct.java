package entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return this.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return this.getName() 
								+ " $ " 
								+  String.format("%.2f",  this.getPrice()) 
								+ " (Customs fee: $ " 
								+ String.format("%.2f", customsFee)
								+ ")";
	}
}
