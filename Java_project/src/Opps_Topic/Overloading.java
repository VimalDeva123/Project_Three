package Opps_Topic;

public class Overloading {
	
	public static void main(String[]args)
	{
		
		Overloading.Area();
		Overloading.Area(8);
		Overloading.Area(5);
		
		Overloading Obj1 = new Overloading();
		Overloading Obj2 = new Overloading(3);
		Overloading Obj3 = new Overloading(3.9);
	}
	
	public static void Area()
	{
		
		System.out.println("Hi Vimal This is Just Example");
	}
	
	public static void Area(int s)
	{
		System.out.println("Area od Square" + s *s);
	}
	
	public static void Area(double s)
	{
		System.out.println("Area of Square " + s*s);
	}
	
	// Method OverLoading in Constructor

	public Overloading()
	{
		System.out.println("This is Example of Constuctor");
	}
	
	public Overloading(int a)
	{
		System.out.println("Area of Square " + a *a);
	}

	public Overloading(double a)
	{
		System.out.println("Area of Square " + a *a);
	}
	
	
	
}
