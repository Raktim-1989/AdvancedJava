package sdet;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 56432;
		int sum = 0;
		while(num != 0)
		{
			sum = sum + num%10;
			num = num/10;
			
		}
		System.out.println(sum);
		
		
	}

}
