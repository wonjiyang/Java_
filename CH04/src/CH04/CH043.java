package CH04;
import java.util.Scanner;

public class CH043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("좌표를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x > 0 && y > 0)
		{
			System.out.println("1");
		}
		else if(x < 0 && y > 0)
		{
			System.out.println("2");
		}
		else if(x < 0 && y < 0)
		{
			System.out.println("3");
		}
		else
		{
			System.out.println("4");
		}

	}

}
