// 2020110975 ������
// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

import java.util.EnumSet;

enum MyColor
{
	WHITE("Nina"),
	BLACK("Yuna"),
	YELLOW("Sumi"),
	RED("Mimi");
	
	private final String name;


	MyColor(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}

public class ColorTest2 {
	public static void main(String[] args)
	{
		for (MyColor mycolor: MyColor.values())
			System.out.printf("%s-%s\n", mycolor, mycolor.getName());
		
		System.out.println();
		
		for (MyColor mycolor: EnumSet.range(MyColor.BLACK, MyColor.YELLOW))
			System.out.printf("%s-%s\n", mycolor, mycolor.getName());
	}

}
