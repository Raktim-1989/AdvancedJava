package sdet;

public class PrimeChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 77;
		int count = 0;
		if(num >1)
		{
			
			for(int i = 1;i<=23;i++)
			{
				
				if(num%i == 0)
				{
					
					count ++;
				}
				
			}
			
			if(count == 2)
			{
				System.out.println("number is prime");
				
			}
			else
			{
				System.out.println("number is not prime ");
			}
			
			
			
		}

	}

}
