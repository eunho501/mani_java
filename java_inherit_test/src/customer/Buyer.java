package customer;

import Store.Fruit;

public class Buyer {
	private int money;
	private Fruit item; //구매한음료 또는 컵과일 저장 변수 
//	private String ctm1;
//	private String m;
	public Buyer() {}
	
	
	
	public Buyer(int money) {//Buyer 객체생성시 동작할 
							//생성자 메서드 
		this.money=money;
//		this.ctm1=ctm1;
//		this.m=m;
		
	}
	//set get 메서드 필요함 
	@Override
	public String toString() {
		return ("Buyer money="+ money);
	};

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Fruit getItem() {
		return item;
	}

	public void setItem(Fruit item) {
		this.item = item;
	}
	



}
