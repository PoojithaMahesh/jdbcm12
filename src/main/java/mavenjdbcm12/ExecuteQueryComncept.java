package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteQueryComncept {
public static void main(String[] args) throws Exception {
////	1.LOad and Register the Driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
////	2.Establish the Connection
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
////	3.Create a Statement
//	Statement statement=connection.createStatement();
////	4.Execute A query
//	statement.executeQuery("insert into user values(3,'anusha','mandya')");
////	5.Close the Connection
//	connection.close();
//	System.out.println("Data inserted successfullly with dependencies");
//	Insert =EXCEPTION
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
//	Statement statement=connection.createStatement();
//	statement.executeQuery("update user set name='Anusha A P' where id=3");
//	connection.close();
//	System.out.println("Data updated successfully");
	
//	EXception
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
	Statement statement=connection.createStatement();
	statement.executeQuery("delete from user where id=3");
	
	System.out.println("data deleted successfully without closing the connection");
}
}
