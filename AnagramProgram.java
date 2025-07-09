package javaprograms;

import java.util.Arrays;

public class AnagramProgram {         //WAP to check if the given 2 strings are anagram
	//from
	//form       

	public static void main(String[] args) 
	{

	String s1="from";
	String s2="form";
	
	if(s1.length()!=s2.length())
	{
		System.out.println("They are not anagrams");
	}
	else {
	}
	
	char []c1=s1.toCharArray();//[f,r,o,m]
	char []c2=s2.toCharArray();//[f,o,r,m]
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	System.out.println(Arrays.toString(c1));//[f,m,o,r]
	System.out.println(Arrays.toString(c2));//[f,m,o,r]
	
	if(Arrays.equals(c1, c2)==true) 
	{
		System.out.println("They are anagram");
	}
	}

}
