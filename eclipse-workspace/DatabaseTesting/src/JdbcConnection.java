import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws   SQLException  {
		// TODO Auto-generated method stub
		
		
		
		//to connect mysql server and database
		
		String host="localhost";
		String port="3306";
		
	Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadbt?autoReconnect=true&useSSL=false", "root", "root");
		
		//create path to send query
	
	Statement s=con.createStatement();
	
java.sql.ResultSet rs = s.executeQuery("select * from Employeeinfo where name='balu'");
	
while(rs.next()) {

	rs.getString("location");
	rs.getInt("id");
}
	
	
	
	

	}

}
