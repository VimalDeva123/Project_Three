package Condional_Statemen;

public class If_Condiotion {
	
	public static void main(String[]args)
	{
		//If else Condition
		
		int Customer_Amount = 150;
		int Ticket_Price = 100;
		
		
		if(Customer_Amount == Ticket_Price)
		{
			System.out.println("True");
		}
		
		else
		{
			System.out.println("False");
		}
		
		
		//Nested If Else Condition
		
		if(Customer_Amount == Ticket_Price)
		{
			System.out.println("Ticket Price Equal");
		}
		
		else if (Customer_Amount > Ticket_Price)
		{
			System.out.println("Customer Amount Large");
		}
		
		else if (Customer_Amount < Ticket_Price)
		{
			System.out.println("Ticket Price Large");
		}
		
	}
	
	
	

}
