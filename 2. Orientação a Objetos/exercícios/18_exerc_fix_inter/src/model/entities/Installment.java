package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private Date instalDate;
	private Double instalValue;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Installment() {
	}
	
	public Installment(Date instalDate, Double instalValue) {
		
		this.instalDate = instalDate;
		this.instalValue = instalValue;
	}

	public Date getInstalDate() {
		return instalDate;
	}

	public void setInstalDate(Date instalDate) {
		this.instalDate = instalDate;
	}

	public Double getInstalValue() {
		return instalValue;
	}

	public void setInstalValue(Double instalValue) {
		this.instalValue = instalValue;
	}

}
