package java_innerClass2;

public class Main {

	public static void main(String[] args) {
		LocalClass lc=new LocalClass();
		lc.getBirth();
	//지역내부 클래스는 해당 메서드를 호출해야 사용가능
		Item item=new Item();
		item.sale();
		
		Item shoes=new Item() {
			@Override
			public void sale() {
				make();
				System.out.println("신발팔매");
			}
		    public void make() {
		    	System.out.println("신발만들기");
		    }
		};//익명 클래스정의와 객체생성 
		//Item 클래스가 부모클래스가되고 익명클래스가 자식클래스
		shoes.sale();
	}
		Animal dog=new Animal() {
		@Override
		public void eat() {
			System.out.println("멍멍");
		}

		};
		
		
	}
@FunctionalInterface
	interface Animal{//Animal 인터페이스 정의
		public void eat();//추상메서드 

}
