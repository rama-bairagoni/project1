package javaprograms;

public class ExceptonHandling2 {

	public static void main(String[] args) 
	{
		try {
			
		int a=1/1;
		System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handlied Exception");
		}
		finally
		{
			System.out.println("closing the connection with the DataBase");
		}

	}

}
