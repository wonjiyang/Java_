package CH05;

public class CH05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복문
		//for
		for(int i = 1; i <= 5; i++)
		{
			System.out.print("*");
		}
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("*");
		}
		
		int sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			sum += i;//sum = sum + 1
		}
		System.out.println("합 : " + sum);
		
		int sum1 = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				sum1 += i;				
			}
		}
		System.out.println("합 : " + sum1);
		
		int sum2 = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 1)
			{
				sum2 += i;
			}
		}
		System.out.println("합 : " + sum2);
		
		//중첩 for문
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
		
		for(int i = 2; i <=9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				System.out.print(i + "x" + j + "=" + (i * j));
			}
			System.out.println();
		}

	}

}
