package ch02;

// 캡슐화: 멤버 변수(속성)와 메서드를 묶어서 변수에 대한 조작을 메서드를 통해서만 할 수 있도록 하는 것
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음
class FootballPlayerB {
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	FootballPlayerB(String name, String birth, String team, int goal) {
		this.name = name;
		this.birth = birth;				// birth는 절대 바뀌지 않으므로 setter 메서드는 만들지않음
		this.team = team;
		this.goal = goal;
	}
	
	String getName () {					//getter메서드: 반환타입 get+필드명
		return this.name;
	}
	
	String getBirth () {					//getter메서드: 반환타입 get+필드명
		return this.birth;
	}
	
	String getTeam () {
		return this.team;
	}	
		
	int getGoal () {
		return this.goal;
	}
	
	void setName (String name) {		//setter메서드: void(반환x) set+필드명 (매개변수)
		this.name = name;
	}
	
	void setTeam (String team) {
		this.team = team;
	}
	
	void setGoal (int goal) {
		if (goal <0) return;
		this.goal = goal;
	}
	
}


class FootballPlayerC {
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	
	// 마우스 우클릭 - source - generate ~ 이용하면 자동으로 생성
	
	FootballPlayerC(String name, String birth, String team, int goal) {
		//super();				상위클래스 생성자 -object
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getTeam() {
		return team;
	}
	void setTeam(String team) {
		this.team = team;
	}
	int getGoal() {
		return goal;
	}
	void setGoal(int goal) {
		this.goal = goal;
	}
	String getBirth() {
		return birth;
	}
	
	
}

public class E_Encapsulation {

	public static void main(String[] args) {
	
		FootballPlayerB son = new FootballPlayerB("손흥민", "920000", "토트넛 훗스퍼", 0);
//		son.name = "손흥민";
//		son.team = "토트넘 훗스퍼";
//		son.goal = 0;
		
		son.setGoal(-1);
		System.out.println(son.getGoal());
		
		System.out.println(son.getName());
		

	}

}

