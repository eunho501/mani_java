package java_innerClass;

public class Test {
	
	static int count=1;//클래스변수 (정적변수) 프로그램실행시 
	int age;//인스턴스변수 객체존재해야 사용가능 
	A a;
	static Dog d;
	
	
	Test(){
		a=new A();
	}
	
	static void origin() {// 클래스메서드 객체만들기전 
//		a.view(); 인스턴스들은 클래스메서드에서 사용불가 존재하는시간대가 다르기때문에
//		A bb=new A(); 오류 
		
		//정적 내부클래스 (static)
		static class Dog{
			int year;
			
		}
	}
	
	void setYear(int year) {
		 d=new Dog();
		d.year=year;
	}
	
	
	
	
	//인스턴스 내부클래스의 정의 = 외부클래스의 객체생성해야 사용가능  
	class A{
		int num;
		void view() {System.out.println("내부클래스 메서드");}
		
	}
	
	void innerVire() {
		this.a.view();
	}
	
	
	void setNum(int num) {
		this.a.num=num;
	}
	
	void sum() {
		int a,b;//지역변수  sum이라는 메서드를 호출해야 사용가능함                                                                                 
	}
	
	
	
}

///내부클래스 -클래스 내부에 만드는 클래스 
//내부 클래스는 여러개의 클래스와 관계를 맺는게 아니라 하나의 클래스와
// 상속또는 포함 관계를 맺을 경우에 사용하면 효과적이다.
//인스턴스 내부 클래스 외부 클래스 객체를 생성하고 사용
//정적 내부클래스 외부 클래스 객체없이 사용가능
//		외부클래스 static메소드를 이용해서 객체 생성및 사용권장
// 지역내부 클래스 메소드 내부에 클래스를 정의하고 해당 메소드 내부에서만 사용가능
//익명 내부 클래스 이름 없는 클래스
	//	메서드는 오버라이딩하여사용

/*
 *		static 변수 또는 메서드
 *			-> 프로그램 실행하면서 클래스가 메모리에 로드되면 공간할당
 *		인스턴스 변수또는 메서드
 *			-> new 연산자 통해 클래스의 공간을 생성해야 존재
 *		지역변수
 *		-> 메서드를 호출해야 생성
 *		
 * 순서: static변수 또는 메서드 ->인스턴스변수 또는 메서드 ->
 * 		메서드호출 해야 지역변수 생성 
 * 
 */


