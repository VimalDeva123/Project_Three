package Collection_Frameworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
	public static void main (String[]args)
	{
		
		TreeMap <Integer , String> TREE = new TreeMap<>();
		TREE.put(100, "Vimal");	
		TREE.put(20,"Raj");
		TREE.put(55,"Deva");
		System.out.println(TREE);
		System.out.println(TREE.remove(20));
		System.out.println(TREE.get(55));
		System.out.println(TREE.values());
		
		TREE.values();
		
		LinkedHashMap <Integer,String> T2 = new LinkedHashMap<>();
		
		T2.put(100, "Vimal");	
		T2.put(2,"Raj");
		T2.put(3000,"Deva");
		System.out.println(T2);
		
      HashMap <Integer,String> T3 = new HashMap<>();
		
		T3.put(156, "Vimal");	
		T3.put(289,"Raj");
		T3.put(3,"Deva");
		System.out.println(T3);
		
	}

}
