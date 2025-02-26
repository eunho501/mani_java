package customer;

import Store.Banana;
import Store.Fruit;
import Store.Grape;
import Store.Orange;

public class Main {

	public static void main(String[] args) {
		//바나나와 포도 오렌지 갯수가 많이 필요하다면
		//바나나 15개 포도 6개 오렌지 54
	//다형성 - 하나의 타입으로 여러 타입을 다룰 수 있다.
	//상속 관계 , implements
	
		
	 Fruit f= new Banana(2500,500);
	 f.makeJuice();
	 Fruit g=new Grape(3500,400);
	 g.makeJuice();
	 
	 Fruit[]menu=new Fruit[10];
	 menu[0]=new Banana(2500,350);
	 menu[1]=new Banana(3000,400);
	 menu[2]=new Orange(3500,400);
	 menu[3]=new Banana(3500,500);
	 menu[4]=new Grape(4500,350);
	 menu[5]=new Banana(4500,550);
	 menu[6]=new Grape(5000,450);
	 menu[7]=new Orange(4000,350);
	 menu[8]=new Orange(5000,550);
	 menu[9]=new Grape(6000,600);
	 
	 menu[2].makeJuice();
	 menu[6].pieceFruit();
	 
	Buyer ctm1=new Buyer(10000);//구매자
//	for(int i=0;i<menu.length;i++)
	for(Fruit m:menu) {
		System.out.println(m);
	}
	System.out.println(ctm1);
//	System.out.println("보유금액:"+ctm1.getMoney());
	
		
		
		
//		Banana[]ba=new Banana[15];
//		ba[0]=new Banana(2500,500);
////		ba[0].makeJuice();
		//아직 banana객체가 없기에 null오류 
		
//		Grape[] gr=new Grape[6];
//		gr[0]=new Grape();
//		Orange[]or=new Orange[54];
//		or[0]=new Orange();
		
		

	}

}
