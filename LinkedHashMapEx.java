package package2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true);
	
		linkedHashMap.put("Orange", 10);
		linkedHashMap.put("Apple", 20);
		linkedHashMap.put("Guava", 13);
		
		linkedHashMap.get("Apple");
		linkedHashMap.get("Orange");
		
		for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet())
		{
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		LinkedHashMap linkedHashMap1 = new LinkedHashMap<>(hashmap);
		
		hashmap.put("Vedant", 91);
		hashmap.put("Prithvi", 92);
		hashmap.put("Suraj", 93);
		
		Integer res = hashmap.getOrDefault("Vipul", 0);
		hashmap.put("Prithvi", 93);
		
		System.out.println(hashmap);
		
		
	}

}
