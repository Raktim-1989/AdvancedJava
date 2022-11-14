package sdet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Java", "Jenkins", "C#", "Java", "Jenkins", "Webservice"};
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		for(String s : arr)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
				
		}
		
		Set set = map.entrySet();
	    Iterator itr = set.iterator();
	    while(itr.hasNext())
	    {
	    	
	    	Entry<String,Integer> entry = (Entry<String,Integer>) itr.next();
	    	System.out.println(entry.getKey() +  " : " + entry.getValue());
	    }

	}

}
