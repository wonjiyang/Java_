package CH10;

public class Mid {
	
	//리턴한 값을 변수에 저장하는 메서드 정의
	public int score(int[] scores)
	{
		int result = 0;
		for(int i = 0; i < scores.length; i++)
		{
			result += scores[i];
		}
		//return은 메서드 실행 결과값을 호출한 곳으로 돌려준다.
		//메서드 호출부에서는 이 반환값을 변수에 저장하거나 다른 작업에 사용할 수 있다.
		return result;
	}

}
