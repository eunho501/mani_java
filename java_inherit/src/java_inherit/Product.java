package java_inherit;

public class Product {//부모클래스
	protected boolean onOff=false;
	protected String brand;//브랜드
	protected int price;//가격
	protected String name;//제품명-lg
	public void power() {
		onOff=!onOff;
		System.out.println("전원:"+onOff);
	}
	
	
	
}
