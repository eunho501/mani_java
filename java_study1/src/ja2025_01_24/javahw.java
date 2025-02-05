package ja2025_01_24;

import java.util.Scanner;

public class javahw {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("정수입력:");
		int	me=sc.nextInt();
		 while(me<1 || me>50) {
			 me=sc.nextInt();
		 }
		while(true) {
			int com=(int)(Math.random()*50+1);
			if(me==com) {
				System.out.println("정답");
				break;
			}
			if(com>me)
				System.out.println("down");
			if(com<me)
			System.out.println("up");	
			
			
		}
	}

}


