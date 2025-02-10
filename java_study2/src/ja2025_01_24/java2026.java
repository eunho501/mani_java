package ja2025_01_24;

import java.util.Scanner;

public class java2026 {
	
		Scanner scan=new Scanner(System.in);
		public static void main(String[] args) {
		System.out.println("컴퓨터버전");
		System.out.println("1~50하나");
		int number=scan.nextInt(); //내가 입력한 숫자를 컴튜터가 ㅁ맞춘다
		int max=50,min=1, t=50;//t 변수에 random t로 사용
	 while(true) {
		 System.out.println("랜덤범위:"+min+"~");
		 int com=(int)(Math.random()*t+min);
		 if(number==com) {
			 System.out.println("정답");
			 break;
		 }
		 if (number>com) {
			 System.out.println("up");
			 min=com+1;//업인경우 범위의 최소값 변경
			 t=max-com;//범위의 최대값에서 현재값 빼면*값나옴 
		 }
		 if(number<com) {
			 System.out.println("down");
			 max=com -1;//다운인 경우 범위의 최대값 변경
			 t=max-min+1; //범위의 최대값 -최소값+1 하면 *값나옴
			 
		 }
	 }
		ds
//   static Scanner sc = new Scanner(System.in);
//   public static void main(String[] args) {
//      System.out.print("정수입력:");
//      int   me=sc.nextInt();
//       while(me<1 || me>50) {
//          me=sc.nextInt();
//       }
//      while(true) {
//         int com=(int)(Math.random()*50+1);
//         if(me==com) {
//            System.out.println("정답");
//            break;
//         }
//         if(com>me)
//            System.out.println("down");
//         if(com<me)
//         System.out.println("up");   
//         
//         
//      }
//   }

}
}