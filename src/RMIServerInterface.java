import java.rmi.*;

public interface RMIServerInterface extends Remote {
	public double findScore(String name) throws RemoteException;
}
