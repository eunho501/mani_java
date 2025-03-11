package DAO;



public class MemberDAO extends DBconnect{

//	@Override
//	public Class<?> getDeclaringClass() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int getModifiers() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public boolean isSynthetic() {
//		// TODO Auto-generated method stub
//		return false;
//	}

	public boolean userIdAndPassword(String mId, String mPw) {
		//입력한 아이디와 비밀번호 테이블조회
		String sql="select*from member1 where member_id='"+mId+"' and password='"+mPw+"'";
		try {
		st =conn.createStatement();//쿼리문보낼수있게 statement생성
		rs=st.executeQuery(sql);//statement쿼리 보내고 결과받기
		if(rs.next()) {
			return true;//로그인성ㅅ공 했으니까 true
			
		}
		
		}catch(Exception e) {
			System.out.println("아이디비번실패");
			e.printStackTrace();
		}
		return false;
	}

}
