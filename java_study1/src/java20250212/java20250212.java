package java20250212;

public class java20250212 {

	public static void main(String[] args) {
		// 1차원배열 : 같은 타입의 변수가 연속적으로 이루어진 구조 
		// 2차원배열:   같은 타입의 1차원배열이 여러개로 이루어진 구조 
//		int q=10;
//		int as=20;
		
		 int[] a= new int[] {3,4,5};//1차원배열 -3의크기 
		 int[]b= new int[] {	1,20,60};//1차원배열 -3의 크기
		 int[]c= new int[] {23,98,54};//1차원 배열 3의크기 
//		 a반 학생의 성적 ->1차원 배열
//		1학년 전체 학생성적-> 2차원배열
		 
//		 int[][] abc=new int[2][3] // 뒤에있는 숫자는 1차원배열의 개수이다 3의 크기를 가진 배열이 2개 
		int[] [] abc=new int[][] {{1,2},{3,4}};
		System.out.println(abc[0][0]);
		
		int[][] arr= new int[3][4];//크기 3,4
	   arr[0][0]=10;
	   arr[0][1]=20;
	   arr[0][2]=30;
      arr[1][0]=40;
	  arr[1][3]=50;
	  for(int i=0;i<arr.length;i++) {
		  for(int k=0;k<arr[1].length;k++) {
			  System.out.println(arr[i][k]);
		  }
	  }
	  //1 차원배열-> 향상된 for문 :for(int a:array){ } 
	  for(int i=0;i<arr.length;i++) {
		  for(int num:arr[i]) {
			  System.out.println(num);
		  }
	  }
	  for(int[]tmp:arr) {// 
		  for(int num:tmp)
	  }
	}

}
