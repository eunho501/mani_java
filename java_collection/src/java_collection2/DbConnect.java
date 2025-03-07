package java_collection2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnect {
	public Connection conn;
	public Statement st;
	public ResultSet rs;
	public DbConnect(){
		connection();
	}
	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String user="gle";
			 String password="1234";
			 String url="jdbc:mysql://localhost:3306/gle";
			 conn=DriverManager.getConnection(url,user,password);
			 
		}catch(Exception e) {
			System.out.println(" 아버지는 택시드라이버 양화대교 그다리위를 건너가는 기분을 이제야 알았네 ");
			e.printStackTrace();
		}
		
	}
}
