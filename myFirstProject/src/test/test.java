package test;

//객체 관련문제 상속 캡슐화 다형성(오버로드 오버라이드) 추상화 전부 섞어서 하나의 인스턴스?를 만드는 문제
//오버로딩 오버라이딩 차이
//문자열을 입력하면 숫자로 출력 or 숫자를 입력하면 문자열로 출력하는 문제
//아스키코드를 찾아야됨 
//123일경우 아스키코드 49 50 51이 들어가잇음
//int범위의 양의정수를 입력 > 자리의수가 몇자리고 각 자리의수에는 어떤숫자가 있나? 를 출력


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
//		int number = 123456789;
//		String str = Integer.toString(123456789);
//		str.length();
//		System.out.println(str.length());
		
//		List<Integer> arrayList;
//		arrayList = new ArrayList<>();
//		System.out.println(arrayList);
//		arrayList.add(1);
//		arrayList.add(2);
//		arrayList.add(3);
//		arrayList.add(4);
//		arrayList.add(5);
//		arrayList.add(6);
//		arrayList.add(7);
//		arrayList.add(8);
//		arrayList.add(9);
//		System.out.println(arrayList);
//		
//		int arrayElement = arrayList.get(0);
//		System.out.println(arrayElement);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = Integer.toString(n);
		str.length();
		System.out.println(str.length());
		
		
		// 10으로 나눠서 나머지를 출력 그다음은 버림
		// 1이하 값이 나오면 종료?
		// System.out.println(Math.round( 3.1415 * 100 ) / 100.0); // 소수점 세번째 자리에서 반올림
		// *내림값 메서드: floor()
		// System.out.println(Math.floor(3.14));

	}
		
}


