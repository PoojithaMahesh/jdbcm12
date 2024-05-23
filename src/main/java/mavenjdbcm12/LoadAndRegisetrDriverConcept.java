package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegisetrDriverConcept {
public static void main(String[] args) throws SQLException {
//	1.Load and Register the Driver::
//	a.Load the Driver'
	Driver driver=new Driver();
//	b.Regsiter the Driver
	DriverManager.registerDriver(driver);
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.Execute A query
	statement.execute("insert into user values(3,'anusha','mandya')");
//	5.Close the Connection
	connection.close();
	System.out.println("Data inserted successfullly with Load adn Register the Driver explicitily");
}
}
