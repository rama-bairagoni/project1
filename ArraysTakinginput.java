package javaprograms;

import java.util.Arrays;         //WAP to accept the values of array at run time
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraysTakinginput {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of array");
		try 
		{
			
		int[] rollno=new int[s1.nextInt()];
		for(int i=0;i<rollno.length;i++) 
		{
			System.out.println("Enter the rollno at index position->"+i);
			
			rollno [i]=s1.nextInt();
     
		}
		System.out.println("The array output is-> ");
		System.out.println(Arrays.toString(rollno));
		}
		catch(NegativeArraySizeException n1) 
		{
			System.out.println("please enter the positive value instead of negative value");
		}
		catch(InputMismatchException n2) 
		{
			System.out.println("please enter the positive value instead of String value");
		}
s1.close();
	}

}
