// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class AnimalTest {
	public static void main(String[] args)
	{
		Animal[] animal = new Animal[3];
		animal[0] = new Fish(); // upcasting
		animal[1] = new Frog(); // upcasting
		animal[2] = new Bird(); // upcasting
		
		for (int i = 0; i<animal.length; i++)
			animal[i].move();
	}
}

class Fish extends Animal
{
	public void move()
	{
		System.out.println("Fish : move()");
	}
}

class Frog extends Animal
{
	public void move()
	{
		System.out.println("Frog : move()");
	}
}

class Bird extends Animal
{
	public void move()
	{
		System.out.println("Bird : move()");
	}
}

class Animal
{
	public void move()
	{
		System.out.println("Animal : move()");
	}
}
