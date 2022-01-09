//2020110975 문정원
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomMult
{
	public static void main(String[] args)
	{
		String[] correct = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
		String[] wrong = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying"};
		
		Scanner input = new Scanner(System.in);
		
		int answer = 0;
		
		while (answer != (-1))
		{
			SecureRandom randomNumbers = new SecureRandom();
			
			int num1 = 1+randomNumbers.nextInt(9);
			int num2 = 1+randomNumbers.nextInt(9);
			
			System.out.printf("How much is %d times %d?\n", num1, num2);
			System.out.print("Enter your answer (-1 to exit): ");
			
			answer = input.nextInt();
			if (answer == -1)
				break;
			
			while (answer != num1*num2)
			{
				int ans = randomNumbers.nextInt(4);
				System.out.printf("%s\n", wrong[ans]);
				System.out.print("Enter your answer (-1 to exit): ");
				answer = input.nextInt();
				if (answer == -1)
					break;
			}
			
			if (answer == num1*num2)
			{
				int ans = 0+randomNumbers.nextInt(4);
				System.out.printf("%s\n", correct[ans]);
			}
		}
	}
	
}