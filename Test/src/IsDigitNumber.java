
public class IsDigitNumber {

	public static boolean isDigit(CharSequence cs)
	{
		int len = cs.length();
		for(int i = 0; i<len ; i++)
		{
			if(!Character.isDigit(cs.charAt(i)))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isDigit("abscg12345"));

	}

}
