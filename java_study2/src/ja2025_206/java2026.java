package ja2025_206;

import java.util.Scanner;

public class java2026 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		while(true) {
		System.out.println("1.가위 2.바위 3.보");
		int user=sc.nextInt();
		if(user>=1 && user<=3)break;
		}
		System.out.println("가위바위보 진행");
		
		
		
		//초기값 ->{내용}->조건식 비교-> 참이면 ->{내용}
//		int a=100;
//		do {
//			System.out.println("do~while문");
//			a++;
//		}while(a<15);
//		
//		
////		
//		int i=1;
//		int k=1;
//		while(i<=3) {
//			while(k<=2) {
//				System.out.println("i="+i+"     k="+k);
//				k++;
//			}
//			k=1;
//			i++;
//		
////		for(int i=1;i<=3;i++) {
//			int i=1;
//			while(i<=3) {
//				int k=1;
//				i++;
//			}
//			for(int k=1;k<=2;k++) {
//				System.out.println("i="+i+"k"+k);
//			}
		
	}

}
