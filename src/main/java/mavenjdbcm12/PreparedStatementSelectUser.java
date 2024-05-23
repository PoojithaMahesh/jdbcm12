package mavenjdbcm12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementSelectUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12?user=root&password=root");
//		3 create a statement
		Scanner scanner=new Scanner(System.in);
		System.out.println("please give your id");
		int id=scanner.nextInt();
		
	
		PreparedStatement preparedStatement=connection.prepareStatement("select * from user where id=?");
	    preparedStatement.setInt(1, id);

		
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
		}
		
		connection.close();
		System.out.println("data fetched successfully with PS");
	}
}
