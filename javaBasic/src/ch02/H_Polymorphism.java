package ch02;

// 다형성: 하나의 표현이 여러가지 형태로 나타낼 수 있는 것

// 오버로드: 같은 클래스 내애서 동일한 메서드의 이름으로 여러개의 매서드를 정의할 수 있도록 하는 것
// 오버라이드: 자손클래스에서 조상클래스에 정의된 메소드를 재정의 하는 것

class Human1 {
	String name;
	int age;
	
}

class Developer1 extends Human1{
	String position;
}

class FootballPlayer1 extends Human1 implements FootballPlay{
	int goal;

	@Override
	public void kick() {}
}

interface FootballPlay {
	public abstract void kick();
}

public class H_Polymorphism {

	public static void main(String[] args) {

		Human1 human1 = new Human1();
		Developer1 developer1 = new Developer1();
		FootballPlayer1 footballplayer1 = new FootballPlayer1();
		
		// 업캐스팅: 하위클래스의 객체를 상위 클래스의 참조변수에 담을 수 있도록 변환하는 것		//개방폐쇄원칙에의해 코드의 안정성을 높이는방법
		//		  인터페이스 구현 클래스를 구현한 인터페이스의 타입 참조변수로 담을 수 있도록 하는 것
		Human1 human2 = new Developer1();
		Human1 human3 = new FootballPlayer1();

		FootballPlay football = new FootballPlayer1();
		
//		human2.position ="";		//시야에 없음
		
		// 다운캐스팅: 업캐스팅된 객체를 다시 원래의 타입의 타입의 참조변수에 담을 수 있도록 반환하는 것
		Developer1 developer2 = (Developer1) human2;
		developer2.position = "";
		
		FootballPlayer1 fp = new FootballPlayer1();
		fp.name = "홍길동";
		fp.age = 30;
		fp.goal = 55;
		
		System.out.println(fp);
		System.out.println(fp.name);
		System.out.println(fp.goal);
		
		// 업캐스팅
		Human1 hm = fp;
		System.out.println(hm);
		System.out.println(hm.name);
		//System.out.println(hm.goal);					//시야에 없음
		//hm.kick()										//시야에 없음
		
		// 다운캐스팅
		//FootballPlayer1 fpp = hm;						//시야에 없음
		FootballPlayer1 fpp = (FootballPlayer1)hm;		// 강제로 시야에 넣음
		System.out.println(fpp);
		System.out.println(fpp.name);
		System.out.println(fpp.goal);
		
		// 부모클래스의 인스턴스는 자식클래스의 인스턴스에 담을수없다
		Human1 hmm = new Human1();
		Developer1 dev = (Developer1) hmm;				// exception 에러 
		
		dev.position = "포지션";
		System.out.println(dev.position);
		
	
		// Object 클래스의 참조변수는 어떠한 클래스의 인스턴스도 받을 수 있음
		Object object1 = new Human1();
		Object object2 = new Developer1();
		Object object3 = new FootballPlayer1();
		

	}

}
