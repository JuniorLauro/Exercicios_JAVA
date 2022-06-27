package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{

	private Date manufaturingDate;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		
	}
	
	public UsedProduct(String name, Double price, Date manufaturingDate) {
		super(name, price);
		this.manufaturingDate = manufaturingDate;
	}
	
	public void setManufaturingDate(Date manufaturingDate) {
		this.manufaturingDate = manufaturingDate;
	}
	
	public Date getManufaturingDate() {
		return manufaturingDate;
	}
	
	@Override
	public final String priceTag() {
		return getName() 
				+ String.format(" (used) $%.2f", getPrice()) 
				+ " (Manufacture Date: " 
				+ sdf.format(manufaturingDate) + ")";
	}
}
