//2020110975 문정원
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class Test
{
	private static int num1;
	private int num2;
	
	public static void show1()
	{
		System.out.println(num1);//(1)O show1과 num1이 모두 static 형식이다.
		System.out.println(num2);//(2)X show1은 static 형식이지만, num2는 nonstatic 형식이다.(static에서 nonstatic을 직접적으로 호출하는 것은 불가능하다.)
		show4();//(3)O show1과 show4가 모두 static 형식이다.
		show5();//(4)X show1은 static 형식이지만, show5는 nonstatic 형식이다.
	}
	
	public void show2()
	{
		System.out.println(num1);//(5)O show2가 nonstatic 형식이다.(같은 클래스 내, nonstatic 형식은 nonstatic, static 상관없이 모두 접근 가능하다.)
		System.out.println(num2);//(6)O show2가 nonstatic 형식이다.
		show4();//(7)O show2가 nonstatic 형식이다.
		show5();//(8)O show2가 nonstatic 형식이다.
	}
	
	public static void show4() {}
	public void show5() {}
}