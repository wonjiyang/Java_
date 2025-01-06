package CH02;
import java.util.Scanner;

public class CH021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.printf("내 나이는 %d세 입니다.", age);
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.printf("내 이름은 %s입니다.", name);*/
		
		//이름, 주소, 나이, 체중 입력받고 출력하기
		//홍길동, 서울시 마포구, 15, 59.5
		/*System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.printf("내 이름은 %s입니다.", name);
		
		System.out.println("주소를 입력하세요");
		String add = sc.next();
		System.out.printf("내 주소는 %s입니다.", add);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.printf("내 나이는 %d세 입니다.", age);
		
		System.out.println("체중을 입력하세요");
		double wei = sc.nextDouble();
		System.out.printf("내 체중은 %f입니다.", wei);*/
		
		String name, address;
		int age;
		double weight;
		
		System.out.println("이름, 주소, 나이, 체중을 입력하세요");
		name = sc.next();
		address = sc.next();
		age = sc.nextInt();
		weight = sc.nextDouble();

		System.out.printf("내 이름은 %s입니다.", name);
		System.out.printf("내 주소는 %s입니다.", address);
		System.out.printf("내 나이는 %d세 입니다.", age);
		System.out.printf("내 체중은 %.1fkg입니다.", weight);
	}

}
