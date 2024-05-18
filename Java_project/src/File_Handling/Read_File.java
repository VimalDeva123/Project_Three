package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File {
	
	public static void main(String[] args) throws IOException {
		

		
		File f= new File("C:\\Users\\Swarnalakshmi G\\OneDrive - NextPoint\\Documents\\Sample Documets\\vimal.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		} } }