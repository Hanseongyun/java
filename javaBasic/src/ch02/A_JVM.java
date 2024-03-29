package ch02;

class ExampleClass2 {
	static int number = 3;
	double doubleNumber;
	
	Sample1 method() {			// 참조변수를 매개변수로 사용할 수 있음
		Sample1 sample = new Sample1();
		sample.data = -456;
		return sample;
	}
	
	static void staticmehtod () {
		
	}
}

class Sample1 {
	int data;
	
	Sample1(){}
	Sample1 (Sample1 sample){
		this.data = sample.data;
	}
}

public class A_JVM {

	public static void main(String[] args) {
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
		sample.data = 8;
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
		sample = instance1.method();
		
		System.out.println(sample.data);
		
		// 매개변수로 들어가고 나오는것은 전부 복사되어 들어가고 나온다
		
		int number2 = number;			// 값
		number2++;
		System.out.println(number);
		System.out.println(number2);
		
		Sample1 sample2 = sample;		// 참조변수 - 주소를 복사
		sample2.data++;					// sample2 주소에 있는값을 1증가
		System.out.println(sample.data);
		System.out.println(sample2.data);
		
		Sample1 sample3 = new Sample1(sample);	// new연산자 > hip영역에 새로운 영역을 만듬
		System.out.println(sample.data);
		System.out.println(sample3.data);
		sample3.data++;
		System.out.println(sample.data);
		System.out.println(sample3.data);

	}

}
