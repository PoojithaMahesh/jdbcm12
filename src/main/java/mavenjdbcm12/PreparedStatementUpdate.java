package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementUpdate {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12?user=root&password=root");
//	3 create a statement
	Scanner scanner=new Scanner(System.in);
	System.out.println("please give your id");
	int id=scanner.nextInt();
	System.out.println("Please give your name");
	String name=scanner.next();
	
	
	PreparedStatement preparedStatement=connection.prepareStatement("update user set name=? where id=?");
    preparedStatement.setString(1, name);
    preparedStatement.setInt(2, id);

	
	preparedStatement.execute();
	
	connection.close();
	System.out.println("data updated successfully with PS");
}
}
