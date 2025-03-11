package Service;

import java.util.Scanner;

import DAO.MemberDAO;

public class MemberService implements ActiveService{

	public void signup() {
		System.out.println("회원가입완료");
		
	}
	private MemberDAO dao;
	public MemberService() {this.dao=new MemberDAO();}//DAo 객체생성 
	public String signIn() {
		Scanner scan=new Scanner(System.in);
		System.out.println("\n-------로그인--------");
		System.out.println("ID:");
		String mId=scan.nextLine();
		System.out.println("PW");
		String mPw=scan.nextLine();
		//로그인을 위해서 입력한 아이디와 비밀번호를 테이블에 조회한다.
		if(dao.userIdAndPassword(mId,mPw))
			return mId;//로그인 성공했다면 입력한 아이디 리턴
			
		return null;//로그인 실패시 null리턴 
		
		
		
		
		
	}

}
