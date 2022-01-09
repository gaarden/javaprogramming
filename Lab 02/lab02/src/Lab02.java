// 2020110975 ������
// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

import java.util.Scanner;

public class Lab02 {
	
	static void q1()
	{
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		String var = " ";
		
		System.out.printf("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.\n");
		
		while (!var.equals("exit"))
		{
			System.out.printf("���� >> ");
			var = input.next();
			
			if (var.equals("����"))
				a = 0;
			else if (var.equals("����"))
				a = 1;
			else if (var.equals("��"))
				a = 2;
			else if (var.equals("exit"))
				continue;
			
			System.out.printf("�ع� >> ");
			var = input.next();
			
			if (var.equals("����"))
				b = 0;
			else if (var.equals("����"))
				b = 1;
			else if (var.equals("��"))
				b = 2;
			else if (var.equals("exit"))
				continue;
			
			if ((a-b+3)%3 == 0)
				System.out.printf("���º��Դϴ�.\n");
			else if ((a-b+3)%3 == 1)
				System.out.printf("���̰� �̰���ϴ�.\n");
			else
				System.out.printf("�ع��̰� �̰���ϴ�.\n");
		}
		
	}
	
	
	static void q2()
	{
		Scanner input = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		int num;
		
		System.out.print("Enter integer : ");
		num = input.nextInt();
		
		if (num == -1)
		{
			System.out.printf("Smallest Integer is : NULL\n");
			System.out.printf("Largest Integer is : NULL\n");
			System.exit(0);
		}
		
		else
		{
			max = num;
			min = num;
		}
		
		while (true)
		{
			System.out.print("Enter integer : ");
			num = input.nextInt();
			
			if (num == -1)
				break;
			
			else
			{
				if (num > max)
					max = num;
				
				if (num < min)
					min = num;
			}
			
		}
		
		System.out.printf("Smallest Integer is : %d\n", min);
		System.out.printf("Largest Integer is : %d\n", max);
		
	}
	
	static void q3()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.printf("���� x�� y ���̿� ������ �ΰ�, ������ �Է����ּ���.(ex. 60 70)\n");
		
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
		if (x1>=50&&x1<=100 && y1>=50&&y1<=100)
			System.out.print("���簢�� �ȿ� �����ϴ� ���Դϴ�.");
		
		else
			System.out.print("���簢�� �ȿ� �������� �ʴ� ���Դϴ�.");
		
			
	}
	
	static void q4()
	{
		Scanner input = new Scanner(System.in);
		
		int max_x;
		int max_y;
		int min_x;
		int min_y;
		
		System.out.printf("���簢���� �ش��ϴ� ���� x1 y1 ���Ŀ� �°� �Է����ּ���.(ex. 20 50)\n");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
		System.out.printf("���簢���� �ش��ϴ� ���� x2 y2 ���Ŀ� �°� �Է����ּ���.(ex. 20 50)\n");
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		if (x1>x2)
		{
			max_x = x1;
			min_x = x2;
		}
		
		else
		{
			max_x = x2;
			min_x = x1;
		}
		
		if (y1>y2)
		{
			max_y = y1;
			min_y = y2;
		}
		
		else
		{
			max_y = y2;
			min_y = y1;
		}
		
		if ((x1>=50&&x1<=100)&&(y1>=50&&y1<=100)) // (x1, y1)�� ���簢�� ������ ��
			System.out.println("�� ���簢���� �浹�մϴ�.");
		
		else // (x1, y1)�� ���簢�� �ܺ��� ��
		{
			if ((x2>=50&&x2<=100)&&(y2>=50&&y2<=100)) // (x2, y2)�� ���簢�� ������ ��
				System.out.println("�� ���簢���� �浹�մϴ�.");
			
			else // (x2, y2)�� ���簢�� �ܺ��� ��
			{
				if(((max_x<50)&&(max_y<50))||((max_x<50)&&(min_y>100))||
						((min_x>100)&&(max_y<50))||((min_x>100)&&(min_y>100)))
					System.out.println("�� ���簢���� �浹���� �ʽ��ϴ�.");
				else
					System.out.println("�� ���簢���� �浹�մϴ�.");
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		//q1();
		//q2();
		q3();
		//q4();
	}
	
}
