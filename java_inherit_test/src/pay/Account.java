package pay;

public class Account extends Proces{
	public Account(int m,String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("계좌이체"+this.money+"결제일"+this.payDate);
	}

}
