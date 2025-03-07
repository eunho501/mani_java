package java_collection2;

import java.util.ArrayList;

public class   Main {

	public static void main(String[] args) {
//		ArrayList<Member>list=new ArrayList<>();
//		list.add(new Member(1l,"jeh","bcb119","1234","123123"));
//		
//		list.add(new Member(2l,"dw","naver.","wkd21","00393"));
//		System.out.println(list);
		MemberDao dao=new MemberDao();
		ArrayList<Member> memberList= dao.select();
		
		System.out.println(memberList);
	}

}
