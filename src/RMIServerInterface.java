import java.rmi.*;
public interface RMIServerInterface extends Remote {
	public double calcArea(String radius) throws RemoteException;
}
