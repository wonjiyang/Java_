package CH101;

public class Bus {
	
	void take(int m)
	{
		while(true)
		{
			if(m < 3000)
			{
				System.out.println("교통카드를 충전하러간다.");
				//메서드를 빠져나가기 위한
				return;
			}
			System.out.println("버스를 탄다.");
			m -= 1250;
		}
	}

}
