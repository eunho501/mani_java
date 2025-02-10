package ja2025_01_24;

import java.util.Scanner;

public class java2025020555 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
//		for(초기값;조건식;증감식)
		//반복횟수가 정ㅎ래져있는 경우 for문이 가독성이 좋다.
		//반복횟수가 없는경우 while문이 가독성이 좋다.
//		int i=1;//초기값
//		while(i<=10) {//조건식
//			System.out.println(i);
//			i++;//증감식
//			
//		}
//			
		//21~~49-> *29+21
//		int com=(int)(Math.random()*50+1);
//		
//		while(true) {
//			System.out.print("정수입력:");
//			int num=sc.nextInt();
//			if(com==num) {
//				System.out.println("정답");
//				break;
//			}
//			if (com>num)
//				System.err.println("up");
//			if(com<num)
//				System.out.println("down");
//		}
//		
//		
		//동전 앞면뒷면 맞추기 게임
		// 내돈이 바닥날때까지 게임진행
		System.out.println("당신의 돈은?:");
		int money=sc.nextInt();
		final int 판돈=1000;
		int win=0;
		
		while(true) {
			int coin=(int)(Math.random()*2+1);
			System.out.println("1앞면,2.뒷면");
			int user=sc.nextInt();
			if(user==coin)
			{	System.out.println("정답");
					win++; // 두줄이상인 경우는 괄호 작성해줘야된다 
			
			}else
				System.out.println("탱");
			money-=판돈;// 1번진행시 1000씩감소
			if(money<판돈)break;
		}
		System.out.println("내돈은:"+money);
		 System.out.println("정답몇번"+win);
		
		
		
		
	}

}
