package application;

import model.devices.ComboDevice;

public class Program {

	public static void main(String[] args) {
		ComboDevice c = new ComboDevice("1001");
		c.print("Hello World");
		System.out.println("Scan result: " + c.scan());
		c.processDoc("This document");

	}

}
