package com;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class DBConnection {
	static final String URL="jdbc:mysql://localhost:3306/";
	static final String DATABASE_NAME="test";
	static final String USERNAME="root";
	static final String PASSWORD="";
	
	public static Connection getConnection(){
		Connection con=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(URL+DATABASE_NAME,USERNAME,PASSWORD);
 
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
}