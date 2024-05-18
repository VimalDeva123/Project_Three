package Collection_Youtube;
import java.util.ArrayList;

public class Array_Method {
	
	
	public static void main (String[]args)
	{
	         Array_Method.String_Array();	
	         Array_Method.Float_Array();
	}
	
	static void String_Array()
	{
		ArrayList<Integer> MyString = new ArrayList<Integer>();
		MyString.add(100);
		MyString.add(150);
		MyString.add(500);
		MyString.add(1000);
		MyString.add(986);
		
		
		System.out.println(MyString);
		System.out.println(MyString.size());
		System.out.println(MyString.get(3));
		System.out.println(MyString.removeAll(MyString));
	}
	
    static void Float_Array()
    {
    	ArrayList<Float> MyFloat = new ArrayList<Float>();
    	MyFloat.add(15.50f);
    	MyFloat.add(50.7f);
    	MyFloat.add(78.55f);
    	MyFloat.add(45.44f);
    	System.out.println(MyFloat);
    }
 
    static void List()
    {
    	
    	ArrayList<E> MyList = new ArrayList<>();
    	
    	
    	
    }
}
