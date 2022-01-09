
public class overloading {
	public static void main(String[] args)
	{
		System.out.println(plus(7, 4));
		System.out.println(plus(3.8, 7.4));
		
	}
	
	public static int plus(int inta, int intb)
	{
		return inta+intb;
	}
	
	public static double plus(double da, double db)
	{
		return da+db;
	}
}
