package testMain;

public class Triangle extends Shapes{
	
	public Triangle(int w, int h) {
		super(w,h);
		
	}
	@Override
	public void draw() {
		System.out.println("지름이"+width+"인원을그린다");
	}
}
