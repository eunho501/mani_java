package java_inherit;

public class javainherit {

	public static void main(String[] args) {
		Tv tv=new Tv("삼성",95000,"st60");
		Aircon air= new Aircon("캐리어",54000,"ca18t");
		Computer com=new Computer("삼성",173000,"매직");
		
		tv.power();
		air.power();
		com.power();
		
		
		
		
//		Tv tv=new Tv();
////		tv.onOff=true;//전원 on
//		tv.power();//전원on true
//		tv.power();//전원 off false
//		tv.brand="삼성";
//		tv.price=120000;
//		tv.name="oled st60";
//		
//		Computer com=new Computer();
//		com.onOff=true;
		
		
	}

}
/*
 * 상속- 클래스들의 관계를 부모- 자식관계로 설정한다.
       부모클래스의 변수  또는 메서드를 자식 클래스에서 사용가능하다.
       여러 클래스들의 공통요소를 부모클래스로 구성한다.
       예)TV,컴퓨터,냉장고,에어컨
       	 전기(파워),플러그,가격,브랜드,등등 
       	 가전제품 부모클래스에 파워,가격,브랜드를 정의한다.
       	 
       	 다형성- 다양한 형태 
       	 	TV t=new TV();
       	 	Computer com=new Computer();
       	 	가전제품 tv=new TV();
       	 	가전제품 com=new Computer();
       	 	
       	 	
       	 	
       	 css에서 글자색을 red 로 설정한다.
       	 <div id="a">
       	 	<div class="b"></div>
       	 	<ul class="c"></ul>
       	 	<p class="d"></p>
       	 </div>
       	
       	#a{color:red;} 나머지 색적용 
       
       
 */
