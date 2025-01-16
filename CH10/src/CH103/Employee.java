package CH103;

public class Employee {
	
	private double salary;
	
	void setSalary(double amount)
	{
		if(amount < 0)
		{
			System.out.println("급여는 음수가 될 수 없습니다.");
			return;
		}
		else
		{
			salary = amount;
		}
	}
	
	double getSalary()
	{
		return salary;
	}

}
