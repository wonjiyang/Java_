package CH07;

import java.util.Arrays;

public class CH072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열복사
		//얕은 복사
		int[] arr01 = {1, 2, 3};
		
		//배열의 얕은 복사
		int[] arr02 = arr01;
		System.out.println("arr01배열 : " + Arrays.toString(arr01));
		
		arr02[1] = 10;
		System.out.println(arr01);
		System.out.println(arr02);
		//같은 주소값을 쓰기 때문에 하나의 값이 변경되면 복사된 모두 변경된다.
		System.out.println("arr02배열 : " + Arrays.toString(arr02));
		System.out.println("arr01배열 : " + Arrays.toString(arr01));
		
		//깊은 복사
		int[] card = {1, 6, 5, 3, 2};
		int[] newCard = new int[card.length];
		System.out.println(card);
		System.out.println(newCard);
		//배열을 새롭게 생성하였기 때문에 같은 주소값을 쓰지 않는다.
		for(int i = 0; i < card.length; i++)
		{
			newCard[i] = card[i];
		}
		System.out.println("card 배열: " + Arrays.toString(card));
		System.out.println("newCard 배열: " + Arrays.toString(newCard));
		System.out.println("newCard 배열: " + Arrays.toString(newCard));
		
		//Arrays클래스를 이용한 깊은 복사(깊은 복사2)
		int[] cardd = {3, 1, 4, 5, 10};
		//배열의 깊은 복사 - Arrays.copyOf(배열, 복사범위)
		int[] newCardd = Arrays.copyOf(cardd, cardd.length);
		System.out.println("cardd 배열: " + Arrays.toString(cardd));
		//card배열의 값을 변경
		//card[1]의 값은 원래 1
		cardd[1] = 10;
		System.out.println("cardd 배열: " + Arrays.toString(cardd));
		System.out.println("newCardd 배열: " + Arrays.toString(newCardd));
		
		//깊은 복사 예제
		int[] arr1 = {7, 2, 9, 4, 6};
		int[] coArr1 = Arrays.copyOf(arr1, arr1.length);
		arr1[2] = 99;
		System.out.println("변경된 원본 배열 : " + Arrays.toString(arr1));
		System.out.println("복사된 배열 : " + Arrays.toString(coArr1));

		//얕은 복사
		int[] arr2= {1, 2, 3};
		int[] arr3 = arr2;
		arr3[1] = 10;
		System.out.println("변경된 원본 배열 : " + Arrays.toString(arr2));
		System.out.println("복사된 배열 : " + Arrays.toString(arr3));
		
		//System클래스를 이용한 깊은 복사
		int[] arr4 = {1, 6, 4, 5, 3, 2,};
		int[] arr5 = new int[arr4.length];
		
		//(복사 대상 배열, 복사 시작 위치, 카피할 배열명, 복사 시작 위치, 복사할 길이)
		System.arraycopy(arr4, 0, arr5, 0, arr4.length);
		System.out.println("arr4 배열 : " + Arrays.toString(arr4));
		System.out.println("arr5 배열 : " + Arrays.toString(arr5));
		
	}

}
