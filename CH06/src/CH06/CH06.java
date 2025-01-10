package CH06;

public class CH06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while문 예제--------------
		
		//1부터 10까지의 합 출력하기
		int sum = 0;//더해진 값을 담을 변수
		int i = 1;//초기식
		while(i <= 10)//조건식
		{
			sum += i;
			i++;//증감식
		}
		System.out.println("합 : " + sum);
		
		//1부터 10까지의 짝수 출력하기
		int ii = 1;
		while(ii <= 10)
		{
			if(ii % 2 == 0)
			{
				System.out.print(ii);
				System.out.println("");
			}
			ii++;
		}
		
		int iii = 2;
		while(iii <= 10)
		{
			System.out.println(iii);
			iii += 2;
		}
		
		//do-while문 예제--------------
		
		//1부터 10까지의 합 출력하기
		int sum1 = 0;
		int i1 = 1;
		do
		{
			sum1 += i1;
			i1++;
		}while(i1 <= 10);
		
		System.out.println("합 : " + sum1);
		
		//1부터 10까지의 숫자 중 3의 배수만 출력하기
		int i2 = 3;
		do
		{
			System.out.println(i2);
			i2 += 3;
		}while(i2 <= 10);
		
		//최조 1회는 조건 없이 수행
		int i3 = 0;
		do
		{
			if(i3 % 3 == 0)//3의 배수인지 확인
			{
				System.out.println(i3);//3의 배수 출력
			}
			i3++;
		}while(i3 <= 10);
		
		//반복 횟수가 지정되는 경우 : for문
		//특정 조건이 부여되는 경우 : while문
		//한번 실행한 후 반복여부 판단 : do-while문
		
		//continue문
		//1에서 100까지 숫자 중 짝수 출력하기
		int sum2 = 0;
		for(int a = 1; a <= 100; a++)
		{
			if(a % 2 == 0)
			{
				//continue문을 만나면 이번 차수의 루프가 종료되면 다음 반복을 실행한다.
				//뒤에 실행문이 남아있어도 실행하지 않는다.
				continue;
			}
			sum2 += 1;
		}
		System.out.println("짝수 합 : " + sum2);

	}

}
