package pay;

import testMain.Shapes;

public class CreditCard extends Proces{
	
	public CreditCard(int m,String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("신용카드"+this.money+"결제일"+this.payDate);
	}
}
