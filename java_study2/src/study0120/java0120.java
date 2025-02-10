package study0120;

import java.util.Scanner;
public class java0120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수= 데이터를 저장히가 위한 메모리공간 
		// 변수의 이름 = 데이터가 저장된 공간을 사용하기 위해 부여한 별명
		// 변순 선언 방법= 데이터타입 변수이름 (예- int num;)
		//저장할 테이터에 맞는 테이터 타입을 설정 해야한다.
		//변수 이름은 첫글자는 문자로 자바 예약어는 사용불가 
		
		
		
		//자바에서 결과로 출력하는 방법
		//syso ctr+스페이스
		//자바에서 키보드를 통해 데이터를 입력하는 방법
		//자바에서 입력하기 위한 순서
		// 1. 입력 객체 생성
		// 2. 입력 객체를 통해 데이터에 맞는 입력메서드 호출 
		
		
		// Scanner 변수이름 = new Scanner(System.In);
	    Scanner sc=new Scanner(System.in); 
		//     input 대신 sc 가능 
//	    out 출력 in 입력
//	     num이라는 변수에 정수 데이터 입력하여 저장하기 
	    //nextInt()가 정수 데이터 입력하기 위한 메서드이다 
//	    int num=input.nextInt();
	   System.out.print("정수입력:");
	    
//	    int num= input.nextInt();
//	.= 접근연산자 
	    // next (char)은 없음 
//	System.out.println("입력은 잘되었나"+num);
	
	//사각형의 너비와 높이를 키보드를 통해 입력받고 넓이를 계산하여 출력 
	
	
//	System.out.print("너비입렵:");
//	
//	int num=input.nextInt()
//	
//	System.out.print("높이입력:");
//		
//	int num2=input.nextInt()
//	
//			System.out.println("넓이="+num*num2);
//	
	
	int width=0,height=0;
	//노란선은 미사용 변수
	System.out.print("너비입력:");
	width=sc.nextInt();
	//println ln은 다음줄로 넘어간다 옆에 작성하기위해서는 print 사용
	System.out.println("높이입력:");
	height= sc.nextInt();
	int area= width*height;
	System.out.println("넓이:"+area);
	
	
	
	
	}
	
	
	

}
