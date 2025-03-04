package exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//예외처리 코드 실행에 있어서 예외적인 부분을 러리하기 위한 방법
		// 예외적 상황이 발생하는것은 올바른 실행이 이루어 지지않아서
		//오류 또는 에러가 발생한다.
		//자바에서 예외처리는 오류에 대한 처리 이다.
		//예외처리는 오류를 해결하는 방법이 아닌 회피하는 방법이다 
		int a=10;
		Scanner sc=new Scanner(System.in);
		
		
		
		try {//오류가 예상되는 코드를 try{}에 작성한다.
		System.out.println("a변수 입력:");
		 a=sc.nextInt();
			System.out.println("나누기전");
		System.out.println(a/2);
		System.out.println("나누기후");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기하면 안돼 ");
			
		}catch(Exception i) {
			System.out.println("정수입력해");
		}
		//try 구문에서 오류가 발생하면 catch 구문이 실행된다.
		//catch 구문이 실행되려면 발생한 오류를 처리할수있는 클래스를 
		//가지고 있어야한다.
		System.out.println("프로그램종료");
	}

}

