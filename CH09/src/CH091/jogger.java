package CH091;

//다른 클래스에 있는 메서드 호출하기

public class jogger {
	
	//변수(필드)
	String name;
	
	//run 메서드 생성
	void run() {
		System.out.println("run run run");
	}
	
	//sayName 메서드 생성
	void sayName() {
		System.out.println("제 이름은 " + name + "입니다.");		
	}
	
}
