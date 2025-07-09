package javaprograms;

import java.util.Arrays;

public class ArraysEqualProgram {  //WAP to check if the 2arrays are equal

	public static void main(String[] args) 
	{
		int []rollno=new int[4];//declaration of array
		rollno[0]=10;//Initialization of array
		rollno[1]=20;
		rollno[2]=30;
		rollno[3]=40;
		
		
		int []rollno1=new int[4];//declaration of array
		rollno1[0]=10;//Initialization of array
		rollno1[1]=20;
		rollno1[2]=30;
		rollno1[3]=40;
		
	boolean b1=Arrays.equals(rollno, rollno1);
	if(b1==true) 
	{
		System.out.println("the two arrays are equal");
	}
	else 
	{
		System.out.println("not equal");
	}
	}

}
