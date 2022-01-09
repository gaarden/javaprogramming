
public class Test
{

	public static void main(String[] args) 
	{
		F f = new F();
		f.methodA();
		f.methodB();
		f.methodC();
		f.methodD();
	}

}

interface A
{
	public abstract void methodA();
}

interface C extends A
{
	public abstract void methodC();
}

interface D 
{
	public abstract void methodD();
}

class B
{
	public void methodB()
	{
		System.out.println("methodB");
	}
}

class E extends B implements C, D
{
	public void methodA()
	{
		System.out.println("implementation of methodA in class E");
	}
	public void methodC(){
	}
	public void methodD(){
	}

}

class F extends E
{
	public void methodC()
	{
		System.out.println("implementation of methodC in class F");
	}
	
	public void methodD()
	{
		System.out.println("implementation of methodD in class F");
	}
}