package java2025022020;

public class java022020 {
	//메서드에 반환 값(출력값)이 없는 경우 void타입으로 작성한다.
	
	//메서드 정의 
	//반환과 매개변수 없는 메서드 형태
	// 외부 데이터도 필요없고 출력하는 값도 없기때문에
	//대부분 단순 출력용이 많다. 메뉴같은것들 
	//또는 클래스 객체의 메서드인 경우에도 반환과 매개변수없이 정의한다.
//	static void output() {
//		System.out.println("반환이 없는");
//		System.out.println("매개변수도 없는 메서드 ");
//		
//	}
//	//반환없고 매개변수 있는 메서드
//	//메서드의 내용을 실행하는데 필요한 데이터를 가지고 있지 않다면
//	//메서드 외부에서 데이터를 가져와야 한다.
//	static void sum(int num1,int num2) { //두정수의 합 구해서 출력까지 
//		System.out.println("합:"+(num1+num2));
//		
//		
//		
//	}
//	 static void sum(int num1, float num2) {
//		 System.out.println("합:"+(num1+num2));
//	 }
//	//반환이 있고 매개변수 필요없는 메서드- int num= scan.nextInt(); 
//	//매개 변수가 필요없기 때문에 자체적으로 필요한 데이터를 생성할 수 있거나 
//	//클래스 객체가 가지고 있는 인스턴스변수의 데이터를 가공 (계산같은것) 하여
//	//외부로 내보내기 위한 목적인경우 
//	 static int total() {
//		 int a=10, b=20,c=30;
//		 int tot=a+b+c;
//		 return tot;
//	 }
//	// 반환, 매개변수가 있는 메서드 name.equals("박문수");
//	 static String game(int val) {//1-가위 2-바위 3-보 
//		 if( val==1)
//		 return "가위";
//		 if(val==2)
//			 return "바위";
//		 if(val==3)
//			 return "보";
//		 return "잘못입력";//반환이 있는 메서드에서 if 문으로 return했다면 
//		 				// 참인경우에만 동작 할수있기 떄문에 별도의 retrun이 필요하다.
//		 
//	 }
	 // 두개정수중 큰값 출력하는거 만들기
	 //두 정수비교하고 출략하는 메서드 필요
	//반환없고 매개변수이;ㅆ는 메서드로 
//	 static void ex(int num1,int num2 ) {
//		 if(num1>num2)
//			 System.out.println("큰수:"+num1);
//		 else
//			 System.out.println("작은수"+num2);
//		 if(num1>num2) {
//			 System.out.println(num1);
//			
//		 }else {
//			 if(num1<num2) {
//				 System.out.println(num2);
//			 }
//		 }
	 
	 //국어점수 88 영어점수 91 수학점수 74
	 //세 과목 총점과 평균을 출력
	 // 총점계산하는 메서드, 평균계산메서드 
	 
	static int total(int k, int e, int m) {
		
		int tot=k+e+m;
		return tot;// 총점 내보내기 
		
		
		
	}
	
	static void avgCalc(int tot) {
		int avg=tot/3;
		System.out.println("평균:"+avg);
	}
	 
	
	 
	public static void main(String[] args) {
			int kor=88, eng=91,mat=74;
			int totScore=total(kor, eng, mat);
			System.out.println("총점:"+totScore);
			avgCalc(totScore);

//	      ex(20,30);
//		String res =game(1);//1은 가위이다 
//		System.out.println(res);
//		
//		
//		int num=total();
//			System.out.println(num);
//		output();//이렇게 작성해야 output메서드 실행된다.
//		//출력
//		System.out.println();
//		sum(10,20);
//		sum(40,50);
//		
//		float c=3.14f;  오류 
		
		
	}

}
