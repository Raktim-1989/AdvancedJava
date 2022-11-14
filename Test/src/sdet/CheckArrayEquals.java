package sdet;

public class CheckArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,33,76,87};
		int[] arr2 = {1,2,33,76,87};
		boolean flag = true;
		
		if(arr1.length == arr2.length)
		{
			for(int i = 0; i<arr1.length;i++)
			{
				
				if(arr1[i] != arr2[i] )
				{
					flag = false;
					
				}
			
				
			}
			
			if(flag)
			{
				System.out.println("equals");
			}
			else
			{
				System.out.println("Not equals...");
			}
			
			
		}

	}

}
