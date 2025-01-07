package CH03;
import java.util.Scanner;

public class CH035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("숫자를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//만약 입력한 숫자가 짝수라면
		if(num % 2 == 0)
		{
			System.out.println("짝수입니다.");
		}
		
		System.out.println("숫자를 입력하세요.");
		int num1 = sc.nextInt();
		
		//만약 입력한 숫자가 홀수라면
		if(num1 % 2 != 0)
		{
			System.out.println("홀수입니다.");
		}
		
		//조건문
		//if문 : 조건식이 적을 때
		//if(조건식){코드;}
		//swith문 : 조건식이 많을 때

	}

}
