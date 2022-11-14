package sdet;

import java.util.*;
public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,67,78,8}));
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,4,99}));
		
		//System.out.println(list.get(2));
		
		List<Integer> listFinal = new ArrayList<Integer>(list);   //copying arraylist into new one 
		listFinal.retainAll(list1);
		
		//System.out.println(listFinal);
		
		
		//create a list and add elements on a single line using array 
		
		//Array to ArrayList conversion --advanced coding 
		//create two arraylist and retain only the common elements 
		
		//  List<WebElement> list = driver.findElements(By.xpath('xpath/css of table'))
		
		
		//retrieval of elements from a list 
		//for loop
		//for-each
		//iterator
		//java-stream (JDK 1.8 )
		
		for(int i = 0 ; i<list.size();i++)
		{	
			//System.out.println(list.get(i));			
			
		}
		
		//for-each
		
		for(int i : list)
		{
			System.out.println(i);
		}
		
		//Iterator 
		Iterator<Integer> itr = list.iterator();  //
		while(itr.hasNext())
		{
			int x = itr.next();
			
		}
		
		
		
		
		
		
	}

}
