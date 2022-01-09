// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.util.Scanner;

public class Lab02 {
	
	static void q1()
	{
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		String var = " ";
		
		System.out.printf("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.\n");
		
		while (!var.equals("exit"))
		{
			System.out.printf("혜미 >> ");
			var = input.next();
			
			if (var.equals("가위"))
				a = 0;
			else if (var.equals("바위"))
				a = 1;
			else if (var.equals("보"))
				a = 2;
			else if (var.equals("exit"))
				continue;
			
			System.out.printf("준범 >> ");
			var = input.next();
			
			if (var.equals("가위"))
				b = 0;
			else if (var.equals("바위"))
				b = 1;
			else if (var.equals("보"))
				b = 2;
			else if (var.equals("exit"))
				continue;
			
			if ((a-b+3)%3 == 0)
				System.out.printf("무승부입니다.\n");
			else if ((a-b+3)%3 == 1)
				System.out.printf("혜미가 이겼습니다.\n");
			else
				System.out.printf("준범이가 이겼습니다.\n");
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
		
		System.out.printf("정수 x와 y 사이에 공백을 두고, 정수를 입력해주세요.(ex. 60 70)\n");
		
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
		if (x1>=50&&x1<=100 && y1>=50&&y1<=100)
			System.out.print("직사각형 안에 존재하는 점입니다.");
		
		else
			System.out.print("직사각형 안에 존재하지 않는 점입니다.");
		
			
	}
	
	static void q4()
	{
		Scanner input = new Scanner(System.in);
		
		int max_x;
		int max_y;
		int min_x;
		int min_y;
		
		System.out.printf("직사각형에 해당하는 점을 x1 y1 형식에 맞게 입력해주세요.(ex. 20 50)\n");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
		System.out.printf("직사각형에 해당하는 점을 x2 y2 형식에 맞게 입력해주세요.(ex. 20 50)\n");
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
		
		if ((x1>=50&&x1<=100)&&(y1>=50&&y1<=100)) // (x1, y1)이 직사각형 내부의 점
			System.out.println("두 직사각형은 충돌합니다.");
		
		else // (x1, y1)이 직사각형 외부의 점
		{
			if ((x2>=50&&x2<=100)&&(y2>=50&&y2<=100)) // (x2, y2)가 직사각형 내부의 점
				System.out.println("두 직사각형은 충돌합니다.");
			
			else // (x2, y2)도 직사각형 외부의 점
			{
				if(((max_x<50)&&(max_y<50))||((max_x<50)&&(min_y>100))||
						((min_x>100)&&(max_y<50))||((min_x>100)&&(min_y>100)))
					System.out.println("두 직사각형은 충돌하지 않습니다.");
				else
					System.out.println("두 직사각형은 충돌합니다.");
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
