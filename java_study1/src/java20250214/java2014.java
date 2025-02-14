package java20250214;

import java.util.Scanner;

public class java2014 {

	
		  public static void main(String[] args) {
		         Scanner scanner = new Scanner(System.in);

		         while (true) {
		               
		               System.out.print("숫자를 입력하세요 (1~25): ");
		               int num = scanner.nextInt();
		               
		               int bingoCount = countBingo();
		               System.out.println("현재 빙고 개수: " + bingoCount);

		               if (bingoCount >= 3) {
		                   System.out.println("빙고!");
		                   break;
		               }
		             
		               }
		         

	}

}
