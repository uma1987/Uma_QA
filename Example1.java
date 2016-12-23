package Example;

public class Example1 {
		
		String firstname;
		String lastname;
		String dob;
		public Example1(String firstname,String lastname,String dob)
		{
			this.firstname=firstname;
			this.lastname=lastname;
			this.dob=dob;
			System.out.println(firstname+""+lastname+""+dob);
		}
	
		public static void main(String args[])
		{
			Example1 e=new Example1("sam","sid","aug30");
			
		}

}
