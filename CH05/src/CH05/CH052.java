package CH05;
import java.util.Scanner;

public class CH052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("=====" + num + "단" + "=====");
		
		for(int i = 1; i <= 9; i++)
		{
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}

	}

}
