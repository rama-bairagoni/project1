package javaprograms;

interface oneA
{
	int a=20;
	int b=40;
	void add();
	void sub();
}
interface oneB extends oneA
{
	void mult();
	void div();
}

public class InterfaceclassPrgrm implements oneB {

	public static void main(String[] args) 
	{
		InterfaceclassPrgrm i1=new InterfaceclassPrgrm();
		i1.add();
		i1.sub();
		i1.mult();
		i1.div();

	}

	@Override
	public void add() {
		
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		
		System.out.println(a-b);
	}

	@Override
	public void mult() {
		
		System.out.println(a*b);
	}

	@Override
	public void div() 
	{
		System.out.println(a/b);
	}

}
