
public class FindError {

	public interface A
	{
		public static final int num = 100;
		public abstract void methodA();
	}
	
	interface B extends A
	{
		void methodB();
	}
	
	abstract class C implements A
	{
		public C()
		{
			;
		}
	}
	
	abstract class D extends C
	{
		void methodD()
		{
			;
		}
	}
}
