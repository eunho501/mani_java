package java20250210;

import java.util.Scanner;

public class java2025020201010 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		//7 개 정수를 저장할수 있는 배열을 선언하고 
//		// 정수7개를 입력한뒤 출력 
//		int[] arr=new int[7];
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(" 숫자입력");
//			 arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		int size=5;
		int[]age=new int[size];
		// 정적 배열은 지정된 크기를 변경하기 어렵다.
		// 프로그램실행시 컴파일 과정에서 배열의 크키가 정해져있어야
		// 그만큼 공간을 할당 받는데 배열의 크기가 확정되어 있지 않다면
		// 컴파일 과정엣거 공간을 할당받지 못한다.
		// 윈도우에 의해 필요한 만큼 대여 받는건데 정확한 
		// 크기가 없으면 대여 불가능 
		age[0]=10;
		System.out.println(age[0]);
		
	}

}
