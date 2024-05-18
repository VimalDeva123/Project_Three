package Daily_Tasks;

public class Method_Overloading {

	public static void main(String[]args)
	{
   
		Method_Overloading.Customer_info("Vimal", 23);
		Method_Overloading.Customer_info(23, "Vimal");
		
	}
	
	// overload static method and display your details (name and age), ur company details(name and address)
	
	public static void  Customer_info(String Name , int Age)
	{
		System.out.println("Customer Name And Age " + Name + " "+ Age );
	}
	
	public static void  Customer_info(int Age , String Name)
	{
		System.out.println("Customer Age and Name " + Age + " "  + Name);
	}
	
	
	
	
	
	
	
	
}
