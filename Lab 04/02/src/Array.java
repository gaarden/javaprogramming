
public class Array {
	public static void main(String[] args)
	{
		int[][] a = new int[3][];
		a[0] = new int [2];
		a[1] = new int [1];
		a[2] = new int [3];
		
		for (int i = 0; i<a.length; i++)
		{
			for (int j = 0; j<a[i].length; j++)
			{
				a[i][j] = 1;
			}
		}
		
		for (int small[]: a)
		{
			for (int value: small)
				System.out.printf("%d ", value);
			System.out.println();
		}
	}
}
