//2020110975 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

public class Test
{
	private static int num1;
	private int num2;
	
	public static void show1()
	{
		System.out.println(num1);//(1)O show1�� num1�� ��� static �����̴�.
		System.out.println(num2);//(2)X show1�� static ����������, num2�� nonstatic �����̴�.(static���� nonstatic�� ���������� ȣ���ϴ� ���� �Ұ����ϴ�.)
		show4();//(3)O show1�� show4�� ��� static �����̴�.
		show5();//(4)X show1�� static ����������, show5�� nonstatic �����̴�.
	}
	
	public void show2()
	{
		System.out.println(num1);//(5)O show2�� nonstatic �����̴�.(���� Ŭ���� ��, nonstatic ������ nonstatic, static ������� ��� ���� �����ϴ�.)
		System.out.println(num2);//(6)O show2�� nonstatic �����̴�.
		show4();//(7)O show2�� nonstatic �����̴�.
		show5();//(8)O show2�� nonstatic �����̴�.
	}
	
	public static void show4() {}
	public void show5() {}
}