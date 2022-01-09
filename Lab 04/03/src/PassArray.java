//2020110975 문정원
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class PassArray
{
	public static void main(String[] args)
	{
		int[][] array = {{1,2,3},{4,5},{6,7,8,9}};
		
		printArray2D1(array);
		printArray2D2(array);
	}
	
	public static void printArray2D1(int[][] array)
	{
		for (int i = 0; i<array.length; i++)
		{
			for (int j = 0; j<array[i].length; j++)
				System.out.printf("%d ", array[i][j]);
			System.out.println();
		}
	}
	
	public static void printArray2D2(int[][] array)
	{
		for (int[] value: array)
		{
			for (int arr: value)
				System.out.printf("%d ", arr);
			System.out.println();
		}
			
	}
}