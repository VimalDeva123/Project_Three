package Method;

public class Method {

	public static void main(String[] args) {
		 
		Method.Area();
		Method.MyPrivateName();
	}

	public static void Area()
	{
	    int lendth = 100 ;
	    int width = 80;
	    
	    int area = lendth * width ;
	    
	    System.out.println(area);
	}

	private static void MyPrivateName ()
	{
		System.out.println("Working as into Private Method");
		
	}
	
	
	
	
	
	
	
}
