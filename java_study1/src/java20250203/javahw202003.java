package java20250203;

import java.util.Scanner;

public class javahw202003 {

	 public static void main(String[] args) {
		   
		 Scanner sc = new Scanner(System.in);
		 System.out.println("1.가위 ,2.바위,3.보");
		   int user= sc.nextInt();
		   
		   if(user <0 || user>3) {
		      System.out.println("잘못된입력");
		      
		   }
		   
		   
		   int choices=(int)(Math.random()*2+1);
		   if(user== choices) {
		      System.out.println("비겼습니다");
		      
		   }else if (user==1) {
		      if(choices==2) {
		         System.out.println("패배");
		      }else {
		         System.out.println("승리");
		      }
		   }else if(user==2) {
		      if(choices==1) {
		         System.out.println("승리");
		      }else {
		         System.out.println("패배");
		      }else if (user==3) {
		         if (choices==1) {
		            System.out.println("패배");
		         }else {
		            System.out.println("승리");
		         }
		      }
		   }
		      
		    
		      
		   }

		}
