package java20250122;

public class ja202501222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //증감 연산자  ++,--
	 int a = 10 , b = 10 , result=0;
	 //++
	 System.out.println("++ 전 :"+a);
	 
	 a++;
	 System.out.println("++ 후:"+ a);

	 ++a;
	 System.out.println("++a:"+a);
	 
	 
	 
	 //증감연산자의 위치가 변수앞, 변수뒤 차이 앞쪽에 붙으면 증가시킨뒤 출력
	 // 뒤에 붙으면 증가되지 않은채 출력 
	 a=10;
	 result=a++;
	 System.out.println("result=a++:"+result);
	 result= ++b;
	 System.out.println("result=++b:"+result);
	 //증감연산자를 변수앞에 붙이면 우선순위가 상위권
	 // 증감 연산자를 변수뒤에 붙이면 우선순위가 하위권
	 
	}

}
