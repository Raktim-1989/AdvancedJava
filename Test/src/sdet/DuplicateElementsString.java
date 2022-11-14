package sdet;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "JavaJavaEE";
		char[] array = input.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c : array)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c) + 1);
			}
			else
			{
				map.put(c, 1);
			}
			
		}
		
		

	}

}
