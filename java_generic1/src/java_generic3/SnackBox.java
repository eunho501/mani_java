package java_generic3;

public class SnackBox <T>{
	T 과자;
	public void make(T 과자봉지) {
		this.과자=과자봉지;
		System.out.println(this.과자);
		System.out.println("과자박스만들기");
	}
//	public T getMakeBox() {
//		return this.makeBox;
//	}
}
