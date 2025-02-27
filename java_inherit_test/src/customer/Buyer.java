package customer;

import java.util.Date;

import Store.Fruit;

public class Buyer {
	private int money;
	private Fruit item; //구매한음료 또는 컵과일 저장 변수 
	private Date buyDate;
//	private String ctm1;
//	private String m;
	public Buyer() {}
	
	
	
	public Buyer(int money) {//Buyer 객체생성시 동작할 
							//생성자 메서드 
		this.money=money;
//		this.ctm1=ctm1;
//		this.m=m;
		
	}
	
	public Date getBuyDate() {
		return buyDate;
	}



	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}



	//set get 메서드 필요함 
	@Override
	public String toString() {
		return ("보유코인="+ this.money+"구매일:"+this.buyDate+"구매음료:"+this.item);
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
