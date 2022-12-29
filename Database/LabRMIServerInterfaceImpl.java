// Chew Zi Qing 212360
import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;

// the actual implementation of RMI Server with remote method
public class LabRMIServerInterfaceImpl extends UnicastRemoteObject implements LabRMIServerInterface {
	
	Statement statement;
	Connection connection;
	ResultSet rset;
	String result = "Not Found";
	
	public LabRMIServerInterfaceImpl() throws RemoteException{
		initializeDB();
	}
	
	private void initializeDB() {
		try {
			
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			//Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		      System.out.println("Driver loaded");

		      // Establish a connection
		      connection = DriverManager.getConnection
		    		  ("jdbc:derby:javabook;user=scott;password=tiger");
		        
		      System.out.println("Database connected");
		      statement = connection.createStatement();
		      
		      String queryStr = "select * from Scores";
		      rset = statement.executeQuery(queryStr);
			  result = rset.getString(1);
		      System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String findScore(String name)throws RemoteException {
		initializeDB();	
		try {
			String queryStr = "select * from Scores";
			//preparedStatement = connection.prepareStatement(queryStr);
//			 preparedStatement.setString(1, name);
//		     preparedStatement.setString(2, courseId);
			 rset = this.statement.executeQuery(queryStr);
			 result = rset.getString(1);
			 System.out.println(result);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	  }
	
}
