package package2;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapEx 
{
	public static void main(String[] args) 
	{
		String key1 = new String("Key");
		String key2 = new String("Key");
		
		//Hashcode 
//		System.out.println(System.identityHashCode(key1));
//		System.out.println(System.identityHashCode(key2));
		
		Map<String , Integer> map = new IdentityHashMap<String, Integer>();
		
		//IdentityHashCode and ==
		
		map.put(key1, 1);
		map.put(key2, 2);
		//System.out.println(key1.equals(key2));
		System.out.println(map);
		
	}

}
