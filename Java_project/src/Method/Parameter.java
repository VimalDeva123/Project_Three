package Method;

public class Parameter {

	public static void main(String[] args) {
		Parameter.Customer_Information("Vimal", 23);
		System.out.println("Div Function Value is " + Parameter.Div_Fun(5.5, 8.88));
		
		

	}

	
	public static void Customer_Information(String Name,int Age)
	{
		System.out.println("Name is " + Name);	
		System.out.println("Age is " + Age);
	
	
	}
	
	
	public static double Div_Fun(double d1,double d2)
	{
		return d1/d2;
	}
	
	
	
}
