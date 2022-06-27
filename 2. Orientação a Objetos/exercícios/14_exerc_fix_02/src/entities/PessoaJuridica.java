package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numberOfEmp;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double anualIncome, Integer numberOfEmp) {
		super(name, anualIncome);
		this.numberOfEmp = numberOfEmp;
	}
	
	public void setNumberOfEmp(Integer numberOfEmp) {
		this.numberOfEmp = numberOfEmp;
	}
	
	public Integer getNumberOfEmp() {
		return numberOfEmp;
	}
	
	@Override
	public Double tax() {
		if(getNumberOfEmp() <= 10) {
			return getAnualIncome() * 0.16;
		}
		else {
			return getAnualIncome() * 0.14;
		}
	}
}
