package sdet;

public class Test2 {

	public static void main(String[] args) {
		String s= "98757FVSBH124";
		StringBuffer sbf = new StringBuffer(s);
		//range of numbers 48 - 57 
		//48 - 0 , 49 -1 ...... 57 - 9
		
		for(int i = 0;i < sbf.length();i++)
		{
			char c = sbf.charAt(i);
			if(c <48 || c>57)
			{
				sbf.deleteCharAt(i);
				i--;
			}
			
		}
		System.out.println("number is " + sbf.toString());

	}

}
