package java_inherit;

public class Tv extends Product{//자식클래스 
	
	public Tv() {
		
		super();//부모클래스 생성자메서드가 반드시먼저 실행된다.
		System.out.println("자식클래스생성");
//		super();//부모클래스의 생성자 메서드 
		// super는 부모클래스의 객체를 의미한다.
		
	}
	public Tv(String brand,int price,String name) {
		super(brand,price,name);
//		super();
//		super.brand=brand;
//		super.price=price;
//		super.name=name;
	}
//오버라이딩 
//상속관계인경우, 인터페이스implements인 경우에 사용 
//성립조건 
//1.메서드의 원형은 그대로 유지
//2.내용만 변경한다.
//3. 상속또는 implements 인경우에만 가능
	
	@Override
public void power() {
	onOff=!onOff;
	System.out.println("tv전원:"+onOff);
}
	
}

//	boolean onOff=false;
//	public void power() {
//		//power 메서드 실행시 onOff가 false면
//		//true변경 true면 false로 변경하려면
//		//올바른 코드는?
//		onOff=!onOff;
//		System.out.println("전원:"+onOff);
//		if(onOff==false)
//			onOff=true;
//		else
//			onOff=false;