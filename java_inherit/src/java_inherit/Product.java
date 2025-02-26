package java_inherit;

public abstract class Product {//부모클래스
	protected boolean onOff=false;
	protected String brand;//브랜드
	protected int price;//가격
	protected String name;//제품명-lg
	
	public Product() {
		System.out.println("부모 클래스 생성");
	}
	public Product(String brand,int price,String name) {
		this.brand=brand;
		this.price=price;
		this.name=name;
	}
	public abstract void power();//추상메서드
	//자식클래스에서 오버라이딩하기 때문에
	//부모는 추상적인 메서드로 만들기만하면 된다.
	//추상메서드는 반드시 추상클래스에서만 가능 
	
	//추상클래스는 객체생성이 불가능 
	//추상클래스는 추상메서드를 가질수 있는 클래스이다
	//추상 메서드는 메모리의 크기를얼마나 할당해야하는지
	//측정이 불가능하기때문에
	//객체 공간할당이 안된다
	//객체 공간할당 받으려면 얼만의 메모리가 필요한지
	//측정이 되야한다.
//	public void power() {
//		onOff=!onOff;
//		System.out.println("전원:"+onOff);
//	}
	
	
	
}
