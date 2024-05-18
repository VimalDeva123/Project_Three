package Super_key_Word;

public class Child_Super_Keyword extends Parent_Super_keyword {
	
	int Vimal_Age = 20;
	
	
	public static void main(String[]args)
	{
		Child_Super_Keyword Call_Obj = new Child_Super_Keyword();
		Call_Obj.display();
		
	}
	
	public void display()
	{
		System.out.println(Vimal_Age);
		System.out.println(super.Vimal_Age);
	}
	

}
