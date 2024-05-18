package Methods_Two;

public class Return_Type {

	public static void main(String[]args)
	{
		System.out.println(Return_Type.T());
		Return_Type.Name_info("Vimal", 23);
	}
	
	
	
	public static int T() {
		int A =10;
		int B = 100;
		int C = A+B;
		return C;
	}
	
	
	public static void Name_info(String Name , int Age)
	{
		System.out.println("Customer name is "  + Name +
				"\n Customer Age is " + Age) ;
		
	}
	
	
}
