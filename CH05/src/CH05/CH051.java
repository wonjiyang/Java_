package CH05;
import java.util.Scanner;

public class CH051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1)
		{
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
		else
		{	
			for(int i = num; i > 0; i--)
			{
				System.out.print(i);
			}
		}
		
		
	}

}
