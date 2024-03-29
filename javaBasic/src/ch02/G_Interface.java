package ch02;

// 인터페이스:클래스가 구현해야만하는 메서드들을 선언하는 참조 타입
// 인터페이스의 모든 변수는 public static final 형태가 와야함
// 인터페이스의 모든 메서드는 public abstract 형태가 와야함 (default나 static 메서드가 올 수도 있음)
// 인터페이스는 다중 구현이 가능

// 접근제어자 interface 인터페이스명 { ... }

// 넓이 공식
// 삼각형 넓이 구하기 - Double 밑변, Double 높이 -> Double 삼각형넓이
// 정사각형 넓이 구하기 - Double 변 -> Double 정사각형넓이
// 직사각형 넓이 구하기 - Double 밑변, Double 높이 -> Double 직사각형넓이
// 원 넓이 구하기 - Double 반지름 -> Double 원넓이


interface AreaCalculation {
	
	public static final double PI = 3.14;
	
	public abstract double getTriangleArea (double bottom, double height) ;
	public abstract double getSquareArea (double side);
	public abstract double getRectangleArea (double bottom, double height);
	public abstract double getCircleArea (double radius);
}

// 인터페이스는 implements 키워드를 이용해서 클래스에 구현해야함
class MyMath implements AreaCalculation{

	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	@Override
	public double getSquareArea(double side) {
		return side * side;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom * height ;
	}

	@Override
	public double getCircleArea(double radius) {
		return radius * radius * PI;
	}
	
}

class MyMathV2 implements AreaCalculation{			// 기능을 바꾸기(공식을 수정) 위해 새로운 클래스를 생성 
	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	@Override
	public double getSquareArea(double side) {
		return Math.pow(side, 2);
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom * height ;
	}

	@Override
	public double getCircleArea(double radius) {
		return radius * radius * PI;
	}
}

public class G_Interface {

	public static void main(String[] args) {
	
		AreaCalculation instance = new MyMathV2();	// 새로운 클래스 MyMathV2에 대한 검증이 끝나면 사용

	}

}
