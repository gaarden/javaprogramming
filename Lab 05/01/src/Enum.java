
enum what {WHITE, BLACK, YELLOW, RED};

public class Enum {
	public static void main(String[] args)
	{
		what[] array = what.values();
		
		for (what name: array)
			System.out.println(name);
	}

}
