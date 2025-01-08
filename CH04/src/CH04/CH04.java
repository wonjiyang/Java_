package CH04;
import java.util.Scanner;

public class CH04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score > 85)
		{
			System.out.println("훌륭합니다.");
		}

	}

}
