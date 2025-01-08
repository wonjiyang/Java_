package CH04;
import java.util.Scanner;

public class CH041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if - else문 예제1---------------
		int num = 5;
		if(num > 4)
		{
			System.out.println(num + "은(는) 4보다 큽니다.");
		}
		else
		{
			System.out.println(num + "은(는) 4보다 작습니다.");
		}

		//if - else문 예제2---------------
		int a = 4;
		int b = 10;
		int max = 0;
		if(a > b)
		{
			//System.out.println(a + "가 " + b + "보다 큽니다.");//
			max = a;
		}
		else
		{
			//System.out.println(a + "가 " + b + "보다 작거나 같습니다.");//
			max = b;
		}
		
		System.out.println(a + "와 " + 10 + " 중에 큰 수는 " + max + "입니다.");
		
		//if - else if - else문 예제1-----------------------
		int fa = 7;
		if(fa < 5)
		{
			System.out.println("좋아하는 숫자가 5보다 작습니다.");
		}
		else if(fa == 7)
		{
			System.out.println("좋아하는 숫자가 7입니다.");
		}
		
		//if - else if - else문 예제2-----------------------
		System.out.println("나이를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age > 19)
		{
			System.out.println("성인입니다.");
		}
		else if(age > 13)
		{
			System.out.println("청소년입니다.");
		}
		else if(age > 6)
		{
			System.out.println("어린이입니다.");
		}
		else
		{
			System.out.println("유아입니다.");
		}
		
	}

}
