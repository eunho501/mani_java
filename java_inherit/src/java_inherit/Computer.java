package java_inherit;

public class Computer extends Product{
	
	public Computer() {}	
	public Computer(String brand,int price,String name) {
		super(brand,price,name);
	}
	
	
	@Override
public void power() {
	onOff=!onOff;
	System.out.println("com전원:"+onOff);
}
//		boolean onOff;
//		
//		public Computer() {
//			onOff=false;
//		}
}
