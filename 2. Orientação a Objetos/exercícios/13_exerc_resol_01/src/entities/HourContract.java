package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHour;
	private Integer hour;
	
	public HourContract() {
		
	}
	
	public HourContract(Date date, Double valuePerHour, Integer hour) {
		this.date = date;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
	}
	
	public void setDate (Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setHour (Integer hour) {
		this.hour = hour;
	}
	
	public Integer getHour() {
		return hour;
	}
	
	public void setValuePerHour (Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}
	
	public Double totalValue() {
		return valuePerHour * hour;
	}
}
