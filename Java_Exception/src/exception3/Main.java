package exception3;

public class Main {

	public static void main(String[] args) {
		int[] arr= {10,40,50,20};
		try {
		System.out.println(arr[5]);
		}catch (Exception e) {System.out.println("인덱스범위");}
		
		String str="123ab";
		int num=0;
		try {
		num=Integer.parseInt(str);//Intger.parseInt는 문자열->정수변환
		}catch (Exception e) {
			System.out.println("정수로변환 불가-정수만입력");
		}
		System.out.println("정수:"+num);
		
		
		String word="good bye";
		try {
		System.out.println(word.substring(word.indexOf("B")));
		}catch(Exception e) {
			
		}
		try {
		System.out.println(word.substring(word.indexOf("m")));
		}catch(Exception e) {
			
		}
		
	}

}
 