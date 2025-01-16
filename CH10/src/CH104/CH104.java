package CH104;

public class CH104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스 연결
		Pet p = new Pet();
		
		System.out.println("wheel의 개수는 " + p.wheel +  "개입니다.");
		p.wheel = 5;
		System.out.println("wheel의 개수는 " + p.wheel +  "개입니다.");
		p.wheel = 100;
		System.out.println("wheel의 개수는 " + p.wheel +  "개입니다.");		

	}

}
