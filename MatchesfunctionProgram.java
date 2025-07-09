package javaprograms;

import java.util.Arrays;

public class MatchesfunctionProgram {

	public static void main(String[] args) 
	{
		String s="college";
		//checking whether the given string start with c or not.
		System.out.println(s.matches("c(.*)"));//(.*) represent multicharacter search
      //checking whether the given the ending with e or not.
		System.out.println(s.matches("(.*)e"));
		//checking with given string having exact 7 letters in it.
		System.out.println(s.matches("......."));
		//checking with the given string is having man in it or not
		String t="Manager";
		
		System.out.println(t.matches("Man(.*)"));
		String r="manish kumar tiwari";
		 String[] c1=(r.split(" "));// wherever the space there it should split the string 
		 //like array string characters like[manish,kumar,tiwari]
		 System.out.println(Arrays.toString(c1));
		 String r1="manish kumar tiwari";
		 String[] c2=(r1.split("a"));// wherever a is  there it should split the string 
		 //like array string characters [m,nish,kum,r tiw,ri]
		 System.out.println(Arrays.toString(c2));
		 
		String[]c3 =r.split(" ", 2);//split it into 2times
		System.out.println(Arrays.toString(c3));
		 
		 
	}

}
