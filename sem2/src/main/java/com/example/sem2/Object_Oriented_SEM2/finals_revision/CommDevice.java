package com.example.sem2.Object_Oriented_SEM2.finals_revision;

public interface CommDevice {
	// no abstract keyword needed. By default methods in interface are abstract
	public void transmit(String destination, String text);
	public boolean receive(String receiver, String text);
}