package java_collection1;

import javax.management.RuntimeErrorException;

public class MyArray {
	int[] a=new int [] {1,2,3,4,5}	;
	//배열에 정수를 추가로 저장할수 있게 하기 
int[] arr;
//정수추가 메서드 
public void add(int num) {
	
	if(arr==null) {
		arr=new int [1];
		
	}else {
		int[] temp=new int[arr.length+1];
		for(int i=0; i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
	}
	arr[arr.length-1]=num;
	
}

//인덱스 지정하여 정수 출력메서드
public int get (int index) {
	
	if(arr.length-1<index)
		throw new RuntimeException("인덱스범위초과");
	
	return arr [index];
	
	
}

}
