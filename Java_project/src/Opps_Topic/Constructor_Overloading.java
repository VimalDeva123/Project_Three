package Opps_Topic;

public class Constructor_Overloading {
	
	
	public static void main(String[]args)
	{
		
		Constructor_Overloading Call_Const = new Constructor_Overloading ();
		Constructor_Overloading Call_Const_ = new Constructor_Overloading();
		
		
	}
    public Constructor_Overloading (int Age)
    {
    	Age = 22;
    	System.out.println(Age);
    }
    public Constructor_Overloading ()
    {
    	 int Age = 50;
    	 System.out.println("Age is " + Age);
    }
}
