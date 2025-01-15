package CH099;

public class Clac {
	

	/*void sum(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result +=nums[i];
		}
		System.out.println("숫자들의 합은 " + result + "입니다,");
	}*/
	
	//---------------------
	
	void calCulAvg(double[] numbers) {
		double total = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			total += numbers[i];
		}
		double avg = total / numbers.length;
		System.out.println("입력된 숫자들의 평균은 " + avg + "입니다.");		
	}
}