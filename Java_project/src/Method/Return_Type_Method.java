package Method;

public class Return_Type_Method {
	
	
	public static void main (String[] args) 
	{
		System.out.println(Return_Type_Method.Area());
		System.out.println(Return_Type_Method.Area_I());
		
		
	}
	
	public static int Area ()
	{
		
		int A = 10 ;
		int B = 15 ;
		int C = A+B ;
		return  C ;
		
		
		
	}
	
	
	private static int Area_I()
	{
		int F = 10;
		int G = 15 ;
		int H = F +G ;
		return H ;
		
		
	}

}
