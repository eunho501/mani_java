package java_collection5;

import java.util.LinkedList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
//		LinkedList<String>list=new LinkedList<>();
//		list.add("틀린그리므찾기");
//		list.add("벽돌깨기");
//		list.add("슈퍼매리오");
//		
//		list.contains("고인돌");
//		list.indexOf("벽돌깨기");
//		System.out.println(list.get(0));
		
		
		//스택 FILO구조이다 
		//웹 브러우저 히스토리 계산기 메서드 호출 등등
		//가장 나중에 들어온 데이터가 가장 먼저 나감 (LIFO = Last In, First Out)
		Stack<String>stack=new Stack<>();
		stack.add("김춘추")	;
		stack.push("리순신");
		stack.push("홍길돌");
		stack.push("김석진");
		stack.push("이정훈");
		stack.push("김미란");
				System.out.println(stack);
			
				
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}

}
