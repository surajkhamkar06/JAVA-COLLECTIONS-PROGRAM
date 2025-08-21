package package1;

import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(50);
		list.add(80);
		
		//Sort ArrayList
		Collections.sort(list);
		System.out.println(list);
		
		// Add the at index 2
		list.add(2, 60);
		
		for(int x : list)
		{
			System.out.println(x);
		}
		
		
		//Set value at index 1
		list.set(1, 30);
		System.out.println(list);
		
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		// Get the list
		for(int x : list)
		{
			System.out.println(x);
		}
		
		//Element is present or not 
		System.out.println(list.contains(50));
		
		//Remove element at index 2
		list.remove(2);
		for(int x : list)
		{
			System.out.println(x);
		}
		
	}

}
