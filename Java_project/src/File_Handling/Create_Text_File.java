package File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.buffer\

import java.io.IOException;

public class Create_Text_File {
	
	
	public static void main (String[]args) throws IOException
	{
		
		File My_File_Path = new File("C:\\Users\\Swarnalakshmi G\\eclipse-workspace\\Java_project\\src\\File_Handling\\Vimal.txt");
		FileWriter File_Writer_Path = new FileWriter(My_File_Path);
		BufferedWriter Write_Content = new BufferedWriter (File_Writer_Path);
		Write_Content.write("Vimal");
		Write_Content.newLine();
		Write_Content.write(" Welcome Java Automation Tester Plateforme ");
		Write_Content.close();
		
		
		// Creating Excel File
		
		File My_File = new File("C:\\Users\\Swarnalakshmi G\\eclipse-workspace\\Java_project\\src\\File_Handling\\vimal.xlsx");
		FileWriter Create = new FileWriter(My_File);
		BufferedWriter Write = new BufferedWriter(Create);
		
		
		
		// Reading File
		
		File Myfile = new File("C:\\Users\\Swarnalakshmi G\\eclipse-workspace\\Java_project\\src\\File_Handling\\Vimal.txt");
		FileReader ReadMy_File = new FileReader (Myfile);
		BufferedReader Read = new BufferedReader(Read);
		
		boolean Line;
		
		while(Line = Read.readLine()!=null)
		{
			System.out.println(Line);
		}
		
		
	
	}

}
