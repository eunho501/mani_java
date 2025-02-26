package Store;

public class Grape extends Fruit {
	public Grape(int cost,int capacity) {
		 super(cost,capacity);
	 }
	 @Override
	 public void makeJuice() {
		 System.out.println("포도주수제조");
	 }
	 @Override
	 public void pieceFruit() {
		 System.out.println("포도 20알");
	 }
	 @Override
		public String toString() {
			return ("포도는 "+ cost+"원 " + capacity + "ml");
		};
}
