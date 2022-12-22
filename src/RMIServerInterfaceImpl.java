import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class RMIServerInterfaceImpl extends UnicastRemoteObject implements RMIServerInterface {
	
	public RMIServerInterfaceImpl() throws RemoteException{
		initializeStudent();
	}
	
	protected void initializeStudent() {
	}
	
	public double calcArea(String radius) throws RemoteException{
		Double r = Double.parseDouble(radius); 
		double area = r * r * Math.PI;
		System.out.println("Area is " + area);
		return area;
	}
	
}
