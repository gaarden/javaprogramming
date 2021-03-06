// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

// 각 type에 맞게 handling을 구현하였고, 4개의 클래스는 is-a 관계이다.
// 특정 class를 호출하면, 상위 class가 호출되면서 호출된 class가 실행된다.

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