package Bulitin_Class;

import java.util.Scanner;

public class Scanner_Class {
	
	public static void main (String[]args)
	{
		
		
	Scanner MyScanner = new Scanner(System.in);
	
	System.out.println("Enter Your Name");
	String Name = MyScanner.nextLine();
	System.out.println("Enter your Age");
	int Age = MyScanner.nextInt();
	System.out.println("Enter Your Salary");
	double Salary = MyScanner.nextDouble();
	
	
	System.out.println("Customer Name is "+Name);
	System.out.println("Customer Age is " +Age);
    System.out.println("Customer Salary is " +Salary);		
		
		
	}
}
