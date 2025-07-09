package javaprograms;

public class MethodOverloading 
{
    public void sum() 
    {
    	System.out.println("execute1");
    }
    public void add(int a) 
    {
    	System.out.println("execute2");
    }
    public void mult(int a,double b) 
    {
    	System.out.println("execute3");
    }
    public void div(double a,double b) 
    {
    	System.out.println("execute4");
    }
   
    public static void main(String[] args) 
    {
    
		MethodOverloading m1=new MethodOverloading();
		m1.sum();
		MethodOverloading m2=new MethodOverloading();
		m2.add(23);
		MethodOverloading m3=new MethodOverloading();
		m3.mult(234, 2.33655);
		MethodOverloading m4=new MethodOverloading();
		m4.div(2.345453, 3.3653253);
	
	}
    
}
