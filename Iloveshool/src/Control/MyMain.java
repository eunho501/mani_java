package Control;
import Service.MemberService;
import Service.SchoolService;
import java.util.HashMap;
import java.util.Scanner;

import Service.ActiveService;

public class MyMain {
	private static Scanner sc=new Scanner(System.in);
		private static int menu() {
			System.out.println("\n\n=========메뉴==========");
			System.out.println("1.로그인");
			System.out.println("2회원가입");
			System.out.println("3.종료");
			System.out.println("선택");
			int num=sc.nextInt();
			return num;
		}
		public static int subMenu(SchoolService schoolService,String id) {
			System.out.println("\n=====아이러브스쿨======\n");
			System.out.println("1.학교찾기");
			System.out.println("2.동창회");
			System.out.println("3.소모임");
			System.out.println("4.종료");
			System.out.print("선택:"	);
			
			int num=sc.nextInt();
			if(num==1) {
				schoolService.searchSchool(id);
			}else if(num==2) {
				schoolService.myReunion();
			}else if(num==3) {
				schoolService.smallGather();
				
			}else {
				return 0;
				
			}
			return subMenu(schoolService,id);
		}
	public static void main(String[] args) {
	//서비스 클래스들을 통해 로그인과 학교찾기를 할것이다
		MemberService memberService =new MemberService();
		SchoolService schoolService=new SchoolService();
		// 메뉴
		while(true) {
			switch(menu()) {
			case 1:
				String id= memberService.signIn();
				if(id !=null){//로그인성공
					subMenu(schoolService,id);
					return;
				}else
					System.out.println("잘못된 아이디비번");
				break;//로그인
			case 2:
				memberService.signup();
				break;//회원가입
				
			case 3://종료
				
			 return;
			 default:
				 System.out.println("잘못선택");
			}
		}
		
		
		
	}

}
/*
 * int fac(int a){
 *      return a*fac(a-1);
 *    }
 *    fac(5);
 *    a->5
 *    return 5*fac(5-1);
 *    fac(4)
 *    a->4
 *    return 4*fac(4-1);
 *    fac(3);
 *    a->3
 *    return 3*fac(3-1);
 *    	a->2
 *    return 2*fac(2-1);5번째
 *    a->1
 *   return 1;
 *   
 *		float aa(int b){
 *		
 *			if(b>5)
 *			aa(b-1)
 *			return b/2.0;
 *}
 *       aa(6);
 *       
 *       int i=7;
 *       for(; i>5;i--);
 *       
 *       int sum=0;
 *       for(int i=1;i<=5;i++){
 *       sum=sum+1;
 *       }
 *       System.out.println(sum);
 *       
 *       int sum(int a){
 *       	if(a==1)return 1; 
 *       	return a+sum(a-1);
 *       
 *       }
 *       
 *       syso(sum(5));
 *       
 *       
 *
 *
 *
 *
 *
 * 
 * */
