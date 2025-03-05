package java_generic2;

public class Main {

	public static void main(String[] args) {
//		Bottle<String> bl=new Bottle<String>();
		//Bottle 클래스의 제네릭 타입으로 String지정
		//String item으로 변경
		//make메서드의 매개변수 String item으로변경
//		bl.make("레몬소주");
		Bottle<Soju> 참이슬=new Bottle<>();
		//보틀글래스 내부에서 소주를 가질수있게해줌 
		
		Soju sj=new Soju("참이슬","진로",16);
		Wine wn=new Wine("소비뇽","프랑스",13);
		Makgeolli mg=new Makgeolli("원막걸리","국순당",6);
		
		참이슬.make(new Soju("참이슬","진로",16) );
		
		Bottle<Wine> 소비뇽=new Bottle<>();
		소비뇽.make(new Wine("소비뇽","프랑스",13));

		Bottle<Makgeolli> 원막걸리=new Bottle<>();
		원막걸리.make(mg);
		
		Bottle<Alcohol> 소주병=new Bottle<>();
		소주병.make(sj);
//		Bottle<Toy> 피니핑=new Bottle<>();
//		피니핑.make(new Toy());
		sj.a();
		
		소주병.make( sj);
		Service 명준=new Service();
		명준.drink(참이슬);
		
		Service 수영=new Service();
		수영.drink(원막걸리);
			
	}

}
//제네릭 클래스내부에 사용할 타입을 외부에서 지정하는 방법
// Member<Admin> a= new Member<>();
//->Member 클래스 내부에서 Admin이라는 타입을 사용한다.
//Member 쿨래스는 class Member<T>로 정의 되어있어야한다
// 클래스 내부의 인스턴스 변수나 인스턴스 메서드의 매개변수타입 또는 
// 반환타입을 제네릭 타입으로 표현가능하다 .
//Member<Admin>a= new Member<>()은 Admin클래스의 객체 생성이 아니다
// Member 클래스의 객체생성이다.
//제네릭을 사용하는 클래스인경우 해당 클래스의 참조변수들은 Member<Admin>까지를
//타입으로 인지한다
//제네릭에서는 상하관계가 없다(제네릭타입 으로 부모클래스나 
//자식클래스를 사용해도 대입연산이 이루어지지않는다.
//제네익을 사용하므로 타입에대한 예외 상황을 방지할수있다
//(컴파일 과정에서 발생할수 있는 오류 최소화)
//제네릭 사용 범위제한은 extends 와 super이다.
//메서드에만 제네릭 사용되는 경우 와일드카드(?)를 사용하는게
//여러타입처리가능 
//와일드 카드의 범위한은 extends super이다.
