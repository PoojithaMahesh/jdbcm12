package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementSaveUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12?user=root&password=root");
//	3 create a statement
	Scanner scanner=new Scanner(System.in);
	System.out.println("please give your id");
	int id=scanner.nextInt();
	System.out.println("Please give your name");
	String name=scanner.next();
	System.out.println("please give address ");
	String address=scanner.next();
	
	PreparedStatement preparedStatement=connection.prepareStatement("insert into User values(?,?,?)");
	preparedStatement.setInt(1, id);
	preparedStatement.setString(2, name);
	preparedStatement.setString(3, address);
	
	preparedStatement.execute();
	
	connection.close();
	System.out.println("data inserted successfully with PS");
}
}
