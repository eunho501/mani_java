package thread1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Dino[]알=new Dino[] {
		new Dino("티라노사우르스",10),
		new Dino("밸로시랩터",4),
		
		new Dino("프테라노돈",6),
		new Dino("스테고사우르스",7)
		};
		
		Create device1=new Create();
		device1.start();
		//부화시킬 공룡을 선택하여 부화 진행 할것이다
		// 스레드를 통해 각 공룡별 시간만큼 동작하도록 할것이다
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<알.length;i++) {
			System.out.println("1~4 중에하나 :");
			
			int select =sc.nextInt();
			Create.hatch(알[select-1]);
		
		}
		
		
		
		
		
		
		
		
		
		
		
//		
//		MyThread th1=new MyThread("장은호");
//		th1.start();
//		MyThread th2=new MyThread("김명준");
//		th2.start();
////		Test t=new Test();
////		t.testfor();
//		for(int i=1;i<=10;i++) {
//			System.out.println("main메서드");
//			try{Thread.sleep(1000);
//			
//			}catch(Exception e) {}
//		}
	}

}

//스레드
/*  프로세스란-운영체제 윈도우 같은거 에서 프로그램을 실행시키는 단위
 * 	운영체제에서 프로그램을 실행 시키려면 관리가 필요하다.
 * 	운영체제에 의해서 프로그램이 실행되는 것이고 각 프로그램의 
 * 	메모리는 운영체제로 부터 할당받아 사용하게된다
 * 	모든프로세스는 고유한 아이디를 가지고있다
 * 	이런아이디를 프로세스라고 한다 
 * 
 * 	스레드란 
 * 	프로세스의 명령처리 단위 
 * 
 * 	원 스레드 장점 
 * 		-컴퓨터 자원 소모 감소 
 * 		-컴퓨터 처리량 증가 
 * 		-오류관리 
 * 		-명령코드 실행에서 충돌방지 
 * 		-오류가 발생 해도 예외처리가 쉽다.
 * 		
 * 		멀티 스레드 장점 
 * 			-cpu코어 컨텍스트 스위칭값 감소 
 * 			-데이터 주고 받는것이 간단해짐	
 * 			-응답시간 단축 
 * 			-네트워크 환경에 적합
 * 		
 * 
 * 		스레드의 생명주기 
 * 		1.new (스레드생성)
 * 		2.runnable 상태(실행준비)
 * 		3.running 상태 ( 실행) 
 * 			-wait, sleep, suspend에 걸리면
 * 		-> 대기상태 
 * 		-대기상태에서 resume,notify,sleeptime up에 의해 
 * 		->실행 준비상태로 변경 
 * 		4.terminated 상태 (소멸)
 * 		
 * 			
 * 
 */

		