package package2;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx 
{
	public static void main(String[] args) 
	{
		SortedMap<Integer, String> map = new TreeMap<Integer, String>((a,b) -> b- a);
		map.put(4, "Prithvi");
		map.put(1, "Vedant");
		map.put(3, "Suraj");
		map.put(2, "Nikhil");
		
		map.get(2);          // Nikhil
		map.containsKey(3);  // True
		map.containsValue(4);// False
		
		System.out.println(map);
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap(2));
		System.out.println(map.tailMap(3));
		
		System.out.println(map.sequencedEntrySet());
	}

}
