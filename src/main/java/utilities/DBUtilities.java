package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilities {

	//create private static object of connection class
		//it used to create connection with database
		private static Connection conn;
		//creating private static object of Statement class
		//it used to create a Statement to execute the query
		private static Statement stmt;
		//creating private static object of resultSet class
		//it is used to create a resultset to store query result
		private static ResultSet resultSet;
		//create db url
		//syntax db url connection or db url string
		//jdbc:typeofdatabase://host:port/databasename
		private static String dbURL="jdbc:postgresql://localhost:5432/dvdrental";
		//database user username
		private static String dbUserName = "postgres";
		//database user password
		private static String dbPassword = "root";
		
		
		public static void setupConnection () {
			try {
				conn=DriverManager.getConnection(dbURL,dbUserName, dbPassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void closeConnection() {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
		
			public static ResultSet runQuery (String query) {
				try {
					stmt = conn.createStatement();
					resultSet = stmt.executeQuery(query);
				}catch (SQLException e) {
					e.printStackTrace();
				}return resultSet;
			}
			
			public void writeResultToCSV () {
				
				
			}
}
