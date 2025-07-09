package javaprograms;

import java.util.Arrays;

public class ArraysAvg {

	public static void main(String[] args)
	{
		int sum=0;
		int [] rollno=new int[5];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;
		rollno[3]=4;
		
		for(int i=0;i<=rollno.length;i++) 
		{
			sum=sum+i;
			
		}
            int avg=sum/rollno.length;
            System.out.println(Arrays.toString(rollno));
            System.out.println(avg);
	}

}
