// 2020110975 ������
// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

public class AnimalTest {
	public static void main(String[] args)
	{
		Fish fish = new Fish();
		fish.move(); // fish class ���� move method �����ϹǷ� fish class ���� move method ȣ��
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
