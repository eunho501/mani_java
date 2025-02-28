package interface4;

public class Tv implements RemoteCon{

	@Override
	public void on() {
		System.out.println("tv 켬");
		
	}

	@Override
	public void off() {
	System.out.println("티비끔");
		
	}


}
