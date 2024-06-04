package mavenjdbcm12;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementDeleteUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
		CallableStatement callableStatement=connection.prepareCall("call deleteUser(300)");
		callableStatement.execute();
		connection.close();
		System.out.println("Data deleted successfully with CS");
	}
}
