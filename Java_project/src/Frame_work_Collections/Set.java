package Frame_work_Collections;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	
	public static void main(String[]args)
	{
		
		TreeSet<String> Name = new TreeSet<String>();
		LinkedHashSet<String>NameTwo = new LinkedHashSet<String>();
		HashSet<String> Name_Three = new HashSet<String>();
		
		Name.add("Apple");
		Name.add("Dog");
		Name.add("Cat");
		Name.add("Lap Top");
		
		NameTwo.add("Apple");
		NameTwo.add("Dog");
		NameTwo.add("Cat");
		NameTwo.add("Lap Top");
		
		Name_Three.add("Apple");
		Name_Three.add("Dog");
		Name_Three.add("Cat");
		Name_Three.add("Lap Top");
		
		System.out.println(Name);
		System.out.println(NameTwo);
		System.out.println(Name_Three);
		
		
		
	}
	

}
