package java_inherit;

public class Aircon extends Product{
	public Aircon() {}	
	public Aircon(String brand,int price,String name) {
		super(brand,price,name);
	}
	@Override
public void power() {
	onOff=!onOff;
	System.out.println("Aircon전원:"+onOff);
}
	
	
	
}
//	boolean onOff;
//	{
//		onOff=false;
//		
//	}
//}