package ch02;

// 기타 제어자(비접근 제어자): 접근 제어와 무관하게 동작을 제어하는 것
// final 제어자 : 
// - 클래스: final 제어자가 붙은 클래스는 확장(상속)할 수 없음
// - 메서드: final 제어자가 붙은 메서드는 오버라이드할 수 없음
// - 변수: final 제어자가 붙은 변수는 재할당할 수 없음
final class FinalModifier1 {
	int variable;
}

//class SubModifier1 extends FinalModifier1 {		//final 클레스 확장(상속)
//	
//}

class FinalModifier2 {
	
	final void method () {}
}

class SubModifier2 extends FinalModifier2 {
	
//	void method () {}					//final 메소드 오버라이드
}

class FinalModifier3 {
	
	final int variable = 10;
	
	void method () {
		
		//varialbe = 20;					//final 변수 재할당
	}
}

// static 제어자:
// - 메서드: static 제어자가 붙은 메서드는 인스턴스 생성없이 클래스로 바로 호출 가능
// - 변수: static 제어자가 붙은 변수는 인스턴스 생성없이 클래스로 바로 접근 가능
class StaticModifier {
	
	static int variable;
	
	static void method () {}
}

// 제어자의 조합
class Combination {
	
	// public + static + final		> 많이 사용되는 조합
	public static final int NUMBER = 10;
	
	// 메서드에서 private + final 		> 사용X private- 외부에서 접근안됨 + final- 오버라이드가안됨 > 의미가없음
	private final void method () {}
	
	// 메서드에서 private + abstract	> X (서로 상충)
	// 메서드에서 final + abstract		> X (서로 상충)
	
	
}

public class D_Modifier {

	public static void main(String[] args) {
	
		StaticModifier.variable = 0;
		StaticModifier.method();

	}

}
