package collection6;

import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		TreeSet<Integer> tree=new TreeSet<>();
		
		tree.add(35);tree.add(41);tree.add(29);
		tree.add(9);tree.add(15);tree.add(20);
		tree.add(56);tree.add(49);tree.add(11);
		tree.add(17);tree.add(89);tree.add(39);
		System.out.println(tree);
		System.out.println(tree.headSet(20));//20보다작은것
		System.out.println(tree.tailSet(20));//20보다 큰것
		
		//특정값 기준으로 작은  데이터 모두찾기-headSet
		//특정 값 기준으로 큰데이터 모두 찾기-tailSet
		
		System.out.println(tree.first());//첫번째값
		System.out.println(tree.last());//마지막값
		
		System.out.println(tree.higher(29));
		//higher- 해당값보다 큰값중에 가장 가까운거 찾기
		//가장가까운 수가 없다면 NULL값 나옴
		System.out.println(tree.higher(100));
		
		System.out.println(tree.lower(30));
		// lower -해당값보다 작은 값중에서 가장 가까운거 찾기
		
		System.out.println(tree.ceiling(37));
		//ceiling- 해당값 이상인 값중 가장가까운값
		//			해당값 포함해서 찾기때문에 입력한값이 나올수도있음
		System.out.println(tree.floor(17));
		//floor 해당값 이하인 값중 가장 가까운값
		// 		해당값포햄해서 찾기에 입력한값이 나올수있음
		System.out.println(tree.subSet(17,41));
		//subSet 범위지정하여 검색
		//	subSet(a,b)	a부터 b 전까지 검색 
		
	}

}
 