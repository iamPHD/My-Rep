
public class Str_Func 
{

	public static void main(String[] args)
	{
		
		String str = "The rains have started here";
		String str1 = "The rains have started here";
		
		System.out.println(str.length());
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf('v'));
		System.out.println(str.indexOf("r", 5));
		
		System.out.println(str.indexOf("hello"));
		System.out.println(str.indexOf("rains"));
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.substring(0,10));
		
		
		System.out.println("****************");
		String temp[] = str.split("have");
		
		for (int i=0; i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
		
		
		String x="100";
		int i=Integer.parseInt(x);
		
		String z= String.valueOf(i);
		
		
		
		
		

	}

}
