package java20250203;

public class class20250203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch 문
		//if 문
//		switch(메뉴선택) {
//		case 파일열기:
//		case 탄핵:
////		case 미사일발사:
//		if(10<5)
//			System.out.println("탄핵");
		
		
		
		
//		switch(3) {
//		case 1:
//			System.out.println("1선택");
//			break;//해당 제어문을 강제 종효 
//		case 3:
//			System.out.println("3선택");
//			break;
//		case 10:
//			System.out.println("씹선택");
//			break;
//			
//		}
//	
		int num=50;
		switch(num) {
		case 10:
			System.out.println("10선택");
			break;
		case 30:
			System.out.println("30 할껴?");
			break;
		case 20:
			System.out.println("case 에 표현하는 데이터는 정수 문자 문자열");
			break;
		case 50:
			System.out.println("입력된 값에 맞는 case실행은 +break또는 }까지 실행");
		  break;
		  default:
			  System.out.println("case에 없는 값이야 다시해 ");
		}
		
		int 점수=72;
		switch(점수/10) {
		case 10:
		case 9:
			System.out.println("a학점");
			break;
		case 8:
			System.out.println("b학점");
			break;
		case 7:
			System.out.println("c학점");
			break;
		}
		
		/* if(점수 <= && 점수>=90){
		 * "a학점"
		 * }else if(점수>=80){
		 * "b학점"
		 * }

		
		*/
	}

}
