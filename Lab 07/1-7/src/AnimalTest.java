// 2020110975 ������
// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

public class AnimalTest {
	public static void main(String[] args)
	{
		Fish fish = new GoldFish(); // upcasting
		fish.move(); // upcasting�Ͽ� ȣ�������Ƿ� GoldFish class�� move method ȣ��ȴ�
	}
}

class GoldFish extends Fish
{
	public void move()
	{
		System.out.println("GoldFish : move()");
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
}
