// Chew Zi Qing 212360
import java.rmi.registry.*;

// server registers the object
public class LabRegisterWithRMIServer {
	public static void main(String[]args) {
		try {
			// create server
			LabRMIServerInterface obj = new LabRMIServerInterfaceImpl();
			
			// get remote object Registry for local host
			Registry registry = LocateRegistry.getRegistry();
			
			// bind this name with the remote object
			registry.rebind("LabRMIServerInterfaceImpl", obj);
			System.out.println("Student server " + obj + " registered");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

