package javaprograms;

import java.util.Scanner;

public class ScannerProgram 
{
   public static void main(String[] args) 
   {
	   Scanner s1=new Scanner(System.in);
	  String input= s1.next();
	  System.out.println("enter a value a");
	 int a=  s1.nextInt();
	 System.out.println("enter a value b");
	  Byte b= s1.nextByte();
	  System.out.println("enter a value f");
	   Float f=s1.nextFloat();
	   System.out.println("enter a value l");
	  Long l= s1.nextLong();
	  System.out.println("enter a value b1");
	  Boolean b1= s1.nextBoolean();
	  System.out.println("enter a value h");
	  Short h= s1.nextShort();
	  System.out.println("enter a value d");
	  Double d= s1.nextDouble();
	  s1.close();
	   
	   
	   
	   
	   
	   
	   
	
}
}
