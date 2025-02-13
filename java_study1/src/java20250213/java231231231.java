package java20250213;

public class java231231231 {

	public static void main(String[] args) {
		// 문자열 메서드 (그나마 많이 쓰이는것?)
		
		
		String word="l like tomato";
		// 문자열에서 특정문자 추출
		
		System.out.println(word.charAt(7));//띄어쓰기 포함  문자추출
		
		//문자열에서 지정된위치 문자열 추출 
		System.out.println(word.substring(2));
		
		//2번인덱스에서 6번인덱스 전까지 5번까지 
		System.out.println(word.substring(2,6));
		
		String temp=word.substring(2,6);
		System.out.println( temp );
		//문자열의 길이 (전체문자가 몇개인가)
		System.out.println(word.length());
		
		
		String text="나랏말싸미 듕귁에 달아 문자와로 서르 사맛디 아니할세";
		
		//문자열에서 특정 문자 또는 문자열 인덱스 구하기
		int idx=text.indexOf("할");
		System.out.println(idx);
		
		idx=text.indexOf("문자와로");
		System.out.println(idx);
		
		//문자와로 부터 출력할떄
		
		idx=text.indexOf("문자와로");
		System.out.println(text.substring(idx));
		
		idx=text.indexOf("백셩이");
		System.out.println(idx);// 문자가 없다면 -1이나옴
		//indexof()메서드는 문자열에서 특정문자나 문자열의 인덱스를 알려주는데 
		//만약 문자열에 없는 값이라면 -1을준다.
		
		//indexof() 메서드를 통해 문자열에서 특정 문자나 문자열이 포함되어 있는지 알수있다.
		//포함여부 알수있는 메서드 !! 하나더!!
	
		//포함여부 판별은 contains
		System.out.println(text.contains("듕귁에"));
		
		//문자열비교 -equals() 문자열A.equals(문자열B)
		//결과는 true,false 
		
		
		//문자열 분할 문자열 ->배열  
		text="서경림-김현진-김미란-김석진-주동건-정수영";
		System.out.println(text.split("-")[3]);
		
		String[] names=text.split("-");
		System.out.println(names[4]);
		
		//배열-> 문자열로 변환 
		text=String.join(",", names);//name[0]+","+names[1]
		System.out.println(text);
		
		//대문자 소문자
		System.out.println(word);
		System.out.println(word.toUpperCase());//대문자 
		System.out.println(word.toLowerCase());//소문자
		
		
		//문자열 합치기 "abc"+"zxc"-> abczxc
		System.out.println("abc"+word);
		System.out.println("abc".concat(word));
		
		//String 클래스 타입의 변수가 비었나? (문자열이 저장되어있나?)
		System.out.println(word.isEmpty());//비어있으면 찐 비어있지않으면 거짓
		System.out.println(word.isBlank());//
		
		
		word="";
		System.out.println(word.isEmpty());//비어있으면 찐 비어있지않으면 거짓
		System.out.println(word.isBlank());
		
		word=" ";
		System.out.println(word.isEmpty());//공백은 취급하지않음
		System.out.println(word.isBlank());//공백도 채워져있는걸로 간주
		//empty는 문자열의 인덱스가 존재하지 않아야 true
		//blank는 띄어쓰기와 같이 빈공간인 경우에도 비었다는 표시 true
		System.out.println(word.length());
//		word=null;//null이 저장되어 있는경우 문자열 관련 메서드 전부사용불가 
//		System.out.println(word.isEmpty());
//		System.out.println(word.isBlank());
		
		//문자열 바꾸기 치환
	    word="김현진은 너구리를 좋아한다";
	    //replace("기존문자","바꿀문자")
	    System.out.println(word.replace("너구리", "강아지"));
		System.out.println(word);
		
		text=word.replace("너구리","강아지");
		
		System.out.println(text);
		
		word="010.1234.56789.4321";
		System.out.println(word.replaceAll("[0-4]","a"));
		
	/*정규 표현식
		
	. 임의의 문자 1개를 의미
	^ 시작을 의미 (^a:a 로 시작하는단어)
	& $앞의 문자열로 문자가 끝나는지를 의미(a$:a로 끝나는단어)
	[]  [] 괄호안의 문자가 있는지 확인해라 뜻 ([^a]:a 로 시작하는거 확인)
	[^]	[] 괄호안에  ^뒤의 문자가 있으면 제외해라 
	 [a-z] : a부터 z 까지 문자확인 
	 [^a-z]: a부터 z 까지 제외한 문자 		
    -  사이의 문자또는 숫자를 의미 ([a-z] : a부터 z까지의 문자 확인)
          [a-z0-9]: 알파벳소문자 전체, 0-9중 한문자  		
	| 또는 [a|h]
	() 그룹 01(0|1): 01뒤에 0또는 1
	{} 개수  a{3}b : a가 3번 나오고 뒤에 b가 있다 
		^\d{3}-\d{4}-\d{4}$ :전화번호 정규표현식 
	/d 0-9숫자
	\b 공백 탭 /를 의미 
	\B \b 의 부정 (공백 탭 등이 아닌문자)
	\D 0-9가 아닌것
	\w 알파벳 대소문자+숫자+"_" [a-zA-Z_0-9]
	
		*/
		
	word="tomato98731*";
	// 알파벳을 제외한 나머지를 0으로변경
	System.out.println(word.replaceAll("[^a-z]", "0"));
	// 알파벳 소문자를 제외한 나머지를 0으로변경ㅇ
	
	// 비밀번호 6자리 이상 12자리 이하  영어 소문자 숫자 포함
	//  [a-z0-9]{6,12}$
	
	
	//주민번호 확인
	// \d{6}\-[1-4]\d{6}
	
	String[] dept=new String[5];
	
	
	}

}
