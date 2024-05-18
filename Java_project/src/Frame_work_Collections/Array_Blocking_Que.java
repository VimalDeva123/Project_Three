package Frame_work_Collections;

import java.util.concurrent.ArrayBlockingQueue;

public class Array_Blocking_Que {
	
	
	public static void main(String[]args)
	{
	
		
		ArrayBlockingQueue<Double> My_Value = new ArrayBlockingQueue<Double>(5);

		My_Value.add(25.55);
		My_Value.add(120.22);
		My_Value.add(78.44);
		My_Value.add(89.44);
		My_Value.add(257.44);
		System.out.println(My_Value);
		System.out.println(My_Value.peek());
		for (double D :My_Value)
		{
			System.out.println(D);
	
		}
		
		
	}
	
	
	
	

}
