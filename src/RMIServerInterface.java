import java.rmi.*;

/*
 * 49 = Java 5
50 = Java 6
51 = Java 7
52 = Java 8
53 = Java 9
54 = Java 10
55 = Java 11
56 = Java 12
57 = Java 13
58 = Java 14
59 = Java 15
60 = Java 16
61 = Java 17
62 = Java 18
63 = Java 19

javac --release 8 yourClass.java
 */

public interface RMIServerInterface extends Remote {
	public double findScore(String name) throws RemoteException;
}
