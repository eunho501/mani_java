package java2025022020;

public class Member {
		String userId;// 아디
		String passWord;//비번
		long id;//회원번호
		Member(){}
		Member(String userId,String paasWord,long id){
			this.userId=userId;
			this.passWord=passWord;
			this.id=id;
		}
	public	String toString() {
			return "아이디:"+this.userId+
					"비번"+this.passWord+"회원번호"+this.id	; 
		}
		
		
		
		void output() {
			System.out.println("아이디:"+this.userId+
			"비번"+this.passWord+"회원번호"+this.id	         );
		}
		
		
}
