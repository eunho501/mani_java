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

public  class Member {
private Long id;//회원번호
private String memberId;//아이디
private String email;//이메일
private String password;//비번

private String birth;//생년월일 8자리
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

