package CH04;
import java.util.Scanner;

public class CH045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//45분 일찍 일어나는 알람 맟추기 예제----------------
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력하세요.");
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		//45분 미만일 때
		if(M < 45)
		{
			H--;//시를 1씩 감소
			M = 60 - (45- M);//분을 45 감소
			if(H < 0)
			{
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		//45분 이상일 때
		else
		{
			System.out.println(H + " " + (M-45));
		}

	}

}
