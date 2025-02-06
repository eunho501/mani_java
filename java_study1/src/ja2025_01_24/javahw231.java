package ja2025_01_24;

import java.util.Scanner;

public class javahw231 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int total=0;
		int me;
		int com;
		System.out.println("31게임");
		while(total<31) {
			System.err.println("숫자"+total);
			System.out.println("몇개입력");
			me=sc.nextInt();
		while(me<1 || me>3) {
			System.out.println("숫자제시");
			me=sc.nextInt();
		}
		}
		
		while(total<31) {
			System.out.println("숫지"+total);
			int com=(int)(Math.random*30+1);
		}
	}

}
