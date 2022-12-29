// Chew Zi Qing 212360
import java.rmi.*;
import java.rmi.server.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

// the actual implementation of RMI Server with remote method
public class LabRMIServerInterfaceImpl extends UnicastRemoteObject implements LabRMIServerInterface {
	
	PreparedStatement preparedStatement;
	Connection connection;
	
	public LabRMIServerInterfaceImpl() throws RemoteException{
		initializeDB();
	}
	
	private void initializeDB() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		      System.out.println("Driver loaded");

		      // Establish a connection
		      connection = DriverManager.getConnection
		    		  ("jdbc:derby:javabook;user=scott;password=tiger");
		        
		      System.out.println("Database connected");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String findScore(String name)throws RemoteException {
		try {
			String queryStr = "select * from Scores";
			preparedStatement = connection.prepareStatement(queryStr);
			 preparedStatement.setString(1, name);
//		     preparedStatement.setString(2, courseId);
		     ResultSet rset = preparedStatement.executeQuery();
		     return rset.getString(1);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "yoyoy";
	  }
	
}
