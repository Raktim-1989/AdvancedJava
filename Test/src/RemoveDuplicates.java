import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "JavaaJ";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i = 0; i<name.length();i++)
		{
			
			if(!map.containsKey(name.charAt(i)))
			{
				map.put(name.charAt(i),1);
				
			}					
			
		}
		
		Set set  = map.keySet();
		List<String> list = new ArrayList<String>(set);
		
		Object[] obj = list.toArray();
		System.out.println(Arrays.toString(obj));

	}

}
