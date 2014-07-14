import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Readingprop {

	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream ip =  new FileInputStream("F:\\JAVA\\String_Functions\\src\\config\\Employee.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("Hobbies"));
		
	}

}
