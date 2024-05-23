package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdateSaveUser {
public static void main(String[] args) throws Exception {
//	1.LOad and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.Execute A query
	int value=statement.executeUpdate("insert into user values(6,'anusha','mandya')");
	System.out.println(value);
//	5.Close the Connection
	connection.close();
	System.out.println("Data inserted successfullly with ExecuteUpdate");
}
}
