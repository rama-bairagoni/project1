package javaprograms;

import java.util.Arrays;

public class ArraycopingReverse {         //WAP to copy the array from one to another in reverse manner
                                                    
	public static void main(String[] args) 
	{
		int [] rollnoA=new int[5];
		rollnoA[0]=11;//Initialization of array
		rollnoA[1]=22;
		rollnoA[2]=33;
		rollnoA[3]=44;
		rollnoA[4]=55;
		
		int [] rollnoB=new int[rollnoA.length];                       //rollnoA.length-1 is giving the last index of the rollnoA
		for(int i=0,j=4;i<5;i++,j--)      
		{
			rollnoB[j]=rollnoA[i];//rollnoB[2]=ROLLNO[1]
			//i=0,j=4,rollnoB[4]=55;
			//i=1,j=1,rollnoB[1]=22;
			//i=2,j=0,rollnoB[0]=11;
		}
		System.out.println("Input Array roolnoA is: ->"+Arrays.toString(rollnoA));
		System.out.println("output Array rollnoB is: ->"+Arrays.toString(rollnoB));
	}
	}


