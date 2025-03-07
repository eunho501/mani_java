package java_collection2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public  class Member implements Comparable<Member>{
private Long id;//회원번호
private String memberId;//아이디
private String email;//이메일
private String password;//비번
private String birth;//생년월일 8자리
private int age;
//컬렉션에서 contains, indexOf와 같은 비교하는 동작메서드
//사용하려면 사용자 정의 클래스에서는 equals를 구현해야 된다
@Override
public boolean equals(Object obj) {
//	Member temp =(Member)obj;
//	return this.email.equals(temp.email);
	Member temp =(Member)obj;
boolean isSame	=this.birth.equals(temp.birth);
isSame=isSame && (this.email.equals(temp.email));
isSame=isSame && (this.memberId.equals(temp.memberId));
	return isSame;
	
}

@Override
public int compareTo(Member o) {
	//정렬을 위한 compareTO메서드 구현
	// 정렬기준을 정해야한다 
	//
	
	return this.birth.compareTo(o.birth);//내림차순으로 하려면 자리를 바꾸거나 *-1
//	return o.birth.compareTo(this.birth); 내림차순 
}




//public Member() {}
//public Member(Long id, String memberId,String password,String email,String birth)
//{
//	this.id=id;
//	this.memberId=memberId;
//	this.password=password;
//	this.email=email;
//	this.birth=birth;
//}

}
//클래스정의 
//인스턴스변수의 접근 제어자는 private
// 인스턴스변수에 대해 get set 메서드 
//toString 메서드 만들기 

