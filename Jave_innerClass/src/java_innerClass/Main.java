package java_innerClass;

public class Main {

	public static void main(String[] args) {
//		Test.A a=new Test.A();
		Test t=new Test();
		
		t.setNum(10);//내부클래스가 노출되지않음 
		t.innerVire();
		t.a.num=10;//내부클래스가 노출
		
		
		Test.A a=t.new A();
		a.num=10;
		
		//정적 내부클래스를 굳이 노출하면서 객체를 만들고자 한다면 
		Test.Dog dof=new Test.Dog();
		Test.origin();// 클래스 메서드실행은 객체없이 가능하다.
		

	}

}
