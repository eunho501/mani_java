package java25_121;

public class java12121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	System.out.println("한줄에 하나씩 출력");
    
	System.out.print("한줄에 이어서 출력");
     System.out.print("그다음에 이어서 출력");
    
     
     System.out.printf("그냥 print 처럼 사용");
     
     System.out.printf("println 처럼사용하려면 \n");
     System.out.printf("다음줄에 출력 \n");
//     \n enter
     System.out.printf("%d",100);
     //printf에서는 % 오류 %%를 두번해야 오류안뜸
     //형식 지정자를 사용하기 위해 주의할것 
     //1.형식지정자와 데이터 위치를 맞춰야한다.
     System.out.printf("%d %f",100,3.14);
     
     //2.형식 지정자와 데이터 갯수맞추기
     System.out.printf("%d %d %d",10,20,30);
     /* %d 서식문자 형식지정자 (서식문자)
     %d,%i- 10진수 정수
     %f-10진수 실수
     %c-문자
     %s-문자열 
     %b-boolean 타입 
     *
     */
     System.out.println(2025+"년"+1+"월"+25+"일");
     System.out.printf("%d년 %d월 %d일 \n",2025,1,21);
     
     float fnum=5.12345f;
     System.out.println("println 출력:"+fnum);
     System.out.printf("printf 출력 %f \n",fnum);
     System.out.printf("printf 출력 %.1f \n",fnum);
     //                            %뒤에.1 이면 소수점 1자리까지 출력
     
     int num=15;
     System.out.println(num);
     System.out.printf("%d\n",num);
     System.out.printf("%10d\n",num);
     //ex)10이면 10자리를 확보하고 오른쪽에정렬    자리수지정
     //-를 붙이면 왼쪽에 정렬 
     
     
     
     
     
     
     
     
     
	}

}
