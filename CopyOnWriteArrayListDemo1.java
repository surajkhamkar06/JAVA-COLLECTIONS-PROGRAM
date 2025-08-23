package package2;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo1 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("The given list :" + list);
		
		for(int num : list)
		{
			//System.out.println(list);
			
			if(num==20)
			{
				list.add(50);
				System.out.println("Added 50 while reading. :");
			}
		}
		
		System.out.println("Updated List :" + list);
	}

}
