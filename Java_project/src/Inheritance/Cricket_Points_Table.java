package Inheritance;

public class Cricket_Points_Table extends Cricket_Player_Runs {
	
	
	public static void main (String[]args)
	{
		
		System.out.print("Ind 6 Matches Won\n");
		System.out.print("Aus 5 Matches Won\n");
		System.out.print("SL 4 Matches Won\n");
		System.out.print("NewZ 3 Matches Won\n");
		System.out.print("SA 2 Matches Won\n");
		System.out.print("Pak 1 Matches Won\n");
	
		
		
		Cricket_Player_Runs My_Inher_Obj = new Cricket_Player_Runs();
		My_Inher_Obj.Scored_Runs();
		My_Inher_Obj.Taken_Wickets();
		
		
		
	}
	

}
