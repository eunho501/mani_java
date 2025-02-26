package modifier;

import java_inherit.Product;

public class Microwave extends Product{//전자렌지
	
	public Microwave() {
		System.out.println(super.brand);
	}
	
	
	@Override
public void power() {
	onOff=!onOff;
	System.out.println("tv전원:"+onOff);
}
}
