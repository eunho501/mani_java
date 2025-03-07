package java_collection2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // MemberDao 객체 생성 및 데이터 조회
        MemberDao dao = new MemberDao();
        ArrayList<Member> memberList = dao.select();

        // 전체 회원 목록 출력
        for (Member m : memberList) {
            System.out.println(m);
        }

        // 이메일로 아이디와 비밀번호 조회
        String email = "brown@gmail.com";
        for (Member mem : memberList) { // 올바른 위치로 이동
            if (mem.getEmail().equals(email)) {
                System.out.println("Member ID: " + mem.getMemberId());
                System.out.println("Password: " + mem.getPassword());
                break;
            }
        }
//        Object obj;
//        obj.equals(obj);
//		타입에 대해서도 비교하기때문에 동일한 타입으로 비교할수 있게 
//		email은 String 클래스타입이라 안된다. 그래서 
//Member 클래스 객체에 email을 담아서 비교되게한다.
//        Member 대상=new Member();
//        대상.setEmail(email);
//        for(int i=0;i<memberList.size();i++) {
//        	Member cmp=memberList.get(i);
//        	
//        	if( cmp.equals(대상)) {
//        		System.out.println("찾았");
//        		
//        	}
//        }
//       System.out.println(memberList.contains(대상));
       
       // memberList에 등록된 사람들중
       //장은호 생년월일과 같은 회원이 있나
        // 같은 회원이있나 
       Member 장은호=new Member();
       장은호.setBirth("19901221");
       장은호.setEmail("babo@daum.net");
       장은호.setMemberId("kkk1");
       System.out.println(memberList.contains(장은호));
       System.out.println(memberList.indexOf(장은호));
       
     
       System.out.println("apple".compareTo("bag"));
       
       Collections.sort(memberList);
       for(Member m:memberList){
    	   System.out.println(m.getId()+" "+m.getMemberId()+" "+m.getAge());
       }
//       for(int i=0;i<memberList.size();i++) {
//    	   Member cmp=memberList.get(i);
//    	   
//    	   if(cmp.equals(장은호)) {
//    		   System.out.println("찾음");
//    	   }
//       }
        
//        System.out.println(memberList.contains(email)
//        		);
        
    }
}