// Chew Zi Qing 21260
package com.example.sem3.database;
import java.rmi.*;

// interface for Server class
public interface LabRMIServerInterface extends Remote {
	public String findScore(String name) throws RemoteException;
}

