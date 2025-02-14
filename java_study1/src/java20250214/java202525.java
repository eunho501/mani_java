package java20250214;

public class java202525 {

	public static void main(String[] args) {
//		String str = "member"; //String str = new String("member"); 객체의주소
////			System.out.println(str.charAt(0));
//		char[] c={'a'};//배열의주소 []가 붙어있다면 배열의 주소를 가진다
//		c[0]='a';
//		String[]names =new String[5];
//		names[0]=new String("박문수");
//		names[1]="김정호";
//		names[2]="박민호";
//		names[3]="이희승";
//		names[4]="권태우";
	//김미란이라는 사람이 등록이 되어있나?
//		boolean hasName=false;
//		for(String name:names) {
//			if(name.equals("김미란"))
//				hasName=true;
//			System.out.println(name);
//		}
		//배열 -> 문자열
//		String temp=String.join(","	, names);
//		//박문수,김정호,서경림,김명준,
//		boolean hasName=temp.contains("김미란");//contains
//		
//		if(hasName)System.out.println("이름등록");
//		else System.out.println("없는 사람임");
		
		//학과명,조교, 전화, 위치
		String[][]dept =new String[4][];//두번째 크기는 나중에 넣어주더라도 첫번째는 입력해야함
		dept[0]= new String[]{"컴퓨터공학과","정보과학과","정보통신공학과","정보산업공학과",
				"전자공학과","문헌정보과","전기공학과"};
		
		dept[1]=new String[] {"이지은","김영미","박순애","이춘애","이미선","김기범","박준용"};
		dept[2]= new String[] {"3333","3334","3335","3336","3337","3338","3339"};
		dept[3]= new String[] {"T101","T201","T301","T401","T510","T601","T701"};
		
		
		// 정보통신과학과의 과 사무실 위치와 조교의 이름은?
		String search="정보통신공학과";
		int idx=-1;
			for(int k=0;k<dept[0].length;k++) {
				if(dept[0][k].equals(search)) {
					idx=k;break;
				}
			
		}
	   if(idx==-1){//만약 학과가 존재하지 않으면 -1 값이 나온다 
		   System.out.println("등록되지 않은 학과");
	   return;// return은 메서드를 종료 시킨다 main메서드 종료되면 프로그램끝 
	
				
	}
	   System.out.println("조교:"+dept[1][idx]+",사무실:"+dept[3][idx]);	

}
}
//참조변수 : 특정 공간의 메모리 주소만 저장할 수 있는 변수
//참조 변수는 배열의 주소를 가지는 참조변수와, 객체의 주소를 가지는 참조변수
// 			배열의 주소를 가지고있는 참조변수는 참조변수 이름 [인덱스] 방식으로 사용 
// 			객체의 주소를 가지는 참조변수는 참조변수이름.xxxx 방식으로 사용 
//int a=10; 