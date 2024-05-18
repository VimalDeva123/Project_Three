package Constructor;

public class Sample_Constructor {
	
	public Sample_Constructor()
	{
		int A = 23;
		System.out.println("Customer Age is " + A);
		
	}
	
	public Sample_Constructor(double A)
	{
		
		System.out.println("Customer Age is " + A);
		
	}
	
	public static void main (String [] args)
	{
		Sample_Constructor Obj_Con = new Sample_Constructor();
		Sample_Constructor Obj_Con1 = new Sample_Constructor(3.4);
	}
}
