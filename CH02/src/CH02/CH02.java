package CH02;

public class CH02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//실수형 변수 선언 및 초기화
		double marathon = 42.195;
		float halfMarathon = 21.0975f;
		
		//실행결과
		//마라톤은 42.195km를 달립니다.
		//하프마라톤은 21.0975km를 달립니다.
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다.");
		System.out.println("하프마라톤은 " + halfMarathon + "km를 달립니다.");
		
		//정밀도 알아보기 예제2----------------------
		double pieDouble = 3.142592653389793;
		float pieFloat = 3.142592653389793f;
		System.out.println("double :" + pieDouble);//소수점 15번째 자리
		System.out.println("float :" + pieFloat);//소수점 7번째 자리
		
		//문자형 변수 선언 및 초기화
		char ga = '가';//작은 따옴표 필수
		char na = '나';
		System.out.println(ga);
		System.out.println(na);
		
		//문자형 변수 선언하고 변수명은 alA
		//alA에 들어갈 적절한 값을 넣고 출력
		char alA = 'A';
		System.out.println(alA);
		
		//문자형 변수 선언하고 변수명은 alB
		//alB에 들어갈 적절한 값을 넣고 출력
		char alB = 'B';
		System.out.println(alB);
		
		//실행결과 : A, B
		System.out.println(alA + "," + alB);
		
		//문자형 예제2-------------------------
		int gaa = '가';
		int naa = '나';
		int alAA = 'A';
		int alBB = 'B';
		
		//유니코드 대문자 A~Z = 65~90
		//유니코드 소문자 a~Z = 97~122
		System.out.println(gaa);
		System.out.println(naa);
		System.out.println(alAA);
		System.out.println(alBB);
		
		//문자열형 변수 선언 및 초기화
		String hi = "안녕하세요";
		System.out.println(hi);
		
		//문자열형 변수 선언하고 값은 만나서 반갑습니다.
		//만나서 반갑습니다. 변수명을 이용하여 출력하기
		String nice = "만나서 반갑습니다.";
		System.out.println(nice);
		
		//논리형 : Boolean (true / false) 0,1로만 표현
		//논리형 변수 선언 및 초기화
		boolean isStudent = true;
		System.out.println(isStudent);
		
		//자동형 변환 예제1------------------------------
		int num1 = 14;
		double num2 = 3.14;
		
		//자동형 변환
		double num3 = num1;
		System.out.println(num3);//double 실수자료형으로 자동변환하여 실행결과 : 14.0
		
		//강제형 변환
		int num4 = (int)num2;
		System.out.println(num4);//int 정수자료형으로 강제변환하여 실행결과 : 3
		
		//강제형 변환 예제1---------------------
		float f1 = 12345.67f;
		int i1 = (int)f1;
		System.out.println("f1의 값 :" + f1 + ", i1의 값 :" + i1);
		//f1 : 12345.67
		//i1 : 12345
		
		
		
	}

}
