package java20250212;

public class java2025021212 {

	public static void main(String[] args) {
		int[][] board= new int[5][3];
		//1차원배열 몇개 ->3의 크기를 가지는 5개
		board[0][0]=1;	board[0][1]=2;
		board[0][2]=3;	board[1][0]=4;
		board[1][1]=5; board[1][2]=6;
		board[3][1]	=20; board[3][2]=30;
		board[4][0]=50;	board[4][1]=100;

		for(int[] pArr:board) {
			//pArr에 저장되는것은 board[0] board[1] board[2] board[3] board[4]
			//board[0]	-> 메모리 주소
			for(int num:pArr) {
//num에 저장되는것 :board[0][0] board[0][1] board[2][0]
				System.out.print(num+"  ");
			}
			System.out.println();
		}
	}

}
