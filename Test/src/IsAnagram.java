import java.util.Arrays;
import java.util.Collections;

public class IsAnagram {
	
	public static boolean isAnagram(String s1 , String s2)
	{
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = isAnagram("raktim", "imtkar");
		System.out.println(flag? "Two Strings are anagrams" : "Two Strings are not anagrams");
		
		

	}

}
