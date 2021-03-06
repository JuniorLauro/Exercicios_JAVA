package model.services;

import model.entities.Contract;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		
		for(int i=1; i<=months; i++) {
			
			onlinePaymentService.interest(contract.getTotalContr(), months);
		}
	}
}
