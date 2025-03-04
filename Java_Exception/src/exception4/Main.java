package exception4;

public class Main {

	public static void main(String[] args) {
		

		Member m1=new Member();
		Member m2=new Member();
		
//		m1.nameCount();
		m2.nameCount();
		try {
		int a=m1.getBirthYear();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
/*
 *	오류발생이 예상되는 코드에 try{}catch(){}	를 넣어준다
 *오류는 대부분 입력 계산 인덳스, 참조변수활용에 많이 발생한다
 * 이유 -> 사용자 조작과 밀접하기에 
 * 
 * try{}에서 발생한 오류는 catch로 넘어가게된다
 * catch에서는 오류에맞는 예외 클래스를 사용토록 하는게 좋지만
 * 어떤 오류가 발생할지 예상하기 어려운경우 부모 클래스로 받는것도 방법
 * try{
 * 코드1;
 * 코드2;
 * 코드3;
 * }catch(예외 클래스 클래스 참조변수){
 * 오류일 경우 사용자알림 메세지 
 * }
 * 
 * 예외를 강제 발생 시키기 (오류발생)
 * throw new 예외클래스("메시지)
 * 예외 던지기 
 * 메서드 이름뒤에 throws예외 클래스
 * 어떤 객체에 의해 오류가 발생했는지 확인하고자 할 경우
 * 메서드에서 예외던지기를 한다.
 */

