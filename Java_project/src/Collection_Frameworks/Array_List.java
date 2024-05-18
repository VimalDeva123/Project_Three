package Collection_Frameworks;

import java.util.ArrayList;

public class Array_List {
	
	public static void main (String[]args)
	{
		
	
	
	ArrayList<Integer> DOB = new ArrayList<Integer>();
       DOB.add(2001);
       DOB.add(2002);
       DOB.add(2005);
       DOB.add(2010);
       DOB.add(2010);
       DOB.add(5236);
       
      
       DOB.set(3, 2024);
       DOB.remove(5);
      Boolean A =  DOB.contains(2024);
       System.out.println(DOB );
       System.out.println(A );
	}

}
