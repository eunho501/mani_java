package testMain;

public abstract class Shapes {

	protected int height;//높이
//	protected int bowel;//밑변
	protected int width;//지름
	public Shapes() {}	
	protected Shapes(int w,int h) {
		this.width=w;
		this.height=h;
	}
	public abstract void draw();//추상메서드

	
	
	
	
	
}
