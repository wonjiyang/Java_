package CH04;
import java.util.Scanner;

public class CH044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		int year = sc.nextInt();
		if(year %4 == 0)
		{
			if(year %400 == 0)
			{
				System.out.println(1);
			}
			else if(year %100 == 0)
			{
				System.out.println(0);
			}
			else
			{
				System.out.println(1);
			}
		}
		else
		{
			System.out.println(0);
		}

	}

}
