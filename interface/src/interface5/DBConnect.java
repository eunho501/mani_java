package interface5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {//.데이터베이스 연결작업
	private Connection conn;//계정 로그인상태
	private Statement st;//쿼리문 보내기위해
	private ResultSet rs;//받을때 필요 
	
	protected DBConnect() {
		connection();//db 연결 메서드
		
	}
	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String user="gle";
			 String password="1234";
			 String url="jdbc:mysql://localhost:3306/gle";
			 
			 conn=DriverManager.getConnection(url,user,password);
			 
			 
		}catch(Exception e) {
			System.out.println("드라이버 연결 실패 ");
			e.printStackTrace();
		}
	}
}
