package java2025022020;

public class java202502022020 {

	public static void main(String[] args) {
		Member user1=new Member();
		user1.id=1001;
		user1.userId="sky";
		user1.passWord="1234";
		
		user1.output();
		
//		System.out.println(uer1.id);
		Member user2=new Member("gold","5432",1002);
		
		user2.output();
		String word=new String("이렇게한다");
		System.out.println(word);//원래는 word.toString()
								//자바 편의기능으로 안붙여도된다
	}

}