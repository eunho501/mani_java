package interface4;

public class Light implements RemoteCon{

	@Override
	public void on() {
		System.out.println("불킴");
		
	}

	@Override
	public void off() {
	System.out.println("불끔");
		
	}





}
