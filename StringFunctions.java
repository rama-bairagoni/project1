package javaprograms;

public class StringFunctions {

	public static void main(String[] args) 
	{
		String s="Ramadevi is a Testengineer ";
		String t="healthcare domain project";
String c="Bairagoni Rama Goud";
		System.out.println(s.length());
		System.out.println(t.length());
		System.out.println(s.replace('m', 'w'));
		System.out.println(s.replace('v', 'r'));
		System.out.println(s.replaceAll("test", "QA"));
		System.out.println(t.repeat(5));//
       System.out.println(s.concat((" ")+t.concat(" ")));
System.out.println(t.substring(11));
System.out.println(t.substring(11,18));
System.out.println(t.charAt(9));
System.out.println(c.replaceAll("[a-z]", ""));
System.out.println(c.replaceAll("[A-Z]", ""));

String e="K V No 123";
System.out.println(e.replaceAll("[0-9]", ""));

	}

}