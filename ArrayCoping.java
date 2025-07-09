package javaprograms;

import java.util.Arrays;
                                            //WAP to copy the array from one to another
public class ArrayCoping {

	public static void main(String[] args) 
	{
		int [] rollnoA=new int[3];
		rollnoA[0]=11;//Initialization of array
		rollnoA[1]=22;
		rollnoA[2]=33;
		
		int [] rollnoB=new int[rollnoA.length];
		for(int i=0;i<3;i++) 
		{
			rollnoB[i]=rollnoA[i];
		}
		System.out.println("Input Array is: ->"+Arrays.toString(rollnoA));
		System.out.println("output Array is: ->"+Arrays.toString(rollnoB));
	}

}
