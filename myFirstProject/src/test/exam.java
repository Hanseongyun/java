package test;

import java.util.Scanner;

class Exam3 {
	public int solution (int number) {
	int sum = 0;
		while (number > 0) {
		sum += number %10; // sum = sum + number%10;
		number /= 10;
		} return sum;
	}
	

	
}

public class exam {

	public static void main(String[] args) {

		   Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        int n = str.length();
	        for (int i =0; i<n ; i++) {
	        	System.out.println(str.charAt(i));
	        }
	        
	}

}
