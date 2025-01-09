package CH05;

public class CH053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 8; i++)//0에서부터 시작해 7까지, 8행
		{
			for(int j = 0; j < 8; j++)//0에서부터 시작해 7까지, 8열
			{
				if((i+j) % 2 == 0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
