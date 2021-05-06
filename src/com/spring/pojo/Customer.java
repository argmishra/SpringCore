package com.spring.pojo;

public class Customer {
	private Receiver receiver;

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void displayInfo() {
		System.out.print("receiver = " +receiver.getFulladdress());
	}

}
