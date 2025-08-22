package package2;

import java.util.LinkedList;
import java.util.Vector;

public class Main1
{
	public static void main(String[] args) 
	{
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(20);
		vector.add(40);
		vector.add(50);
		
		System.out.println(vector);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Vector<Integer> vector1 = new Vector<>(list);
		System.out.println(vector1);
		for(int i=0; i<vector1.size(); i++)
		{
			System.out.println(vector1.get(i));
		}
		System.out.println(vector1.capacity());
		
	}
}
