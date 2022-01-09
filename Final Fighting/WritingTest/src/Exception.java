
public class Exception {

	public static void throwException() throws Exception
	{
		try
		{
			System.out.println("A");
			throw new Exception();
			System.out.println("B");
		}
		
		catch(Exception exception)
		{
			System.out.println("C");
			throw exception;
		}
		
		finally
		{
			System.out.println("D");
		}
		
		System.out.println("E");
	}
}
