package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteConcept {
public static void main(String[] args) throws Exception {
////	1.LOad and Register the Driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
////	2.Establish the Connection
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
////	3.Create a Statement
//	Statement statement=connection.createStatement();
////	4.Execute A query
//	boolean value=statement.execute("insert into user values(3,'anusha','mandya')");
//	System.out.println(value);
////	5.Close the Connection
//	connection.close();
//	System.out.println("Data inserted successfullly ");
//	Insert=FALSE
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
//	Statement statement=connection.createStatement();
//	boolean value=statement.execute("update user set name='Anusha A P' where id=3");
//	System.out.println(value);
//	connection.close();
//	System.out.println("Data updated successfully");
//	UPDATE=FALSE
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
	Statement statement=connection.createStatement();
	boolean value=statement.execute("delete from user where id=3");
	
	System.out.println(value);
	System.out.println("data deleted successfully without closing the connection");

//	Delete=FALSE
	
}
}
