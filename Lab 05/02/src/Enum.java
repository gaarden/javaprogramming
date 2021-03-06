import java.util.EnumSet;

enum Data
{
	WHITE("Nina"),
	BLACK("Yuna"),
	YELLOW("Sumi"),
	RED("Mimi");
	
	private final String name;
	
	Data(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}

public class Enum {
	public static void main(String[] args)
	{
		for (Data data: Data.values())
			System.out.printf("%s-%s\n", data, data.getName());
		
		for (Data data: EnumSet.range(Data.BLACK, Data.YELLOW))
			System.out.printf("%s-%s\n", data, data.getName());
	}
}
