package java20250123;

import java.util.Scanner;

public class ja20250123 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("정수입력:");
//		int num=scan.nextInt();
		
		// 입력한 정수가 양수인지 음수인지,0인지 
//		String res=(num>0) ? "양수":	(num<0) ? "음수":"0이다";             //	
//		System.out.println(res);
		
		//바이킹을 타기위해서는 ㅁ키가 135이상이여야한다
		//바이킹 탑승여부를 출력 (키입력받기)
		
//		System.out.print("키입력:");
//		int tall=scan.nextInt();
//		
//	    String res=(tall>=135) ? "탑!승!":"탑!승!불!가!";
//	    System.out.println(res);
	    
//		System.out.print("1.파미향짬뽕 2.쿠켄돈까스 3.공주순대:");
//		int select = scan.nextInt();
//		
//		int price = (select ==1) ?9000:0;
//		price=(select==2)? 8000:price;
//		price=(select==3)? 6500:price;
//		
//		System.out.println("가격"+price);
		
		// 정수 3개를 키보드를통해 입력받기
		//세정수중 가장 큰 정수를 출력
		// 두개가 같은경우 3개가 같은경우 배제
//		System.out.println("정수입력1:");
//		int num=scan.nextInt();
//		
//		System.out.println("정수입력2:");
//		int num2=scan.nextInt();
//		
//		System.out.println("정수입력3:");
//		int num3=scan.nextInt();
//		
//		int big=(num>num2)? num:0;
//		big=(num2>num3)? num2:num3;
//		System.out.println("큰:"+big);
		System.out.print("세정수 입력:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		int max=(num1>num2)? num1:num2;
		max=(max>num3)?max:num3;
		System.out.println("가장큰수:"+max);
		
		
		
		
		
		
//		// TODO Auto-generated method stub
//       // 조건연산자 
//	   //(조건식) ? 참일경우 실행내용 : 거짓일 경우 실행 내용;
//		String result=(1>5) ? "5보다크다" : "5보다작다";
//		System.out.println(result);
//		
//		int age = 16;
//		
//		int price = (age < 19 ) ? 1000: 1500;
//		System.out.printf("나이: %d살, 버스요금:%d원\n",age,price);
//		
////		int a=0;
////		int b= (age <15) ? a=1000: 1500; 안되는것은 아니고 나중에		
//		
//		
//		System.out.print("첫번째숫자:");
//		int num1 = scan.nextInt();
//		System.out.print("두번째숫자:");
//		int num2= scan.nextInt();
//		
//		int res =(num1>num2) ? num1:num2;
//		//조건식이 참이라면 res=num1 수행
//		//조건식이 거짓이라면 res=num2 수행
//		System.out.println("두 숫자중 큰숫자는:"+res);
//				
//		//두숫자를 입력받아서 두수가 같으면 같다 다르면 같지않다.
//		System.out.print("첫번째숫자:");
//		int num3= scan.nextInt();
//		System.out.print("두번째숫자:");
//		int num4= scan.nextInt();
//		
//		String res2= (num3==num4) ? "같다":"같지않다";
//		System.out.println(res2);
//	    
	}
	

}


//사칙연산자: + , - , * , / , %
//복합대입연산자:+=, -=, /=, *=, %=
// a= a+123; -> a+=123;
//증감연산자: ++, -- 
//비교연산자: 비교연산자를 통해 조건식을 만든다. 조건식은 참또는 거짓의 결과 
// 같다 == , 같지않다 !=
// 논리 연산자: &&(and), ||(or) , !(not)
// 논리연산자는 참이나 거짓을 가지고 연산한다.
// a>6 && (b<4 && b>0 || c>10)