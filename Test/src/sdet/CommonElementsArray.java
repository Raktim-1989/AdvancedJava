package sdet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CommonElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,3,5,4,6,7,9,17,21};
		int[] arr2 = {2,4,6,9,21};
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<arr1.length;i++)
		{
			for(int j = 0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					set.add(arr1[i]);
				}
				
			}
					
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		Object[] obj = list.toArray();
		System.out.println(Arrays.toString(obj));
		
		

	}

}
