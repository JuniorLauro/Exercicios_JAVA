package model.devices;

public class ComboDevice extends Device implements Scanner, Printer {
	
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
			System.out.println("Processing doc: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Print doc: " + doc);
		
	}

	@Override
	public String scan() {
		return "Object Scanned";
	}
}
