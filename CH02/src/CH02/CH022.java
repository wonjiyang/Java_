package CH02;

public class CH022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//부호 연산자 +, -
		int x = 100;
		int resultPlus = +x;
		int resultMinus = -x;
		
		System.out.println(resultPlus);
		System.out.println(resultMinus);
		
		//증감 연산자(++, --)
		//피연산자의 값을 1씩 증가, 혹은 감소시키는 연산자이다.
		int num = 10;
		System.out.println(++num);//11(전위형, 코드에 즉시 반영)
		System.out.println(num++);//11(후위형, 코드 실행 후 반영)
		System.out.println(num);//12
		
		int num1 = 30;
		System.out.println(++num1);
		System.out.println(num1++);
		System.out.println(--num1);
		System.out.println(++num1);
		
		int x1 = 1;
		System.out.println(x1++);
		System.out.println(x1++);
		System.out.println(x1++);
		
	}

}
