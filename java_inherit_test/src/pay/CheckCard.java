package pay;

public class CheckCard extends Proces{
	public CheckCard(int m,String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("체크카드"+this.money+"결제일"+this.payDate);
	}

}
