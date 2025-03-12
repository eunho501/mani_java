package thread1;

public class MyThread extends Thread{
	//스레드를 생성하여 동작되게 하려면 run 메서드가 필요하다
	//기존의 프로그램(프로세스)의 기본 스레드는 main메서드 부터시작
	//새로 만들어준 스레드는 run 메서드부터 시작
	public MyThread() {}
	public MyThread(String name) {
		super(name);//부모클래스에 (Thread)에 닉네임저장 
	}
	@Override
	public void run() {
	 System.out.println("스레드시작");	
	 for(int i=1;i<=10;i++) {
		 System.out.println(i+this.getName());
		 try{Thread.sleep(1000);}catch(Exception e) {}
	 }
	}
	
	

}

//스레드 구현방법 
// 1.Tread 클래스 상속
// 2.Runnable 인터페이스 구형
// 3.