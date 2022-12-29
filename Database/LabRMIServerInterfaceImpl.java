// Chew Zi Qing 212360
import java.rmi.*;
import java.rmi.server.*;

// the actual implementation of RMI Server with remote method
public class LabRMIServerInterfaceImpl extends UnicastRemoteObject implements LabRMIServerInterface {
	
	public LabRMIServerInterfaceImpl() throws RemoteException{
		
	}
	
	public double findScore(String name) throws RemoteException {
	    Double d = (Double)scores.get(name);

	    if (d == null) {
	      System.out.println("Student " + name + " is not found ");
	      return -1;
	    }
	    else {
	      System.out.println("Student " + name + "\'s score is "
	        + d.doubleValue());
	      return d.doubleValue();
	    }
	  }
	
}
