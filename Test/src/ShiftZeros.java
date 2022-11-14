import java.util.Arrays;

public class ShiftZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] oldArray = {1,0,34,0,0,45,0,67,0};
		int[] newArray = new int[oldArray.length];
		int index = 0;
		
		for(int i = 0; i<oldArray.length;i++)
		{
			
			if(oldArray[i] !=0)
			{
				newArray[index] = oldArray[i];
				index++;
			}
			
		}
		
		System.out.println(Arrays.toString(newArray));

	}

}
