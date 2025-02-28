package interface1;

public interface  Move {
	
	public void moving();//추상메서드 
	

	
//	public int num //인스턴스변수 선언불가 
//	public static int cnt=0;//클래스 변수선언은 가능
//	public final float pi=3.14f;//상수선언가능 
//	
//	public abstract void out();//추상메서드
//	public void sum();//추상메서드
}
//객체라하면 인스턴스변수또는 메서드의 공간이 존재하는것을 의미한다.
//인터페이스는 인스턴스변수 또는 메서드를 가질수 없고 객체를 생성못함
//부모 클래스가 가지고 있는 메서드중 
//자식이  변경하지 못하게할 메서드가 있다면 
//final 