package java20250212;

import java.util.Arrays;

public class java1212121212 {

	public static void main(String[] args) {
		int[][][] arr=new int[3][2][2];//3차원배열 1차원배열이 3개 알반적으로 잘사용안함 크기가너뮤쿰
		arr[0][0][0]=10;
		arr[0][1][1]=20;
		arr[0][1][0]=30;
		arr[1][0][0]=50;
		arr[1][0][1]=60;
		arr[2][0][0]=100;
		System.err.println(Arrays.toString(arr[0][0]));
		
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				for(int j=0;j<arr[i][k].length;j++) {
					System.out.println(arr[i][k][j]);
				}
			}
		}
	}

}
