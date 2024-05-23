package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUser {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
	Statement statement=connection.createStatement();
	statement.execute("update user set name='Anusha A P' where id=3");
	connection.close();
	System.out.println("Data updated successfully");
}
}
