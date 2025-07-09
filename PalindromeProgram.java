package javaprograms;

public class PalindromeProgram {

	public static void main(String[] args)
	{
		String input="rotator";
		String output="";
		for(int i=input.length()-1;i>=0;i--) 
		{
			char c1=input.charAt(i);//returns the char value at a specified index
			output=output+c1;   
		}
		System.out.println("This is a input->" +input);
		System.out.println("This is a output->" +output);


		if(input.equals(output)) 
	{
		System.out.println("They are palindrome");
	}
		else
		{
			System.out.println("They are not palindrome");
		}

}
}

