package sdet;


public class Test1 {
	
	public void returnStringTggle()
	{
		
		String name = "my name is raktim";
		String[] words = name.split("\\s");
		for(String w : words)
		{
			String first = w.substring(0, 1).toLowerCase();
			String second = w.substring(1).toUpperCase();
			System.out.print(first + second + " " );
		}
		
		
	}
	
	public void getStringReverse()
	{
		
		String name = "RaktimSarkarRaktim123";
		String nam1 = name.substring(4);
		System.out.println(nam1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Test1 obj = new Test1();
		//obj.returnStringTggle();
		obj.getStringReverse();
		

	}

}
