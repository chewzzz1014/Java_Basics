import java.rmi.registry.*;

public class RegisterWithRMIServer {
	public static void main(String[]args) {
		try {
			RMIServerInterface obj = new RMIServerInterfaceImpl();
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind("RMIServerInterfaceImpl", obj);
			System.out.println("Student server " + obj + " registered");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
