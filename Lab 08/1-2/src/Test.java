// 2020110975 ������
// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

// �� type�� �°� handling�� �����Ͽ���, 4���� Ŭ������ is-a �����̴�.
// Ư�� class�� ȣ���ϸ�, ���� class�� ȣ��Ǹ鼭 ȣ��� class�� ����ȴ�.

public class Test {
	public static void main(String[] args) {
		
		try
		{
			throw new Exceptions();
			//throw new ExceptionA();
			//throw new ExceptionB();
			//throw new ExceptionC();
		}
		
		catch(ExceptionC exception)
		{
			System.out.println(exception);
		}
		
		catch(ExceptionB exception)
		{
			System.out.println(exception);
		}
		
		catch(ExceptionA exception)
		{
			System.out.println(exception);
		}
		
		catch(Exception exception)
		{
			System.out.println(exception);
		}
	}
}

class Exceptions extends Exception{
	public void print()
	{
		System.out.println("Exceptions");
	}
}

class ExceptionA extends Exceptions{
	@Override
	public void print()
	{
		System.out.println("ExceptionA");
	}
}
class ExceptionB extends ExceptionA{
	@Override
	public void print()
	{
		System.out.println("ExceptionB");
	}
}
class ExceptionC extends ExceptionB{
	@Override
	public void print()
	{
		System.out.println("ExceptionC");
	}
}