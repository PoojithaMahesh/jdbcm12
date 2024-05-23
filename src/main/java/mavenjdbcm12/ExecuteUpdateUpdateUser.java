package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdateUpdateUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
	Statement statement=connection.createStatement();
	int value=statement.executeUpdate("update user set name='Anusha A P' where id=4");
	System.out.println(value);
	connection.close();
	System.out.println("Data updated successfully");
}
}
