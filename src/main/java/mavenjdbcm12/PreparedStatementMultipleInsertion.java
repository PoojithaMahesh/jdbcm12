package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementMultipleInsertion {
public static void main(String[] args) throws Exception {
//	1.Load and Register thr Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
//	Create a Statement
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter how many entries you want to save");
	int entries=scanner.nextInt();
	int i=0;
	while(i<entries) {
		System.out.println("please enter id");
		int id=scanner.nextInt();
		System.out.println("please name");
		String name=scanner.next();
		System.out.println("please enter address");
		String address=scanner.next();
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into user values(?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
		
		preparedStatement.execute();
		i++;
	}
  connection.close();
  System.out.println("Multiple data inserted successfully");
	
}
}
