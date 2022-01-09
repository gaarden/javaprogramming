// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

enum Color
{
	WHITE, BLACK, YELLOW, RED;
}


public class ColorTest
{
	public static void main(String[] args)
	{
		for (Color color: Color.values())
			System.out.printf("%s\n", color);
	}
}