package java20250203;

import java.util.Scanner;

public class java202502031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     int user=0 , coin=0;
//     System.out.print("1앞,2뒤:");
//     user= sc.nextInt();
//     
//     coin=(int)(Math.random()*2+1);
//     
//     if(coin == user) {
//    	 System.out.println("정답");
//    	 }else {
//    		 System.out.println("오징어답");
//    	 }
	//Math.random()은 0.00000~부터 0.999999~까지이다.
	// 곱하기 계산과 더하기 계산으로 범위를 지정 할수있다.
//   int num =(int)( Math.random()*10)+1;
//     System.out.println(num);
     //컴퓨타가 동전을 15개 가지고있다
     // 컴퓨타가 제시한 동전갯수가 짝인지 홀인지 맞추는 게임을 만드세요
//     System.out.print("1.짝,2홀그레인:");
//     user= sc.nextInt();
//     
//     int com=(int)(Math.random()*15+1);
//     
//     if(com%2==0 && user==1) {
//    	 System.out.println("짝 정답");
//    }else if(com%2==1 && user==2) {
//    	System.out.println("홀그레인 정답");
//    }else {
//    	System.out.println("떙");
//    }
//     
     //주사위게임(육면체)
     //컴퓨터가 주사위를 던진다.
     // 주사위값이 3이하라면 작은값, 주사위 값이 4이상이라면 큰값이다 
     //1. 작다 2.크다 
     //주사위값이 작은지 큰지 맞추세요
     System.out.println("1.작다,2.크다");
     user=sc.nextInt();
     
     int dice=(int)(Math.random()*6+1);
     // if(user==1 || user==2  
     if (dice<=3 && user==1 ) {
    	 System.out.println("작다");
     }else if(dice>=4 && user==2) {
    	 System.out.println("크다");
     }else {
    	 System.out.println("잘못된값");
     }
     
     
     
	}

}
