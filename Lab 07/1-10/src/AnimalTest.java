// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class AnimalTest {
	public static void main(String[] args)
	{
		GoldFish goldFish = new GoldFish();
		goldFish.show();
		
		Animal animal = new Fish();
		//animal.draw(); // Animal class 내에 draw method 존재하지 않는다.
		
		Animal animal2 = new Fish();
		animal2.show();
		animal2.move();
		
		Animal animal3 = new GoldFish();
		((Fish)animal3).draw();
	}
}

class GoldFish extends Fish
{
	public void draw()
	{
		System.out.println("GoldFish : draw()");
	}
	
	public void move()
	{
		System.out.println("GoldFish : move()");
	}
}

class Fish extends Animal
{
	public void show()
	{
		System.out.println("Fish : show()");
	}
	
	public void draw()
	{
		System.out.println("Fish : draw()");
	}
	
	public void move()
	{
		System.out.println("Fish : move()");
	}
}

class Animal
{
	public void show()
	{
		System.out.println("Animal : show()");
	}
	
	public void move()
	{
		System.out.println("Animal : move()");
	}
}
