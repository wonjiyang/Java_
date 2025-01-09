package CH05;
import java.util.Scanner;

public class CH054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//영수증에 적힌 총 금액
		int x = sc.nextInt();
		int N = sc.nextInt();//종류의 수
		int total = 0;
		
		for(int i = 0; i < N; i++)
		{
			int a = sc.nextInt();//각 물건의 가격
			int b = sc.nextInt();//각 물건의 개수
			total += a * b;//물건의 가격 * 개수를 총 금액에 더함
		}
		if(total == x)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
