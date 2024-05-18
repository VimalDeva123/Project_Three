package Daily_Tasks;

public class Do_While_Loop {
	public static void main(String[] args)
	{
		// print odd numbers from 1 to 13 using while loop		
		int Count = 1;
		do
		{
			if (Count % 2 != 0)
			{
				System.out.println(Count);
			}
			Count ++;
		}
		
		while(Count <=13);
	}
}
