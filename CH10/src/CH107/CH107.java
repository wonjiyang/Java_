package CH107;

public class CH107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정적 멤버 호출
		//클래스이름.정적멤버명
		
		//Student클래스 예제
		System.out.println(Student.schoolName);
		System.out.println(Student.studentName);
		
		Student.goToSchool();
		
		//인스턴스 멤버 호출
		//객체생성 후 참조변수 이용
		Student s = new Student();
		s.hello();
		System.out.println(s.stName);
		
		//Family클래스 예제
		//f라는 객체 생성
		Family f = new Family();
		
		//s라는 객체 생성
		Family a = new Family();
		a.age = 5;
		System.out.println(a.age);
		
		f.address = "인천";

		System.out.println(a.address);
		
	}

}
