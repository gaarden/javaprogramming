
public class PayableInterfaceTest {
	public static void main(String[] args)
	{
		TestInterface ti = new Invoice();
		ti.printInfo();
		//ti.showInfo();
		((Payable)ti).showInfo();
		System.out.println(ti);
		
		Payable pay = new TestObject();
		pay.printInfo();
		pay.showInfo();
		System.out.println(pay);
		((TestObject)pay).showInfo();
		
		TestObject to = new TestObject();
		to.showInfo();
		
		Employee emp = new SalariedEmployee();
		emp.printInfo();
		System.out.println(emp);
		
		TestObject tobj = new Test1();
		tobj.tellInfo();
		System.out.println(tobj.getClass());
		
	}

}

interface TestInterface
{
	public default void printInfo()
	{
		System.out.println("TestInterface: printInfo");
	}
}

interface Payable extends TestInterface
{
	public default void showInfo()
	{
		System.out.println("Payable: showInfo");
	}
}

class Employee implements Payable
{
	
}

class Invoice implements Payable
{
	public void tellInfo()
	{
		System.out.println("Invoice: tellInfo");
	}
	
	public void printInfo()
	{
		System.out.println("Invoice: printInfo");
	}
	
	public void showInfo()
	{
		System.out.println("Invoice: showInfo");
	}
}

class SalariedEmployee extends Employee
{
	public void printInfo()
	{
		System.out.println("SalariedEmployee: printInfo");
	}
	
	public void showInfo()
	{
		System.out.println("SalariedEmployee: showInfo");
	}
	
	public String toString()
	{
		String info;
		info = "SalariedEmployee: toString";
		
		return info;
	}
}

class TestObject extends Invoice
{
	public void tellInfo()
	{
		System.out.println("TestObject: tellInfo");
	}
}

class Test1 extends TestObject
{
	public void printInfo()
	{
		System.out.println("Test: printInfo");
	}
	
	public void showInfo()
	{
		System.out.println("Test: showInfo");
	}
	
	public String toString()
	{
		String info;
		info = "Test: toString";
		
		return info;
	}
	
	
}