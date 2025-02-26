package pay;

public abstract class Proces {
		protected int money;
		protected String payDate ;
		
		public Proces() {}	
		protected Proces(int m,String date ) {
			this.money=m;
			this.payDate=date ;
		}
		public abstract void processPay();
		
}
