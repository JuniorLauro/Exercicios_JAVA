package entities;

public final class PessoaFisica extends Pessoa {
	
	private Double healthTax;
	
	public PessoaFisica(String name, Double anualIncome, Double healthTax) {
		super(name, anualIncome);
		this.healthTax = healthTax;
	}
	
	public void setHealthTax(Double healthTax) {
		this.healthTax = healthTax;
	}
	
	public Double getHealthTax() {
		return healthTax;
	}
	
	@Override
	public Double tax() {
		if(getAnualIncome() <= 20000) {
			return getAnualIncome() * 0.15 - (getHealthTax() * 0.5);
		}
		else {
			return getAnualIncome() * 0.25 - (getHealthTax() * 0.5);
		}
	}

}
