package Store;

public class Banana extends Fruit {
	 public Banana(int cost,int capacity) {
		 super(cost,capacity);
	 }
	 @Override
	 public void makeJuice() {
		 System.out.println("바나나주수제조");
	 }
	 @Override
	 public void pieceFruit() {
		 System.out.println("바나나 세조각");
	 }
	 @Override
		public String toString() {
			return ("오랜지는 "+ cost+"원 " + capacity + "ml");
		};
}




















