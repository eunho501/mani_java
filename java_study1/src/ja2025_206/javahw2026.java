package ja2025_206;

import java.util.Scanner;

public class javahw2026 {

	
		public static void main(String[] args) {
		      Scanner sc= new Scanner(System.in);
		     
		      int me=0, com=0, num=1;
		     while(true) {//31이 언제 나올지 모르니 무한루프로 전체를 반복한다 
		    	 System.out.println("숫자 몇개");
		    	 me=sc.nextInt();
		    	 //1-3사이 값입력했는지 체크하는 반복문 
		    	 System.out.println("나:");
		    	 for(int i=1;i<=me;i++) {
		    		 System.out.println((num++)+"");
		    		 if(num==32)break;
		    		 
		    	 }
		    	 if(num==32) {
		    		 System.out.println("내가젖소");
		    		 break;//while 종료
		    	 }
		    	 com=(int)(Math.random()*3+1);//1~3개중 하나
		    	 System.out.println("\n컴퓨터:");
		    	 for(int i=1;i<=com;i++) {
		    		 System.out.println((num++)+"");
		    		  if(num==32)break;
		    	 }
		    	 if(num==32) {
		    		 System.out.println("컴푸타 패배");
		    		 break;//while 종료 
		    	 }
		    	 
		     }
		      
		      
		      
		      
		      
//		      int total=0;
//		      int me;
//		      int com;
//		      System.out.println("31게임");
//		      while(total<31) {
//		         System.err.println("숫자"+total);
//		         System.out.println("몇개입력");
//		         me=sc.nextInt();
//		      while(me<1 || me>3) {
//		         System.out.println("숫자제시");
//		         me=sc.nextInt();
//		      }
//		      }
//		      
//		      while(total<31) {
//		         System.out.println("숫지"+total);
//		         int com=(int)(Math.random()*30+1);
//		         
//		      }

	}

}
