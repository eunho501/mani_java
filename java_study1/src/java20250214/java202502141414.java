package java20250214;

import java.util.Scanner;

public class java202502141414 {

	public static void main(String[] args) {
	//문제1 
	// 학생 5명의 시험성적을 키보드를통해 입력받고 
	// 평균 점수를 구하여 출력
	//반드시 시험성적을 배열에저장 
//		int[] score=new int[5];
//	Scanner sc=new Scanner(System.in);
//	int total=0,avg=0;//
//	for(int i=0; i<score.length;i++) {
//		
//		System.out.print((i+1)+"번째 학생성적입력:");
//		score[i]=sc.nextInt();
//		total=total+score[i];
//	}
//	avg=total/score.length;
//	System.out.println("평균:"+avg);
//	
//	
 //문제 2번 
// 알파벳 문자하나를 입력하세요
//입력한 알파벳으로 시작하는 단어를 모두 찾아 출력
//chatAt
		Scanner sc=new Scanner(System.in);	
		
		int idx=0;
		
		
		
		
		String[] word = new String[] {
				"apple", "banana", "cherry", "date", "elderberry", 
	            "fig", "grape", "honeydew", "kiwi", "lemon", 
	            "mango", "nectarine", "orange", "papaya", "quince", 
	            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
	            "watermelon", "xigua", "yam", "zucchini", "avocado", 
	            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
	            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
	            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
	            "mangosteen", "nectar", "orange", "peach", "pineapple", 
	            "pear", "plum", "pomegranate", "pear", "lime", 
	            "apricot", "banana", "papaya", "melon", "peach", 
	            "plum", "raspberry", "blueberry", "citrus", "mango", 
	            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
	            "apricot", "blackberry", "currant", "kiwi", "orange", 
	            "lemon", "watermelon", "melon", "tangerine", "apple", 
	            "date", "elderberry", "fruit", "peach", "fruit", 
	            "apple", "cherry", "fig", "honeydew", "jackfruit", 
	            "papaya", "blueberry", "plum", "pomegranate", "grape", 
	            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
	            "strawberry", "dragonfruit", "lime", "pear", "peach"
		
	
		
	
		};
		System.out.print("알파벳입력:");
		char alp=sc.nextLine().toLowerCase().charAt(0);
//		System.out.println(word.toLowerCase());
		int total=0;
		for(String str:word) {
			if(str.charAt(0)==alp) {
				System.out.println(str); total++;
			}
		}
	System.out.println("총단어 갯수"+total);

	}

}
