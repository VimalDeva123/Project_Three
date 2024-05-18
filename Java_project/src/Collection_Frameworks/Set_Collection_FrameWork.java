package Collection_Frameworks;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Collection_FrameWork {
	
	
	
	public static void main(String[]atgs)
	{
		
		TreeSet<Integer> T = new TreeSet<Integer>();
		T.add(100);
		T.add(56);
		T.add(23);
		T.add(999);
		System.out.println(T);
		
		
		LinkedHashSet<Integer> T1 = new LinkedHashSet<Integer>(); 
		
		T1.add(100);
		T1.add(56);
		T1.add(23);
		T1.add(999);
		System.out.println(T1);
		
		HashSet<Integer> T2 =  new HashSet<Integer>();
		
		T2.add(100);
		T2.add(56);
		T2.add(23);
		T2.add(999);
		
		System.out.println(T2);
		
		
		TreeSet <String> T3 = new TreeSet <String>();
		T3.add("Vimal");
		T3.add("Raj");
		T3.add("Anu");
		
		System.out.print(T3);
		
		for(String X: T3)
		{
			System.out.print(X);
		}
		
		
		
		
	}
}
