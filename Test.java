package package2;

import java.util.Arrays;
import java.util.LinkedList;

public class Test 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		
		linkedList.get(2);  // O(n)
		System.out.println(linkedList);
		
		linkedList.addLast(4);  // O(1)
		linkedList.addFirst(0); // O(1)
		linkedList.getFirst();
		linkedList.getLast();
		System.out.println(linkedList);
		
		linkedList.removeIf(x -> x % 2 == 0);
		System.out.println(linkedList);
		
		
		LinkedList<String> animals = new LinkedList<String>(Arrays.asList("Cat", "Dog", "Elephant"));
		LinkedList<String> animalsToRemove = new LinkedList<String>(Arrays.asList("Dog", "Lion", "Cat"));
		
		animals.removeAll(animalsToRemove);
		System.out.println(animals);
		
		
	}

}
