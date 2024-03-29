// Chew Zi Qing 212360
package com.example.javafx.rmi;
import java.rmi.registry.*;

// server registers the object
public class RegisterWithRMIServer {
	public static void main(String[]args) {
		try {
			// create server
			RMIServerInterface obj = new RMIServerInterfaceImpl();
			
			// get remote object Registry for local host
			Registry registry = LocateRegistry.getRegistry();
			
			// bind this name with the remote object
			registry.rebind("RMIServerInterfaceImpl", obj);
			System.out.println("Student server " + obj + " registered");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
