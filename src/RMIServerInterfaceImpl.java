// Chew Zi Qing 212360
import java.rmi.*;
import java.rmi.server.*;

// the actual implementation of RMI Server with remote method
public class RMIServerInterfaceImpl extends UnicastRemoteObject implements RMIServerInterface {
	
	public RMIServerInterfaceImpl() throws RemoteException{
		
	}
	
	// method that actually calculates the area of circle
	// radius is from client
	public double calcArea(String radius) throws RemoteException{
		Double r = Double.parseDouble(radius); 
		double area = r * r * Math.PI;
		System.out.println("Area is " + area);
		return area;
	}
	
}
