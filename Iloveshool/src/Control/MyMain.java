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
	public static void main(String[] args) {
	//서비스 클래스들을 통해 로그인과 학교찾기를 할것이다
		MemberService memberService =new MemberService();
		SchoolService schoolService=new SchoolService();
		// 메뉴
		while(true) {
			switch(menu()) {
			case 1:
				memberService.signIn();
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
