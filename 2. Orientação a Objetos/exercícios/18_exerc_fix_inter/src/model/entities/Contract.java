package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contract {

	private Integer conNumber;
	private Date conDate;
	private Double totalContr;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Contract() {
	}
	
	public Contract(Integer conNumber, Date conDate, Double totalContr) {
		
		this.conDate = conDate;
		this.conNumber = conNumber;
		this.totalContr = totalContr;
	}

	public Integer getConNumber() {
		return conNumber;
	}

	public void setConNumber(Integer conNumber) {
		this.conNumber = conNumber;
	}

	public Date getConDate() {
		return conDate;
	}

	public void setConDate(Date conDate) {
		this.conDate = conDate;
	}

	public Double getTotalContr() {
		return totalContr;
	}

	public void setTotalContr(Double totalContr) {
		this.totalContr = totalContr;
	}
	
}

