package CH07;

import java.util.Arrays;
import java.util.Comparator;

public class CH071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Arrays
		//1배열의 출력 예제
		int[] arr = {1, 6, 3, 2, 10, 7, 4, 5, 8, 9};
		
		//for문을 사용하지 않아도
		//Arrays 클래스의 메서드를 사용하여 출력할 수 있다.
		//Arrays.toString(배열명);
		//toString() : 반복문의 도움 없이 배열을 출력할 수 있는 메서드
		System.out.println(Arrays.toString(arr));
		
		//배열정렬(오름차순)
		//Arrays.sort();
		int [] array = {1, 6, 3, 2, 10, 7, 4, 5, 8, 9};
		Arrays.sort(array);
		System.out.println("오름차순 정렬 : " + Arrays.toString(array));
		
		//배열정렬(내림차순)
		//Comparator클래스의 reverseOrder()메서드를 사용한다.
		Integer[] arry = {1, 6, 3, 2, 10, 7, 4, 5, 8, 9};
		System.out.println(Arrays.toString(arry));
		Arrays.sort(arry, Comparator.reverseOrder());
		System.out.println("내림차순 정렬 : " + Arrays.toString(arry));
		
		
	}

}
