import java.io.*;
public class InputStream {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);
		
		System.out.println("enter a integer value");
		int a=Integer.parseInt(br.readLine());
		
		System.out.println("enter a string");
		String s=br.readLine();
		System.out.println("integer value is:" +a);
		System.out.println("string value is:" +s);
	}

	
}
