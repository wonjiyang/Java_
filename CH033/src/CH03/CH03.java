package CH03;

public class CH03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//산술 연산자(+, -, *, /, %)
		int x = 100;
		int y =200;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//산술 연산자 예제1--------------------
		double num1 = 1.2345;//(8byte)
		int num2 = 6;//(4byte)
		
		System.out.println(num1+num2);//num2를 double로 형변화하여 연산
		
		//산술 연산자 예제2---------------------
		//표현범위
		int result = 1000000 * 100000;
		System.out.println(result);
		
		//복합 대입 연산자
		int x1 = 10;
		int y1 = 1;
		
		y1 += x1;//y1 = y1+x1
		System.out.println(y1);
		
		y1 *= x1;//y1 = y1*x1
		System.out.println(y1);
		
		y1 /= x1;//y1 = y1/x1
		System.out.println(y1);

		y1 %= x1;//y1 = y1%x1
		System.out.println(y1);
		
		//관계 연산자
		int a = 10;
		int b = 20;
		
		//대소 연산자
		System.out.println(a>b);
		System.out.println(a<b);
		//등가 연산자
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//논리 연산자
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("##논리곱##");
		//두 항이 모두 true일때만 true
		System.out.println(b1 && b2);//두 항이 다르므로 false
		System.out.println(b1 && b3);//두 항이 모두 true이므로 true
		System.out.println(b2 && b4);//두 항이 모두 false이므로 true
		System.out.println();
		
		System.out.println("##논리합##");
		//두 항 중 하나라도 true면 true, 모두 false라면 false
		System.out.println(b1 || b2);//b1이 true라서 true
		System.out.println(b1 || b3);//b1, b3이 true라서 true
		System.out.println(b2 || b4);//모두 false라서 false
		System.out.println();
		
		System.out.println("##베타적 논리합##");
		System.out.println(b1 ^ b2);// b1과 b2가 다르기 때문에 true
		System.out.println(b1 ^ b3);// b1과 b2가 같기 때문에 false
		
		//삼항 연산자
		int num = (7 > 1) ? 1 : 2;
		System.out.println(num);
		
		int num3 = (5 < 10) ? 100 : 200;
		System.out.println(num3);
		
		//제어문
		int age = 15;
		
		//조건식 if문의 조건식이 참이면 if문 안에 있는 코드가 실행
		if(age < 19)
		{
			System.out.println("청소년입니다.");
		}
		
		
	}

}
