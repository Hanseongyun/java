package ch02_sub;

class InterFaceSub implements G_Message{
	
	int method3 (int number) {
		
		System.out.println(GREETING_MESSAGE);				
		System.out.println(GOODBYE_MESSAGE);
		
		return 3 + number;
	}
}

public class G_InterfaceSub implements G_Message, G_Method {		// 다중상속

	public void method1 () {								// method를 반드시 구현해야함
//		System.out.println("반갑습니다");						// 약속된것들을 일관성있게 사용하기 위해
		System.out.println(GREETING_MESSAGE);				// implements로 클래스에 구현해서 사용
		
//		System.out.println("수고 하셨습니다.");
		System.out.println(GOODBYE_MESSAGE);
	}
	
	public void method2 () {
//		System.out.println("반갑 습니다.");
		System.out.println(G_Message.GREETING_MESSAGE);		// G_Message.GREETING_MESSAGE -> 어디서든 사용
		
//		System.out.println("수고하셨습니다");
		System.out.println(G_Message.GOODBYE_MESSAGE);
	}
}
