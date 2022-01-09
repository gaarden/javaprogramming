
class ArrayTest
{
	String name;
	int age;
	
	public ArrayTest(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return name+age;
	}
}

public class Array {
	public static void main(String[] args)
	{
		String[] names = {"전정국", "정호석", "김남준"};
		int[] ages = {1997, 1994, 1994};
		
		ArrayTest[] arrays = new ArrayTest[3];
		
		for (int i = 0; i<names.length; i++)
			arrays[i] = new ArrayTest(names[i], ages[i]);
		
		for (int i = 0; i<arrays.length; i++)
			System.out.printf("%s\n", arrays[i]);
		
		for (ArrayTest data: arrays)
			System.out.printf("%s\n", data);
	}

}