package javaprograms;

public class Stringprgrm {

	public static void main(String[] args) 
	{
		String s="abc";    //string immutable      
	String s2	=s.concat("pqr");
	String s3=s2.concat("wrg");
System.out.println(s2);
System.out.println(s3);

  StringBuffer s5=new StringBuffer();//StringBuffer is mutable
  s5.append("sdfdffdsd");
  System.out.println(s5);
  
  StringBuffer s6=new StringBuffer("abcd");//StringBuffer is mutable
  s6.append("xyz");
  System.out.println(s6);
	}
	

}
