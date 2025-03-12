package thread1;

public class Create extends Thread{
	public static Dino egg;
	
	
	public static void hatch(Dino dino) {
		egg=dino;
	}
	@Override
	public void run() {
	while(true) {
		try {
			Thread.sleep(50);
		}catch(Exception e) {}
		if(egg!=null) {
			System.out.println("부화시작");
			try {
			Thread.sleep(egg.getTime()*1000);
			}catch(Exception e) {}
			System.out.println(egg.getName()+"공룡태어남");
			egg=null;
		}
	}
	}
}
//스레드에서 처음 실해외는 메서드가 run이다.
//즉 run메서드가 종료되면 스레드 사라짐