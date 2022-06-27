package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double priceH;
	private Double priceD;
	
	private TaxService taxService;

	public RentalService(Double priceH, Double priceD, TaxService taxService) {
		this.priceH = priceH;
		this.priceD = priceD;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		//Turning the date in Milli-seconds;
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		
		//Doing the calculus and turning in hours;
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double basicPayment;
		if(hours <= 12) {					
			basicPayment = Math.ceil(hours) * priceH;			//Math.ceil --> 4.10 to 5.00;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * priceD ;
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
	
}
