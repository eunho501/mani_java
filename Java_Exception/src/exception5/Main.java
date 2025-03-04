package exception5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//오류가 발생해도 오류가 없어도 무조건 실행 
//		Scanner sc=new Scanner(System.in);
//		
//		
//		int  money=1;
//		int total=0;
//		try {
//			System.out.println("현금:");
//			money=sc.nextInt();
//			total=money*5;
////			System.out.println("총금액: "+total);	
//		}catch(Exception e) {
//			System.out.println("숫자만 입력");
//		}finally {
//			System.out.println("총금액: "+total);
//		}//파일열기 데이터베이스 연결에서는 반드시 파일을 닫고ㅓ
//		//데이터베이스 연결해제하는게 좋다.
		String fileName="c://test//data.txt";
		//자동 자원반환- 파일열기와 같은 작업시 사용한 컴퓨터 자원(메모리 버퍼 등 )
		//			을 반환해야한다. 자동으로 반환까지 해주는 try~catch
		
		try(BufferedReader br=new BufferedReader(new FileReader(fileName)))
		{
			String line=br.readLine();
			System.out.println(line);
		}catch(Exception e) {
			System.out.println("파일 열고읽기 오류");
		e.printStackTrace();
		}
		
		
		
		
		
		
		
//		BufferedReader read=null;
//		try {
//			
//			read= new BufferedReader(new FileReader(fileName));
//			String line= read.readLine();
//			System.out.println(line);
//			
//		} catch (Exception e) {
//			System.out.println("파일 열고읽기 오류");
//			e.printStackTrace();
//		}finally {
//			try {
//			read.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		}
	}// main끝
}//클래스끝
