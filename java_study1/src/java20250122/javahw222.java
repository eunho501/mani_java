package java20250122;

public class javahw222 {

	public static void main(String[] args) {
		package java12132;

		import java.util.Scanner;

		public class java201010 {

			public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				System.out.print("알파벳입력");
				char alp=scan.nextLine().charAt(0);
				//아스키 코드에서 A -65(10진수	),a -97(10진수)
				for(char i='A'; i<='Z';i++	) {
						if(alp==(i+64)|| alp==(i+96)) {
							System.out.printf("알파벳 %c 는 %d번째 알파벳\n",alp,i);
							break;
						}
				}
//				int n1, n2,n3;
//				do {
//				n1=(int)(Math.random()*9+1);
//				n2=(int)(Math.random()*9+1);
//				n3=(int)(Math.random()*9+1);
//				
//				}while(!(n1 !=n2 && n1!=n3&&n2!=n3));
//				//3개의 숫지 중복없이 1~9중 하나를 가진다
//				while(true) {//숫자 맞출때까지 입력해야되니까 무한루프
//					System.out.println("숫자세개:");
//					int u1=scan.nextInt();
//					int u2=scan.nextInt();
//					int u3=scan.nextInt();
//					
//					int str=0, ball=0;//스트라이크 볼 표현 아웃은 계산으로 
//					//스트라이크 경우
//					if(n1==u1)str++;
//					if(n2==u2)str++;
//					if(n3==u3)str++;
//					//볼인경우
//					if(n1==u2 || n1==u3)ball++;
//					if(n2==u1||n2==u3)ball++;
//					if(n3==u1|| n3==u2)ball++;
//					System.out.printf("%d스트라이크 %d볼 %d 아웃\n",str, ball, 3-str-ball);
//					if(str==3)break; //3개의 숫자를 맞췄다면 끝
//				}
			}
	}

}
