package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayatruntime {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int [] rollno=new int[s1.nextInt()];
			for(int i=0;i<=rollno.length-1;i++)
			{
				System.out.println("Enter the rollno at index poistion-> "+i);

					rollno[i]=s1.nextInt();
			}	

			s1.close();
				System.out.println("The array output is-> ");
			System.out.println(Arrays.toString(rollno));

	}

}
