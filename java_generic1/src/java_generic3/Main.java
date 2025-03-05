package java_generic3;

public class Main {

	public static void main(String[] args) {
	
		SnackBox<포스틱> 박스1=new SnackBox<>();
		박스1.make(new 포스틱("포스틱",1500));
		
//		SnackBox<포스틱> 박스2=new SnackBox<>();
//		박스1.make((포스틱)포스틱2);
		Snack[] 과자배열= new Snack[] {
	new 예감("예감",1300),new 매운새우깡("매은새우깡",1400),
	new 매운새우깡("매운새우깡",1500)			
		};
		SnackBox<Snack>박스3=new SnackBox<>();
		박스3.make(과자배열[0]);
		SnackBox<Snack>박스4=new SnackBox<>();
		박스4.make(과자배열[1]);
		SnackBox<Snack>박스5=new SnackBox<>();
		박스5.make(과자배열[2]);
		
		
		
		
//	매운새우깡 매=new 매운새우깡("매운새우깡",1800);
//	포스틱 포=new 포스틱("포스틱",2400);
//	예감 예=new 예감("예감",4500);
//	
//	SnackBox<매운새우깡> 매운새우깡=new SnackBox<>();
//	매운새우깡.make(매);
//	SnackBox<예감> 예감=new SnackBox<>();
//	예감.make(예);
//	SnackBox<포스틱> 포스틱=new SnackBox<>();
//	포스틱.make(포);
	

	
	}

}
