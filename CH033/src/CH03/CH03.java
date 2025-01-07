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
		
		
		
	}

}
