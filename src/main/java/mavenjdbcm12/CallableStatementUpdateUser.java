package mavenjdbcm12;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementUpdateUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm12","root","root");
		CallableStatement callableStatement=connection.prepareCall("call updateUser(300,'anamikakeshri')");
		callableStatement.execute();
		connection.close();
		System.out.println("Data updated successfully with CS");
	}
}
