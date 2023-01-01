// Chew Zi Qing 212360
import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;

// the actual implementation of RMI Server with remote method
public class LabRMIServerInterfaceImpl extends UnicastRemoteObject implements LabRMIServerInterface {
	
	private Statement stmt;
	Connection connection;
	ResultSet rset;
	String result = "Not Found (Server)";
	
	public LabRMIServerInterfaceImpl() throws RemoteException{
		initializeDB();
	}
	
	private void initializeDB() {
		try {
			
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		      System.out.println("Driver loaded");

		      // Establish a connection
		      connection = DriverManager.getConnection
		    		  ("jdbc:derby:C:\\Users\\USER\\eclipse-workspace\\Database\\javabook;user=scott;password=tiger");
		        
		      System.out.println("Database connected");
		      stmt = connection.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String findScore(String name)throws RemoteException {
		initializeDB();	
		try {
			String queryStr = "select * from Scores where name='"+name+"'";
			 rset = stmt.executeQuery(queryStr);
			 if (rset.next()) {
				 String stdName = rset.getString(1);
				 double score = rset.getDouble(2);
				 boolean permission = rset.getBoolean(3);
				 if (permission)
					 result = score+"";
				 else
					 result = "No Permission to View!";
			 }
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	  }
	
}
