package Collection_Youtube;

import java.util.concurrent.ArrayBlockingQueue;

public class Blocking_Queue {

	public static void main (String[]args)
	{
		
		
		ArrayBlockingQueue<Integer> V = new ArrayBlockingQueue<Integer>(6);
		V.add(45);
		V.add(65);
		V.add(80);
		V.add(11);
		V.add(89);
		V.add(11);
		
		System.out.println(V);
		V.peek();
		
		for (int x :V)
		{
			System.out.println(x);
		}
	
		
		
		
		
		
		
	}
}
