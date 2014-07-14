import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Text_Files
{

	public static void main(String[] args) throws IOException
	{
		
		//creating a new file
		File f = new File("F:\\File Handling\\temp.txt");
		f.createNewFile();
		
		//writing into the created file
		/*
		FileWriter w = new FileWriter("F:\\File Handling\\temp.txt");
		BufferedWriter out = new BufferedWriter(w);
		
		out.write("hello we are writing in a file");
		out.newLine();
		out.write("This is a new line");
		out.flush();
		*/
		
		//reading from the file
		
		FileReader read = new FileReader("F:\\File Handling\\temp.txt");
		BufferedReader bfr = new BufferedReader(read);
		String x ="";
		
		
		while((x = bfr.readLine()) != null)
		{
			System.out.println(x);	
		}
		
		
	}

}
