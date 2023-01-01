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
	
	// starting up database
	private void initializeDB() {
		try {
			// load derby driver
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		      System.out.println("Driver loaded");

		      // establish a connection
		      // use database's absolute path
		      connection = DriverManager.getConnection
		    		  ("jdbc:derby:C:\\Users\\USER\\eclipse-workspace\\Database\\javabook;user=scott;password=tiger");
		        
		      System.out.println("Database connected");
		      // create statement instace
		      stmt = connection.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// the actual implementation of finding score from database
	public String findScore(String name)throws RemoteException {
		initializeDB();	
		try {
			// builds query
			String queryStr = "select * from Scores where name='"+name+"'";
			// execute query
			 rset = stmt.executeQuery(queryStr);
			 
			 // get query result (based on the column's type)
			 if (rset.next()) {
				 // get student name, score and permission
				 String stdName = rset.getString(1);
				 double score = rset.getDouble(2);
				 boolean permission = rset.getBoolean(3);
				 
				 // if students has permission, display score
				 if (permission)
					 result = score+"";
				 // no permission to view score
				 else
					 result = "No Permission to View!";
			 }
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	  }
	
}
