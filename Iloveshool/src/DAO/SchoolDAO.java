package DAO;

import java.util.ArrayList;

import VO.MySchool;
import VO.School;

public class SchoolDAO extends DBconnect{

	public ArrayList<School> searchSelect(String searchWord) {
		String sql="select * from school where school_name like"
				+"'%"+searchWord+ "%'";
		ArrayList<School>list=new ArrayList<>();
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				School data=new School(
		rs.getInt("id"),rs.getString("diff"),rs.getString("school_name"),rs.getString("address"),
		rs.getInt("post_code"),rs.getString("tel"),rs.getString("fax"),rs.getString("education_office"),
		rs.getString("public_private"),rs.getString("homepage")
						
						);
				list.add(data);
			}
			
		}catch(Exception e) {
			System.out.println("학교검색실패");
			e.printStackTrace();
			
			
			
			
		}
		return list;
	}

	public void saveData(String id, int schoolNum) {
	String sql="insert into my_school(member_id, school_id)"+" values('"+id+"',"+schoolNum+")";
	try {
		st =conn.createStatement();
		st.executeUpdate(sql);
	}catch(Exception e) {
		System.out.println("실패");
		e.printStackTrace();
	}
		
		
		
		// id변수는 로그인한 아이디이고 schoolNum은 선택한 학교번호(id)이다.
		//insert,delete,update는 executeupdate 메서드를 사용한다
		//결과에 없기에 ResultSet 으로 안받아도 된다
		//내가 선택한 학교번호가 테이블에 저장될수있게 saveData메서드 내용을 
		//완선
		
	}

	

}
