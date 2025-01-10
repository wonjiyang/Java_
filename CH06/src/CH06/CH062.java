package CH06;

public class CH062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열의 선언과 생성
		int[] arr1=new int[4];
		//배열 변수를 출력
		System.out.println(arr1);
		//[I@7c30a502 arr의 주소값 출력
		//배열의 변수는 그 주소값을 통해서 배열에 접근하여 데이터를 가져오게 된다.
		
		//4개의 공간을 가진 배열 선언
		int[] arr=new int[4];
		
		//배열에 값 저장하기
		//배열명[인덱스번호] = 값
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
	
		//배열에 값을 출력
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
		
		//5개의 공간을 가진 배열 선언
		int[] arr02=new int[5];
				
		//배열에 값 삽입
		arr02[0] = 50;
		arr02[1] = 60;
		arr02[2] = 70;
		arr02[3] = 80;
		arr02[4] = 90;
		//방법2
		//int[] arr = {50, 60, 70, 80, 90};
		//방법3
		//int[] arr = new int[]{50, 60, 70, 80, 90};
		
		//배열에 값을 출력
		System.out.println("arr02[0] = " + arr02[0]);
		System.out.println("arr02[1] = " + arr02[1]);
		System.out.println("arr02[2] = " + arr02[2]);
		System.out.println("arr02[3] = " + arr02[3]);
		System.out.println("arr02[4] = " + arr02[4]);
		
		//총합구하기
		int total = arr02[0] + arr02[1] + arr02[2] + arr02[3] + arr02[4];
		System.out.println("총점 : " + total);
		
		//평균구하기
		double avg = total / 5.0;
		System.out.println("평균 : " + avg);
		
		//배열의 길이 출력
		int[] score = {50,60,70,80,90};
		System.out.println("배열의 길이 : " + score.length);
		
		String[] name = new String[]{"이순신", "홍길동", "임꺽정"};
		System.out.println("배열의 길이 : " + name.length);
		
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		int[] varArray = {1, 2, 3, 4, 5};
		//값 출력
		System.out.println("intArray[0] : " + intArray[0]);
		System.out.println("strArray[0] : " + strArray[0]);
		System.out.println("strArray[0] : " + varArray[0]);
		
		//배열 값에서 짝수 합 구하기
		int[] num = new int[10];
		
		//배열에 랜덤 함수를 이용해서 값 입력
		for(int i = 0; i < num.length; i++)
		{
			num[i] = (int)(Math.random() * 30) + 1;
		}
		//배열 안에서 짝수만 구해서 합 구하기
		int sum3 = 0;
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 == 0)
			{
				sum3 += num[i];
			}
		}
		//출력
		for(int i = 0; i < num.length; i++)
		{
			System.out.println(num[i] + " ");
		}
		System.out.println();
		System.out.println("배열된 짝수들의 합 : " + sum3);
		
		
		//배열 값에서 홀수 합 구하기
		int[] numm = new int[50];
		//배열에 랜덤함수를 이용해서 값 입력
		for(int i1 = 0; i1 < numm.length; i1++)
		{
			numm[i1] = (int)(Math.random() * 30) + 1;
		}
		//배열 안에서 홀수만 구해서 합 구하기
		int sum4 = 0;
		for(int i1 = 0; i1 < numm.length; i1++)
		{
			if(numm[i1] % 2 != 0)
			{
				sum4 += numm[i1];
			}
		}
		//출력
				for(int i1 = 0; i1 < numm.length; i1++)
				{
					System.out.println(numm[i1] + " ");
				}
				System.out.println();
				System.out.println("배열된 홀수들의 합 : " + sum4);
		
	}

}
