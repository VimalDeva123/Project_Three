package Operators;

public class Logical_Operators {
	
	public static void main(String[]args)
	{ 
		int Required_Age = 18 ;
		int Input_Age_One = 15 ;
		int Input_Age_Two = 21 ;
		
		//AND Operators
		if (Required_Age <= Input_Age_One && Required_Age <=Input_Age_Two)
		{
			System.out.println("Eligible");
		}
		
		else
		{
			System.out.println("Not Eligible");
		}
		
		// OR Operators 
		
		if (Required_Age <= Input_Age_One || Required_Age <= Input_Age_Two)
			
		{
			System.out.println("Eligible");
		}
		
		else
		{
			System.out.println("Not Eligible");
		}
		
		//NOT Operators
		
		boolean x =  true ;
		
		if (!x)
		{
			System.out.println("true");
		}
		
		else
		{
			System.out.println("false");
		}	
	}
}
