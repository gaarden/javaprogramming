// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class AnimalTest {
	public static void main(String[] args)
	{
		Fish fish = new Fish();
		fish.move(); // fish class 내에 move method 존재하므로 fish class 내의 move method 호출
	}
}

class Fish extends Animal
{
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
