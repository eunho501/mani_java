package java20250210;

import java.util.Arrays;
import java.util.Scanner;

public class java20250211 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
	  int[] game=new int[25];
	  
	  //game배열에 값 채우기 
	  for(int i=0;i<game.length;i++)
		  game[i]=(int)((Math.random()*50+1));
	  //중복되지 않게 
	  
//	  System.out.println(Arrays.toString(game));
	  
	  //5줄 5칸
	  //첫번째 반복문은 줄바꿔주기용 
	  //두번째 데이터 출력
	  while(true) {
    for(int i=0;i<=4;i++) {//빙고판 출력부분 
    	for(int k=0;k<=4;k++) {
    		if(game[i*5+k]==0)
    			System.out.printf(" %2s ", "■");
    		else
    		System.out.printf("  %2d" ,game[i*5+k]	);
    	}
    	System.out.println();
    }
    System.out.print("숫자입력:");
    int num=scan.nextInt();// 빙고판에있는 숫자입력 
    
    for(int i=0;i<game.length;i++) {
    	if(game[i]==num) {//내가 입력한 숫자를 배열에서 찾기
    		game[i]=0;
    	}
    	}
    //빙고게임은 5줄빙고되면 게임종료
    //무한루프 안에 한줄빙고인지 두줄빙고인지 넣기
    }
	 
	  
    
    
    
    
    
    
    
	}

}
