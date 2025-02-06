package ja2025_206;

import java.util.Scanner;

public class java200606 {

	public static void main(String[] args) {
		/*문제 1 무한루프
		 * 정수 한개씩 계속입력받기 
		 * 입력하다가 0을 입력하면 지금까지 입력한 모든숫자의 합출력
		 * 문제 2 무한루프 
		 * 컴퓨터와 가위바위보 게임하기 
		 * 내가 10번을 이길때까지 계속 게임하기 
		 * 10번 이기면 그동안 몇번 패배 하고 몇번 비겼는지 출력
		 * 
		 * 
		 */
         Scanner sc=new Scanner(System.in);
        
//         int i=0;
//         while(true) {
//        	 System.out.println("정수입력:");
//        	 int user=sc.nextInt();
//        	 
//        	 if(user==0)break;
//        	i=user+i;
//        	  
//         }
//         
//        
//         System.out.println("입력값의합:"+i);
         
         System.out.println("1.가위 ,2.바위,3.보");
        int 누적승리=0;
        int 누적패배=0;
        int 누적비김=0;
        
        while(true) {
        	int user= sc.nextInt();

        	if(user==0) {
        		System.out.println("종료");
        		break;
        	}
        	if(user <1 || user>3) {
        		System.out.println("잘못된입력");
            
        	}
         
         
         int com=(int)(Math.random()*3+1);
         if(user== com) {
            System.out.println("비겼습니다");
            누적비김++;
         }else if (user==1) {
            if(com==2) {
               System.out.println("패배");
               누적패배++;
            }else {
               System.out.println("승리");
               누적승리++;
            }
         }else if(user==2) {
            if(com==1) {
               System.out.println("승리");
               누적승리++;
            }else {
               System.out.println("패배");
               누적패배++;
            }
         }else if (user==3) {
             if (com==1) {
                  System.out.println("패배");
                  누적패배++;
               }else {
                  System.out.println("승리");
                  누적승리++;
               }
            
         }    
         System.out.println("누적승리"+누적승리+"누적패배"+누적패배+"누적비김"+누적비김);
         

         }
}
}
