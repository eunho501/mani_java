package DAO;

import java.lang.reflect.Member;

public class MemberDAO implements Member{

	@Override
	public Class<?> getDeclaringClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getModifiers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isSynthetic() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean userIdAndPassword(String mId, String mPw) {
		//입력한 아이디와 비밀번호 테이블조회
		String sql="select*from member1 where member_id='"+mId+"' and password='"+mPw+"'";
		
		return false;
	}

}
