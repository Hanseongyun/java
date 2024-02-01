package test;

import java.util.Scanner;

public class MagicSQuare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];

		int row = 0;
		int column = (n-1)/2;
		int num =1;
				
		while(num <=n*n){

			if(num%n!=0){ // i가 n의 배수가 아니면 
				arr[row][column] = num++;//i값 넣어줌
				row--; // 행 1감소
				column++; // 열 1증가

			}else{ //i가 n의 배수면 : 마방진에서는 n의 배수일 때 마다 행만 아래로 내려감
				arr[row][column] = num++;
				row++;// 행 1증가
			}
			//배열의 행열 크기 벗어날 시 재초기화해줌
			if(row<0) { 
				row = n-1;
			}
			if(column>n-1) {
				column = 0;
			}
			
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
 }
}