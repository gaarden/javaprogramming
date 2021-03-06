
public class Test {
	public static void main(String[] args)
	{
		Animal[] animal = new Animal[3];
		animal[0] = new Fish();
		animal[1] = new Frog();
		animal[2] = new Bird();
		
		for (Animal a: animal)
		{
			a.move();
			
			if (a instanceof Bird)
				((Bird)a).sleep();
		}
	}

}


class Animal
{
	public void move()
	{
		System.out.println("Animal.move");
	}
}

class Fish extends Animal
{
	public void move()
	{
		System.out.println("Fish.move");
	}
	
	public void sleep()
	{
		System.out.println("Fish.sleep");
	}
}

class Frog extends Animal
{
	public void move()
	{
		System.out.println("Frog.move");
	}
	
	public void sleep()
	{
		System.out.println("Frog.sleep");
	}
}

class Bird extends Animal
{
	public void move()
	{
		System.out.println("Bird.move");
	}
	
	public void sleep()
	{
		System.out.println("Bird.sleep");
	}
}