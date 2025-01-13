package CH07;

public class CH07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1차원 배열에 for문을 사용하여 각 인덱스 값을 넣는 예제
		//1차원 배열 선언
		int[] array = new int[10];
		//for문을 이용해 배열에 값 넣기
		//배열명.length => 배열의 길이
		//int i = 0 : 인덱스 번호는 0번부터 시작
		for(int i = 0; i < array.length; i++)
		{
			array[i] = i;//인덱스 값을 배열에 저장
		}
		System.out.print("1차원 배열의 값 : ");
		//for문으로 출력
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		//배열에 짝수 값 넣기
		//for문을 이용해 인덱스 값 넣기
		//1차원 배열 선언 길이 10
		int[] arr = new int[10];
		//for문을 이용해 배열에 값 넣기
		//짝수 값 저장
		for(int a = 0; a < arr.length; a++)
		{
			arr[a] = a*2;
		}
		//결과출력
		System.out.print("1차원 배열의 값 : ");
		//for문으로 출력
		for(int a = 0; a < arr.length; a++)
		{
			System.out.print(arr[a] + " ");
		}
		
		//배열에 역순 값 넣기
		int[] ar = new int[10];
		for(int b = 0; b < ar.length; b++)
		{
			ar[b] = ar.length-b;
		}
		System.out.print("1차원 배열의 값 : ");
		for(int b = 0; b < ar.length; b++)
		{
			System.out.print(ar[b] + " ");
		}
		
		//배열에서 단어만 추출하여 출력하기
		//문자형배열 배열명 : cards
		char[] cards = {'1', 'L', '2', 'O', 'V', '3', 'E'};
		String myWord = "";
		
		for(int c = 0; c < cards.length; c++)
		{
			//문자는 아스키코드표에 의해 10진수 숫자로 대응된다.
			int word = cards[c];
			//문자 필터링
			//65-90 대문자 A-Z
			//97-122 소문자 a-z
			//아스키코드표에 따라서 비교조건 만들기
			if((word >= 65 && word <= 90) || (word >= 97 && word <= 122))
			{
				myWord += (char)word;
			}
		}
		System.out.println("단어 : " + myWord);
		
		//숫자만 추출하여 출력하기
		//문자형 배열 선언
		char[] mixArray = {'A', '1', 'B', '2', 'C', '3', 'D'};
		String ex = "";
		
		//for문을 이용하여 배열 순회하기
		for(int d = 0; d < mixArray.length; d++)
		{
			if(mixArray[d] >= '0' && mixArray[d] <= '9')
			{
				ex += mixArray[d];
			}
		}
		System.out.println("숫자 : " + ex);
		
		//버블 정렬(오름차순)
		//정렬해야할 배열
		int[] arrr = {1, 6, 3, 2, 10, 7, 4, 5, 8, 9};
		int temp = 0;
		for(int i = arrr.length - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(arrr[j] > arrr[j+1])
				{
					temp = arrr[j+1];
					arrr[j+1] = arrr[j];
					arrr[j] = temp;
				}
			}
		}
		System.out.println("정렬 후 출력 : ");
		for(int i = 0; i < arrr.length; i++)
		{
			System.out.print(arrr[i] + " ");
		}
		
		//버블 정렬 2
		int[] arry = {5, 1, 4, 2, 8};
		int tem = 0;
		for(int i = arry.length - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(arry[j] > arry[j+1])
				{
					tem = arry[j+1];
					arry[j+1] = arry[j];
					arry[j] = tem;
				}
			}
		}
		System.out.println("정렬 후 출력 : ");
		for(int i = 0; i < arry.length; i++)
		{
			System.out.print(arry[i] + " ");
		}
		
	}

}
