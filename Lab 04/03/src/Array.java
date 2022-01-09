
public class Array {
	public static void main(String[] args)
	{
		int[][] array = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		
		printArray1(array);
		printArray2(array);
	}
	
	public static void printArray1(int[][] n)
	{
		for (int i = 0; i<n.length; i++)
		{
			for (int j = 0; j<n[i].length; j++)
				System.out.printf("%d ", n[i][j]);
			System.out.println();
		}
	}
	
	public static void printArray2(int[][] n)
	{
		for (int[] small: n)
		{
			for (int value: small)
				System.out.printf("%d ", value);
			System.out.println();
		}
	}

}
