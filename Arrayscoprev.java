package javaprograms;

import java.util.Arrays;

public class Arrayscoprev {

	public static void main(String[] args) 
	{
		int []rollno=new int[5];
		rollno[0]=2;
		rollno[1]=4;
		rollno[2]=6;
		rollno[3]=8;
		rollno[4]=10;
		
		int []rollnoa=new int[rollno.length];
		for(int i=0,j=rollno.length-1;i<rollno.length;i++,j--)
		{
			rollnoa[j]=rollno[i];
		}
		System.out.println(Arrays.toString(rollnoa));
		System.out.println(Arrays.toString(rollno));
	}

}
