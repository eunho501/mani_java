package java20250210;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class java2025020201010 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		//7 개 정수를 저장할수 있는 배열을 선언하고 
//		// 정수7개를 입력한뒤 출력 
//		int[] arr=new int[7];
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(" 숫자입력");
//			 arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		final int size=5;
//		int[]age=new int[size];
//		// 정적 배열은 지정된 크기를 변경하기 어렵다.
//		// 프로그램실행시 컴파일 과정에서 배열의 크키가 정해져있어야
//		// 그만큼 공간을 할당 받는데 배열의 크기가 확정되어 있지 않다면
//		// 컴파일 과정엣거 공간을 할당받지 못한다.
//		// 윈도우에 의해 필요한 만큼 대여 받는건데 정확한 
//		// 크기가 없으면 대여 불가능 
//		age[0]=10;
//		System.out.println(age[0]);
//		
//		int[]sum=new int[3];
//		int[]a=new int[] {10,20,30};
//		int[]b=new int[] {1,5,9};
//		//a .배열과b 배열의 합을 sum에 저장
//		sum[0]=a[0]+b[0];
//		sum[1]=a[1]+b[1];
//		sum[2]=a[2]+b[2];
//		
//		for(int i=0;i<sum.length;i++) {
//			sum[i]=a[i]+b[i];
//		}
		//a와 b배열의 데이터를 total배열에 저장하기
		// a 배열의 값먼저 저장하고 이어서 b 배열의값 저장될수 있게 
		//저장한뒤에 total 배열값 출력
		//결과 10 20 30 40 50 55 44 33 22 11
		
//		int[]total=new int[10];
//		int[]a=new int[] {10,20,30,40,50}	;
//		int[]b=new int[] {55,44,33,22,11};
//		
//		for(int i=0;i <a.length; i++) {
//			total[i]	=a[i];
//		}
//		for(int i=0;i<b.length;i++) {
//		total[i+5]=b[i];
//		
//		}
//		for(int i=0;i<total.length;i++) {
//			System.out.println(total[i]);
//		}
//		
//		char[]name=new char[5];
//		name[0]='j';
//		name[1]='o';
//		name[2]='h';
//		name[3]='n';
//		//name -> john 문자로 저장  배열로 만들어짐 
//		//문자열은 배열이지만 char 배열로는 온전한 문자열 입력이 어렵다
//		// 배열이기때문에 인덱스를 통해 문자하나씩 입력 저장해야된다.
//		//그래서 자바에서는 문자열의 사용을 편하게하기위해
//		// string 클래스가 존재한다.
//		//string 클래스에는 내부적으로 char배열 생성되도록 되어있다 .
//		System.out.println(name);
//		System.out.println("member".length());
//		
//		  String myName="john";
//		  System.out.println(myName.charAt(2));
//		  
//		  String youName=new String("박문수");
//		  System.out.println(youName);
//		  
		  
//		  int[]a=new int[] {11,20,55};
//		  int[]b=new int[] {13,20,55};
//		  
//		  
//		  boolean isSame=true;//같은 배열이면 true  다르면 false
//		  for(int i=0;i<=a.length;i++) {
//			  if(a[i]==b[i]) {
//				 if(a[i] != b[i])
//					 isSame=false;
//				  
//			  }
//			  if(isSame) {
//				  System.out.println("같은배열");
//			  }else {
//				  System.out.println("다른 ");
//			  }
		
		
//			char[] name1=new char[] { '주','동','건'};
//			char[] name2=new char[] {'장','동','건'};
//			
//			boolean isSame=true;
//			for(int i=0;i<name1.length;i++) {
//				
//					if(name1[i]!=name2[i])
//						isSame=false;
//				}
//				if(isSame) {
//					System.out.println("같다");
//				}else {
//					System.out.println("다르다 ");
////				}
////			
//				String name1="주동건";
//				String name2="이동건";
//				if(name1.equals(name2))
//					System.out.println("같은이름");
//				else
//					System.err.println("다른이름 ");
//
//		  System.out.println(name1.compareTo(name2));
		  //compareTo: 0이라면 두문자열이 동일
		  // 					양수:사전적 순서가 앞일경우 
		  //	 		 	 	 음수:사전적 순서가 뒤인경우 
//		  
//		  int[] number=new int[] {10,20,30,40,50,60,70,80,90,100};
//		  
//		  for(int num:number) {
//			  System.out.println(num);
//			  
//		  }
		  // 배열의 인덱스사용불가
		  // 배열의 데이터를 변경하거나 삭제불가
		  
		  //문제 
		  //tall 배열은 a 반 학생들의 키를 저장 한것이다 
		  // a 반의 평균키보다 큰키를 찾아서 출력하세요 
//		  float[] tall= new float[] {167.2f, 163.4f , 175.7f ,173.8f, 158.3f};
//		 
//		  float avg=0,sum=0;
//		  for(float t:tall) {
//			  sum=sum+t;
//		  }
//		   avg=sum/tall.length;//평균구하기
//		  for(float t:tall) {
//			  if(avg<=t)
//				  System.out.println(t);
//		  }
		  
		  
//		  for(int i=0;i<num.length;i++) {
//			  System.out.println(num[i]);
//		  }
//		  
		  //배열관련 메서드
//		int[] num=new int[]	{10,20,30,40,50,60,70,80};
		
//		System.out.println( Arrays.toString(num));
//		 //자바에서 데이터 출력 메서드이름 toString
//		  int[] a=new int[7];
//		  System.out.println(Arrays.toString(a));
//		 //배열복사 
//		  // arraycopy(복사배열, 복사배열시작인덱스,저장배열,저장시작인덱스);
//		  System.arraycopy(num,0,a,0,num.length);
//		 System.out.println(Arrays.toString(a)); 
//		//  배열비교 
//		 boolean isSame=Arrays.equals(num,a);
//		 System.out.println(isSame);
		  //배열정렬
		 int[] arr =new int[] {543,234,2431,142,432,534,432,123};
		 System.out.println("===정렬전===");
		 System.out.println(Arrays.toString(arr));
		 Arrays.sort(arr);
		 System.out.println("---정렬후---");
		 System.out.println(Arrays.toString(arr));
		//Integer[]arr2={ 
//		 Arrays.sort(arr,Collections.reverseOrder());
		 
		 String[] names= {"이순신","이성계","김춘추","정약용","문익점"};
		 System.out.println(Arrays.toString(names));
		 
		 Arrays.sort(names);
		 System.out.println(Arrays.toString(names));
		 //comparator 구현필요 
}

		
		
		
}
