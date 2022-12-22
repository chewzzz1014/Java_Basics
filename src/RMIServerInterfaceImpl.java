import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class RMIServerInterfaceImpl extends UnicastRemoteObject implements RMIServerInterface {
	
	private HashMap<String, Double> scores = new HashMap<String, Double>();
	
	public RMIServerInterfaceImpl() throws RemoteException{
		initializeStudent();
	}
	
	protected void initializeStudent() {
		 scores.put("John", 90.5);
		 scores.put("Michael", 100.00);
		 scores.put("Michelle",98.5);
	}
	
	public double findScore(String name) throws RemoteException{
		Double d = (Double) scores.get(name);
		
		if (d == null) {
			 System.out.println("Student " + name + " is not found ");
		      return -1;
		}else {
			 System.out.println("Student " + name + "\'s score is "
				        + d.doubleValue());
				      return d.doubleValue();
		}
	}
}
