package javaprograms;

public class Stringfunctions1 {
public static void main(String[] args) 
{
	String s="college";
	String s1="COLLEGE";
	String t="           Automation batch 54";
	 boolean b3=s1.equalsIgnoreCase(s);
	 System.out.println(b3);
	boolean b1=s.equals(s1);
	System.out.println(b1);
	String b="Manish Kumar tiwari";
	boolean b2=b.contains("Kumar");
	System.out.println(b2);	
	System.out.println(s.charAt(3));
	int i=s.indexOf('o');
System.out.println(i);
System.out.println(s.lastIndexOf('e'));
System.out.println(t);

System.out.println(t.trim());
	}

}
