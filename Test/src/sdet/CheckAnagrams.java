package sdet;

import java.util.Arrays;

public class CheckAnagrams {
	
	public void isAnagrams(String s1, String s2)
	{
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		boolean status = true;
		if(str1.length() != str2.length())
		{
			status = false;
		}
		else
		{
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			status = Arrays.equals(arr1, arr2);
			
		}
		
		if(status)
		{
			System.out.println("Strings are anagrams");
		}
		else
		{
			System.out.println("Strings are not anagrams");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckAnagrams obj = new CheckAnagrams();
		obj.isAnagrams("Geek", "keeg");

	}

}
