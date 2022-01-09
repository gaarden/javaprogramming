// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

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
