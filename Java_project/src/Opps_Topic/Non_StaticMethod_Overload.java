package Opps_Topic;

public class Non_StaticMethod_Overload {
	
 public static void main(String[]args)
 {
	 Non_StaticMethod_Overload Call_Obj = new Non_StaticMethod_Overload();
     Call_Obj.Display_Phone_Name("Redmi", 10000);	 
     Call_Obj.Display_Phone_Name("Redmi", 10000);
 
 
 }
 
 //Non static Method Overloading using Different Parameter and Data Type
 public void Display_Phone_Name(String Name , int Price)
 {
	 System.out.println("Mobile Name is " + Name + "Mobile Price is " + Price);
 }

 

 public void Display_Phone_Name(String Name , double Price)
 {
	 System.out.println("Mobile Name is " + Name + "Mobile Price is " + Price);
 }
	

}
