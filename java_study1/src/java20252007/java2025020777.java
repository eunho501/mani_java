package java20252007;

import java.util.Scanner;

public class java2025020777 {

	public static void main(String[] args) {
		//문제...제제...제...제ㅔ..제제ㅔ...제ㅔㅈ...
		//*  
		//**	
		//*** 별을 위 같이 출력하시오 첫번째 줄이여서 별한개 두번째 줄이여서 두개
		// 2중 for문
//		for(int line=1;line<=3;line++) {
//			for(int star=1;star<=line;star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
//		for(int i=1;i<=3;i++) {
//			for(int k=1;k<=i;k++	) {
//				System.out.print("*");
//		}
//			System.out.println("");
//		}
		/*문제  5 
		 * 0123
		 * 4567
		 * 8 9 10 11             2중for문 	 
*/
//		for(int i=0;i<=2;i++) {
//			for(int k=i*4;k<=(i*4)+3;k++)
//				System.out.print(k+"");
//			System.out.println();
//		}
//		
	/*문제6번 비밀번호찾기
	 * 1.  비밀번호는 4자리로 구성되어있다 
	 * 2. 비밀번호 각각의 숫자는 1~9중하나이고 중복없다 
	 * 3.첫번째 숫자는 네번째숫자보다 2만큼크다.
	 * 4.두번째숫자는 세번째숫자보다 작다.
	 * 5.비밀번호와 비밀번호 역순의 숫자를 더하기하면
	 * 16566이다 예)1234+4321
	 * 6.위 조건을 모두 충족하는 비밀번호 출력
	 */
// for(int a=1;a<=9;a++) {
//	 for(int b=1;b<=9;b++) {
//		 for(int c=1;c<=9;c++) {
//			 for(int d=1;d<=9;d++) {
//				 if(a!=b && a!=c && a!=d &&b!=c&&b!=d&&c!=d) {
//					 if(a==d+2 && b<c) {
//						 int pw=a*1000+b*100+c*10+d;
//						 int rpw=d*1000+c*100+b*10+a;
//						 if((pw+rpw)==16566) {
//							 System.out.println(pw);
//							 break;
//						 }
//					 }
//				 }
//			 }
//		 }
//	 }
// }
//		
//문제 7 알파벳찾기 (반드시 반복문)
		//알파벳(대문자 또는 소문자 모두 가능하게)입력
		//입력한 알파벳이 몇번째인지 찾기 반드시 for문으로 
		Scanner sc = new Scanner(System.in);
		
		
//		for(int i=1;i<=4;i++) {
//				for(int k=0;k<=11;k++) {
//					System.out.print(k);
//			}
//		}
	}

}
