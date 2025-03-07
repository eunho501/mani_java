package java_collection2;

import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao extends DbConnect{
	//테이블에서 테이터가져오기
	public ArrayList<Member> select() {
		String sql="select * from member1";
		ArrayList<Member>list =new ArrayList<>();
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
			Member m=new Member(rs.getLong("id"),
			rs.getString("member_id"),rs.getString("email"),
			rs.getString("password"),rs.getString("birth"),(int)(Math.random()*21+20));
			
			list.add(m);
			
			}
		}catch(SQLException e) {
			System.out.println("member1 전체조회실패");
		}
		return list;
		
	}
}
