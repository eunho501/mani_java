package ja2025_01_24;

public class java20250124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//바이킹 탑승 -키가 140이상만 탑승
		int tall=163;
		
		//if 문에는 조건식이 반드시 if뒤에 붙어야한다.
		if(tall>=140) { //중괄호는 조건에 따라 실행될 내용작성
			System.out.println("탑승가능");
			System.out.println("키가140이상이다.");
			int a=10;
			a=132+2;
			
		}else {//else 조건식이 거짓일 경우 실행
			System.out.println("탑승불가");
		}
	
	//두숫자중 큰수는?
		int num1=35,num2=232312;
		
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		
		
		//철수와민수중 누구발이 더큰가
		int 철수=275,민수=260;
		if(철수>민수) {
			System.out.println("철수");
		}else {
			System.out.println("민수");
		}
	
	
		//편의점에서 도시락을 먹는데 가격이 5200원이다 
		//내 통장 잔액이 4530원이라면 얼마가 더 필요한가
		//잔액이 충분하다면 이체 x
		int money=5550000;
		int 도시락=5200;
		if(도시락>money) {
			System.out.println("이체"+(도시락-money));
		}else {
			
			System.out.println("이체X");
		}
	
	  //바이킹 답승조건 키가 140이상 190 이하만 가능
		if(tall>=140 && tall<=190) {
			System.out.println("탑승가능");
		}else {
			System.out.println("불가능");
		}
	
		//후룹라이드를  탑승하려면 키가130  이상이거나 몸무게45kg이상만가능
	 tall=125;
	 int wg=35;
	 if(!(tall<130 || wg<45)) {
		 System.out.println("탑승불가");
		 
	 }else {
		 System.out.println("탑승가능");
	 }
	 
	
	
	
	
	}

}
