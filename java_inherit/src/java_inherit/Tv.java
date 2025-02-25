package java_inherit;

public class Tv extends Product{//자식클래스 
	
	public Tv() {
		super();//부모클래스의 생성자 메서드 
		// super는 부모클래스의 객체를 의미한다.
	}
	public Tv(String brand,int price,String name) {
		super();
		super.brand=brand;
		super.price=price;
		super.name=name;
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