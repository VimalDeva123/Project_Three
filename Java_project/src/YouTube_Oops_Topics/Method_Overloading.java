package YouTube_Oops_Topics;

public class Method_Overloading {
	
	public static void main(String[]args)
	
	{
		//Calling Non Static Method Overloading Function
		Method_Overloading Obj1 = new Method_Overloading();
		Obj1.Laptop();
		Obj1.Laptop(5);
		
		//Calling Static Method Overloading Function
		Method_Overloading.Laptop_price(50);
		Method_Overloading.Laptop_price(100.55);
		
		//Calling Order Changing Overloading Function
		Method_Overloading  Obj2 = new Method_Overloading();
		Obj2.Cricket(100, 50);
		Obj2.Cricket(450, 350, 150);
		
	}
	// Creating Same Method Name in Method Overloading(Using parameter Concept) Non Static Method.
	public void Laptop()
	{
		System.out.println("My Laptop Company is HP");
	}
	public void Laptop(int a)
	{
		System.out.println("My Laptop Count is " + a);
	}
	//Creating Same Method Name in Method Overloading (Using Different Data Type) Static Method
	
	public static void Laptop_price(int A)
	{
		System.out.println("(int Data Type)My Laptop Price is " + A);
		
	}
	public static void Laptop_price(double A)
	{
		System.out.println("(Double Data Type) My Laptop price is " + A );
	}

	
	
	
	//Creating Method Overloading using Order Changing Type
	
	public void  Cricket(int A , int B )
	{
		System.out.println("My Cricket Bat Price is " +  A + "My Cricket Ball Price is " + B );
		
	}
	
	public void Cricket(int B , int A , int C)
	{
		System.out.println("My Cricket Bat price is " + B + "My Cricket Ball Price is " + A + "My Cricket Stump Price is " + C);
	}
	
	

}
