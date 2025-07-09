package javaprograms;

import java.util.Arrays;

public class ToCharArrayFunction {

	public static void main(String[] args) 
	{

		int []rollno=new int[4];//declaration of array
		rollno[0]=1;//Initialization of array
		rollno[1]=2;
		rollno[2]=3;
		rollno[3]=4;
		
		String name="BairagoniRama";
		char[] c1=name.toCharArray();
		
	
		
System.out.println(Arrays.toString(c1));
System.out.println(Arrays.toString(rollno));


	}

}
