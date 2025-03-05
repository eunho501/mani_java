package java_collection1;

import java.util.ArrayList;

public class Main {

	public static <E> void main(String[] args) {
//	MyArray a=new MyArray();
//	
//	a.add(100);
//
//	a.add(20);
//	a.add(42);
//	a.add(52323);
//	a.add(234523);
//	a.add(4234);
//	System.out.println(a.get(5));
//	
		
	
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(2323);
		list.add("리순신");
		list.add("세종");
		
		System.out.println(list.size());
		//크기-데이터몇개 저장되어있는가 
		System.out.println(list.get(2));
		//인덱스 위치의 데이터출력
		System.err.println(list.indexOf("리순신"));
		//배열에 특정데이터 ㅇㄷ?
		list.remove(0);
		//인덱스를 지정하여 해당 데이터삭제
		list.remove("리순신");
		//삭제할 데이터입력 삭제
		System.out.println(list);
	}

	
}

/* 
 * 자바 컬렉션 프레임웤
 * 자료구조와 알고리즘을 클래스호 ㅏ시켜놓은것
 * 자료구조 데이터를 저장관리하느 방법
 * 알고리즘 저장된 데이터를 가종하는방법
 * 
 * Collection    Map
 *   List			HasMap
 *   				TreeMap
 *    ArrayList
 *    LinkdList
 *    vector
 *    Queue
 *   set
 *    HashSet
 *    TreeSet
 * 
 */

