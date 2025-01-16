package CH107;

public class Student {
	
	static String schoolName = "코리아 고등하교";
	static String studentName = "김나나";
	
	//인스턴스 멤버
	//String schoolName = "코리아 고등학교"
	
	//정적 메서드
	//객체를 생성하지 않아도 사용 가능
	static void goToSchool()
	{
		System.out.println("학교에 갑니다.");
	}
	//인스턴스 메서드
	//객체를 생성한 후 사용 가능
	void hello()
	 {
		System.out.println("안녕하세요. 김나나입니다.");
	 }
	String stName = "박나나";

}
