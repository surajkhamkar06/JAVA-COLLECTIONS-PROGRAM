package package2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapEx 
{
	public static void main(String[] args)
	{
		NavigableMap<Integer, String> navigableMap = new TreeMap<Integer, String>();
		navigableMap.put(1, "One");
		navigableMap.put(5, "Five");
		navigableMap.put(3, "Three");
		
		System.out.println(navigableMap);
		System.out.println(navigableMap.lowerKey(4));
		System.out.println(navigableMap.ceilingKey(3));
		System.out.println(navigableMap.higherEntry(1));
		System.out.println(navigableMap.descendingMap());
		
		System.out.println(navigableMap.descendingKeySet());
	}

}
