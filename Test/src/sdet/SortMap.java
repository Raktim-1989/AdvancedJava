package sdet;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("A",1);
		map.put("D",2);
		map.put("C",3);
		map.put("B",4);
		
		Map<String,Integer> sortedMap = new TreeMap<String,Integer>(map);
		

	}

}
