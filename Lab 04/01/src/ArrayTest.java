//2020110975 문정원
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class ArrayTest
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40};
		
		System.out.printf("sumArray1D1 : %d, sumArray1D2 : %d\n", sumArray1D1(array), sumArray1D2(array));
	}
	
	//counter controlled for statement
	public static int sumArray1D1(int[] array)
	{
		int total = 0;
		
		for (int i = 0; i<array.length; i++)
			total += array[i];
		
		return total;
	}
	
	//enhanced for statement
	public static int sumArray1D2(int[] array)
	{
		int total = 0;
		
		for (int value : array)
			total+=value;
		
		return total;
	}
}