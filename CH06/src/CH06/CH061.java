package CH06;
import java.util.Scanner;

public class CH061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break문 : 반복문이 진행되는 중에 특정 조건을 만족해 더이상 반복문이 필요없을 때 사용
		//UP and Down 게임 만들기
		
		//1부터 50까지 랜덤숫자가 나온다.
		//그 수를 magicNumber에 할당한다.
		int magicNumber = (int)(Math.random() * 50) + 1;

		Scanner sc = new Scanner(System.in);
		
		//맞았는지 판단하기 위한 변수
		boolean isMatched = false;
		//10번동안 반복
		for(int i = 0; i <= 100; i++)
		{
			System.out.println("숫자를 입력하세요.");
			//입력한 수를 guess에 할당
			int guess = sc.nextInt();
			if(guess == magicNumber)
			{
				System.out.println((i+1) + "번째에 맞췄습니다.");
				isMatched = true;
				break;//정답을 맞췄기 때문에 break로 반복문 빠져나오기
			}
			else if(guess > magicNumber)
			{
				System.out.println("맞춰야할 숫자가 더 작습니다.");
			}
			else if(guess < magicNumber)
			{
				System.out.println("맞춰야할 숫자가 더 큽니다.");
			}
		}
		if(!isMatched)
		{
			System.out.println("정답을 맞추지 못했습니다.");
		}
		
	}

}
