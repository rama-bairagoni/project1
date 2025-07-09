package javaprograms;

public class ReverseProgram1 {

	public static void main(String[] args) {
		String input="college";
		String output="";
		for(int i=input.length()-1;i>=0;i--) 
		{
			char c1=input.charAt(i);//returns the char value at a specified index
			output=output+c1;   //Concatenate value "" +e="e"
			                      //Concatenate value "" +g="g"
		}
		System.out.println(output);
	}

}
//i=6,c1=e,output=e
//i=5,c1=g,output=e+g=eg
//i=4,c1=e,output=e+g+e=ege
//i=3,c1=l,output=e+g+e+l=egel
//i=2,c1=l,output=e+g+e+l+l=egell
//i=1,c1=o,output=e+g+e+l+l+o=egello
//i=0;c1=c,output=e+g+e+l+l+o+c=egelloc