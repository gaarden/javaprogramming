
public class Array {
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40};
		System.out.printf("sum: %d\nsum: %d", control(array), enhance(array));
	}
	
	public static int control(int[] array)
	{
		int sum = 0;
		for (int i = 0; i<array.length; i++)
			sum += array[i];
		
		return sum;
	}
	
	public static int enhance(int[] array)
	{
		int sum = 0;
		for (int value: array)
		{
			sum += value;
		}
		
		return sum;
	}

}
