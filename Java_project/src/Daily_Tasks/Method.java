package Daily_Tasks;

public class Method {

	public static void main (String [] args)
	{
		Method.Perimeter_Square();
		Method.Finding_average();
		System.out.println(Method.Find_ProductNumber());
		Method.Data();
	}
	
	// 2.Find perimeter of square and return its result using static method
	public static void Perimeter_Square()
	{
		int A = 100;
		int B = 100;
		int C = 100 ;
		int D = 100;
		int Perimeter = A+B+C+D  ;
		System.out.println("Perimeter of Square " + Perimeter);
	}
	// 3 .Find average of three numbers using static method (void)
	public static void Finding_average()
	{
		int A = 39 ;
		int B = 55 ;
		int C = 65 ;
		
		int Total = A+B+C ;
		int Average = Total/3;
		System.out.println("Average of Three Numbers  " + Average);
	}
	
	// 4.Find product of three numbers using static method and return its result
	public static  int Find_ProductNumber()
	{
		int Num1 = 1 ;
		int Num2 = 7 ;
		int Num3 = 12;
		
	    int product = Num1 * Num2 * Num3;
	    return product ;
	}
	// 6.Display your details (name, age, address) using static method
	
	public static void Data()
	{
		String Name = "Vimal";
		int Age = 23;
		String Address = "Chennai";
		System.out.println(Name + Age + Address);
	}
	
	
	
	
	
	
}
