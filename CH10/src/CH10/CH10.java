package CH10;

public class CH10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] studentA = {97, 53};
		int[] studentB = {95, 66};
		
		//Mid클래스 객체 생성
		Mid m = new Mid();
		//메서드를 호출한 결과값을 sumA 저장
		int sumA = m.score(studentA);
		//메서드를 호출한 결과값을 sumB 저장
		int sumB = m.score(studentB);
		
		if(sumA > sumB)
		{
			System.out.println("A학생의 중각고사 총점이 더 높습니다.");
		}
		else if(sumA < sumB)
		{
			System.out.println("B학생의 중각고사 총점이 더 높습니다.");
		}
		else
		{
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}

	}

}
