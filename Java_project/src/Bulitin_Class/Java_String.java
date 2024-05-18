package Bulitin_Class;

public class Java_String {
	
	public static void main (String[]args)
	{
		
		
		String Name = "Vimal";
		
		System.out.println("String Lengh is " + Name.length());
		System.out.println("i index in String  " + Name.indexOf('i'));
		System.out.println("3 Char in String " + Name.charAt(3));
		
		
		System.out.println("Name in Lower Case " + Name.toLowerCase());
		System.out.println("Name in Upper Case " + Name.toUpperCase());
		
		System.out.println(Name.replace('V', 'K'));
		System.out.println(Name.replaceAll("Vimal", "Raj"));
		
	}

}
