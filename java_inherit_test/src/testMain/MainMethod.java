package testMain;

public class MainMethod {

	public static void main(String[] args) {
//		Rectangle re=new Rectangle();
//		Triangle tr=new Triangle();
//		Circle ci=new Circle();
		Circle c=new Circle(10,0);
		c.draw();
		Rectangle r=new Rectangle(10,41);
		r.draw();
		Triangle t=new Triangle(15,20);
		t.draw();
//		re.draw();
//		tr.draw();
//		ci.draw();

	}

}
