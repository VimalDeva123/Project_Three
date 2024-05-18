package Opps_Topic;

public class Static_method_Overload {
	
	
	public static void main(String []args)
	{
		Static_method_Overload.Display_Customer_info("Vimal",23);
		Static_method_Overload.Display_Customer_info(23);
		Static_method_Overload.Display_player_Name("Dhoni", 100);
		Static_method_Overload.Display_player_Name(100, "Dhoni");
	}
	
	// Static  Method Overloading using Difference Parameter and Data Type
	public static void Display_Customer_info(String Name , int Age)
	{
		System.out.println("Customer Name is " + Name + "Customer Age is " + Age);
	}
	
	public static void Display_Customer_info(int Age)
	{
		System.out.println("Customer Age is " + Age);
	}
	
	// Static  Method Overloading using Values Sequence
	
	public static void Display_player_Name(String name , int Runs)
	{
		
		System.out.println("Player Name is " + name + "Player runs is " + Runs);
	
	}
	
	public static void Display_player_Name(int Runs , String name)
	{
		System.out.println("Player Runs is "  + Runs + "Player Name is " + name);
	}
	
	

}
