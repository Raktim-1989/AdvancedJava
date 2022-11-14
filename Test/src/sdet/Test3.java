package sdet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	
	
	public static void evenList()
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[] {1,2,3,4,5,6,8,9,10})) ;
		list.removeIf(n -> n%2 == 0);
		System.out.println(list);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] r = {"java" , "C#" , "SQL"};
		List a = Arrays.asList(r);
		System.out.println(a);
	   
		int[] a1 = {1,3,4,5,6,7};
		List<Integer> list = new ArrayList<Integer>(a1.length);
		for(int i : a1)
		{
			list.add(i);
		}
		
		System.out.println(list);

	}

}
