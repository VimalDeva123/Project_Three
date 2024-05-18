package Opps_Topic;

public class Over_Riding_Class extends Over_riding_parent {

	
	public static void main(String[]args)
	{
		Over_riding_parent Call_Parent = new Over_riding_parent();
		
		Over_Riding_Class Call_Child  = new Over_Riding_Class();
		
		Call_Parent.customer_info();
		Call_Child.customer_info();
		
		
		
	}
	
	
	
	
	public void customer_info()
	{
	 System.out.println("MS Dhoni Cricketer");	
	}
	
}
