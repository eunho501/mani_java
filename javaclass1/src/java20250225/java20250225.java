package java20250225;

public class java20250225 {
	final void sum(int a, int b ) {
		//메서드에 final 하면 오버라이딩이 안된다
		//오버로딩은 새로운 메서드를 정의하는것이고 
		// 오버라이딩은 기존의 메서드를 내용만 재정하는것이다 
		//그래서 final 붙어있는 메서드는 변경 될수 없기에 오버라이딩 불가 
		System.out.println("내가 sum이다");
	}
	 void sum(int a) {
		 int tot =a+20;
		 System.out.println("아니야 내가 sum이야 ");
	 }
	public static void main(String[] args) {
		final int year=2025;//year 변수의 값 변경불가
		int aYear=2025;
		
		Game g= new Game();
		
		Movie m=new Movie();
	//private 제어자붙은 변수에 터이터저장은
	//생성자 메서드를 사용해서 변수 초기화
		
		
		
	}

}

/*
 *	자바클래스 제어자
 *	final -변하지않는 ,변경되지 않는변수
 *			메서드, 클래스
 * 	static - 클래스의 ,공통적인 이라는 의미로 사용된다.
 * 			모든 객체(인스턴스)들이 공통으로 사용할수 있는 변수또는 메서드
 * abstract- 추상적인
 * 			클래스 메서드사용 
 * 			추상 메서드를 가지고 있는 클래스는 추상 클래스가 되어야한다.
 * 			추상클래스는 객체생성불가 
 * 접근 제어자- public,default, protected,private
 * public- 자바 프로그램 어디서든 사용가능(패키지가 다른경우 import)
 * default- 같은 패키지에서만 사용가능 
 * protected- 같은패키지에서 사용가능,
 *    상속된 경우에는 패키지가 달라도 사용가눙
 * private- 오직 클래스 내부에서만 사용가능 
 *    
 *  
 * 
 */