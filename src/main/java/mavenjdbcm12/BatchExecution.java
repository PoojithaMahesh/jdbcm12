package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchExecution {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("insert into user values (?,?,?)");
	System.out.println("enter the number of entries you want to save");
	Scanner scanner=new Scanner(System.in);
	int entries=scanner.nextInt();
	int i=0;
	
	while(i<entries) {
		System.out.println("please enter id");
		int id=scanner.nextInt();
		System.out.println("please enter name");
		String name=scanner.next();
		System.out.println("please enter address");
		String address=scanner.next();   
		
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
		
		preparedStatement.addBatch();
		System.out.println("added to a batch successfully");
		i++;
	}
	preparedStatement.executeBatch();
	connection.close();
	System.out.println("data inserted at a time");
	
}
}
