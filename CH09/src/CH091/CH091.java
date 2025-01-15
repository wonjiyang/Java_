package CH091;

public class CH091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성
		//메서드가 있는 클래스 참조변수 = new 클래스();
		jogger jogger = new jogger();
		
		//변수 값 할당
		jogger.name = "김나비";
		
		//메서드 호출
		//참조변수.메서드이름();
		//(단, 같은 클래스에 있는 메서드를 호출할 때는 메서드 이름만 호출한다.)
		
		jogger.run();
		jogger.sayName(); 

	}

}
