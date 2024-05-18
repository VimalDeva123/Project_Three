package File_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWrite_File {
	
	public static void main (String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Swarnalakshmi G\\OneDrive - NextPoint\\Documents\\Sample Documets\\vimal.xlsx");
		FileWriter Fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter (Fw);
		
		
		bw.write("Name ,Age , Dept\n");
		bw.write("Vimal . 23 , Tester");
		bw.close();
		
		
		
		
	}

}
