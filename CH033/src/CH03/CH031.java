package CH03;
//패키지 안에 java.util.Scanner 불러오기
import java.util.Scanner;

public class CH031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner 객체 선언
		Scanner sc = new Scanner(System.in);
		
		//정수 값으로 입력받기
		/*int A, B;
		A = sc.nextInt();
		B = sc.nextInt();*/
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		
		//입력받기 종료
		sc.close();

	}

}
