package mavenjdbcm12;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallabaleStatementSelectUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
		CallableStatement callableStatement=connection.prepareCall("call selectUser(3)");
		ResultSet resultSet =callableStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getString("address"));
		}
		connection.close();
		System.out.println("Data deleted successfully with CS");
	}
}
