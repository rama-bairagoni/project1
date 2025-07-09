package javaprograms;
                                          //WAP to find the average for the numbers present in the array type
public class ArraysAvgnmbrs {                     // example:(4+6+7+6)/4
                                                    //(4+6+7+6) for this we calculate first sum
	public static void main(String[] args) 
	{

		double sum=0;
		double [] rollno=new double[3];
		rollno[0]=11;//Initialization of array
		rollno[1]=22;
		rollno[2]=33;
		
		for(int i=0;i<rollno.length;i++)
		{
	  sum=sum+rollno[i];//i=0;sum=0+11=11
	 //i=0;sum=11+22=33
	//i=0;sum=11+22+33=66
		}
			 		System.out.println(sum);
			 		double Avarage=sum/rollno.length;
		
		System.out.println("The array output is-> "+Avarage);
	

	}

	}


