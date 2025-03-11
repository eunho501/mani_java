package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnect {
	protected Connection conn;
	protected Statement st;
	protected ResultSet rs;
	
	protected DBconnect() {
		connection();
	}
	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버로드실패");
			e.printStackTrace();
		}
		
		String user="gle";
		String password="1234";
		String url="jdbc:mysql://localhost:3306/gle";
		
		conn=null;
		try {
			conn=DriverManager.getConnection(url,user,password);
			
		}catch(Exception e) {
			System.out.println("db연결실패");
			e.printStackTrace();
		}
		
		
		
	}
}
