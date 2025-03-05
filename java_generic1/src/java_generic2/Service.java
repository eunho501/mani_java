package java_generic2;

public class Service {
	public void drink(Bottle<? extends Alcohol> soju) {//알콜 섭취
	System.out.println(soju.item);
	System.out.println("한잔마신다");
		
	}
//	public void drink(Bottle<Makfeolli>mak) {
//		System.out.println(mak.item);
//		System.out.println("한잔마신다");
//	}
//	
}
