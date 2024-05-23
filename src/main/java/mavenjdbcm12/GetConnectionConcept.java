package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GetConnectionConcept {
public static void main(String[] args) throws Exception {
//		1.LOad and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12?user=root&password=root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.Execute A query
	statement.execute("insert into user values(10,'anusha','mandya')");
//	5.Close the Connection
	connection.close();
	System.out.println("Data inserted successfullly with diff get connection");
}
}
