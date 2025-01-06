package CH01;

//클래스 : CH01 -> 클래스 이름
public class CH01 {
	
	// : 한줄 주석
	/* 여러줄 주석 */

	//실행 메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//실행문
		//출력하는 명령어
		System.out.println("Hello Java!");
		System.out.print("안녕하세요 저는 양원지입니다.");
		
		//서식문자
		//%d : 정수 (3)
		//%f : 실수 (3.114)
		//%s : 문자열 ("가나다라") 여러 글자
		//%c : 문자 ("가") 한글자
		
		//서식 문자를 이용해 출력하기 예제1--------------------
		System.out.printf("저는 대학교 %d학년에 재학중입니다.", 3);
		
		//서식 문자를 이용해 출력하기 예제2--------------------
		//실행 결과 : 1은 첫번째, 2.00000은 두번째, 셋은 세번째
		System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째", 1, 2.0, "셋");
		
		//실행 결과 : 오늘은 1월 3일입니다.
		System.out.printf("오늘은 %d월 %d일입니다.", 1, 3);
		
		//오른쪽 정렬하여 출력하기
		System.out.printf("%5d", 1);
		System.out.println();//행 바꿈
		System.out.printf("%5d", 12);
		//%nd : n칸만큼 확보 후 왼쪽으로 정렬하여 출력
		
		//소수점 출력하기
		System.out.printf("%.1f", 1.1234567);
		//%.nf : 소수점 아래 n번째 자리까지 출력(반올림)
		
		//실행 결과 : 1.12346
		System.out.printf("%.5f", 1.1234567);
		
		//변수 선언
		//기본 자료형 변수명
		//int num
		//float num1
		
		//학생의 나이을 저장할 수 있는 변수 선언
		//int studentAge;//정수형 변수
		//studentAge = 20;//변수에 값을 대입 (할당)
		
		//변수 선언 및 초기화
		int studentAge = 20;
		System.out.println(studentAge);
		
		//정수형 변수 선언 (이름은 규칙 기반으로 작성)
		//변수에 값을 대입(할당) = 1234
		
		//실행 결과 : 1234
		//int num;
		//num = 1234;
		int num = 1234;
		System.out.println(num);
		
		//변수 선언 및 초기화 예제1-----------------
		//String : 문자열을 저장할 수 있는 공간
		String myCity = "Seoul";//문자열 변수
		System.out.println("I am from " + myCity);
		//+기호는 문자열을 서로 연결하는 문자열 결합 연산자
		
		//문자열 변수 선언 및 값 초괴화 (값은 자신의 이름)
		//실행 결과 : 안녕하세요 저는 자신의 이름 입니다.
		String myName = "양원지";
		System.out.println("안녕하세요 저는 " + myName + " 입니다.");
		
		//변수를 이용해 다른 변수에 복사하기
		/*int myAge = 20;
		int yourAge = myAge;
		System.out.println(yourAge);*/
		
		//2개의 변수에 저장된 데이터 바꾸기
		int myAge = 20;
		int yourAge = 30;
		int tempAge;
		//최종결과 : myAge = 30;, yourAge = 20;
		tempAge = myAge;//빈 상자(tempAge)에 20의 값(myAge)을 저장
		myAge = yourAge;//20의 값이 들어있는 상자(myAge) 안에 30의 값(yourAge)으로 다시 저장
		yourAge = tempAge;//30의 값이 들어있는 상자(yourAge) 안에 20의 값(tempAge)으로 다시 저장
		System.out.println(myAge);
		System.out.println(yourAge);
		
	}

}
