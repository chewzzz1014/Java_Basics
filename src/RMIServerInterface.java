// Chew Zi Qing 21260
import java.rmi.*;

// interface for Server class
public interface RMIServerInterface extends Remote {
	// abstract method of calculating circle radius
	public double calcArea(String radius) throws RemoteException;
}
