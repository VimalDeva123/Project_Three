package Frame_work_Collections;

import java.util.ArrayList;

public class Array_List {
	
	
	public static void main (String[]args)
	{
		ArrayList <Integer> MyArray = new ArrayList <Integer>();
		MyArray.add(12);
		MyArray.add(72);
		MyArray.add(89);
		MyArray.add(100);
		MyArray.add(236);
		MyArray.add(00);
		MyArray.add(25);
		MyArray.add(89);
		MyArray.add(78);
		MyArray.remove(4);
		System.out.println(MyArray.get(1));
		System.out.println(MyArray);
		
		for (int A : MyArray)
		{
			System.out.println("My Array List Value's"+A);
		}
		
		
		ArrayList <String> Player = new ArrayList <String>();
		Player.add("Vimal");
		Player.add("Dhoni");
		
		
		
		for (String B :Player)
		{
			System.out.println(B);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
