package Collection_Frameworks;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue_List {
	
	
	
	
	public static void main (String[] args)
	{
		
		ArrayBlockingQueue <Integer> Age = new ArrayBlockingQueue<Integer>(5);
		
		
		Age.add(52);
		Age.add(100);
		Age.add(12);
		
		System.out.println(Age);
		
		System.out.println(Age.peek());
		
		
		

       for (Integer x :Age)
       {
    	   System.out.println(x);
       }
		
		
	}

}
