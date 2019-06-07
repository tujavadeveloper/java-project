package vn.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

	public  Connection getConnection() throws SQLException, ClassNotFoundException {
		String hostName="localhost";
		String sqlInstanceName="DESKTOP-8BGQVL4\\\\SQLEXPRESS";
		String database="bthchuong2";
		String username="sa";
		String password="123";
		String connectionURL="jdbc:sqlserver://"+ hostName +":1433;" +";databaseName="+database+";" ;
	
		Connection conn=DriverManager.getConnection(connectionURL, username, password);
		return conn;
	} 
	
	
}