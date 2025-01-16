package CH102;

public class Person {
	
	//멤버변수 선언
	//private 접근 제한자는 person 클래스에서만 사용 가능
	private int age;
	
	//setter : 값을 설정 혹은 변경
	void setAge(int num)
	{
		if(num <= 0)
		{
			System.out.println("잘못된 수를 입력하셨습니다.");
			return;
		}
		else
		{
			age = num;
		}
	}
	
	//getter : 읽기 전용
	int getAge()
	{
		return age;
	}

}
