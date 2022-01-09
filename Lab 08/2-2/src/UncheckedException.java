// 2020110975 ������
// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

// UncheckedException�� InputMismatchException, ArithmeticException�� ����ó�� ���� �ʾƵ� 
// ������ ������ �߻����� �ʴ´�.

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	public static int quotient(int numerator, int denominator) throws ArithmeticException
	{
		return numerator/denominator;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a first number : ");
		int num1 = scanner.nextInt();
		
		System.out.println("enter a second number : ");
		int num2 = scanner.nextInt();
		
		int result = quotient(num1, num2);
		
		System.out.println(result);
	}
	
	/*
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			System.out.println("enter a first number : ");
			int num1 = scanner.nextInt();
		
			System.out.println("enter a second number : ");
			int num2 = scanner.nextInt();
		
			int result = quotient(num1, num2);
		
			System.out.println(result);
		}
		
		catch(InputMismatchException e)
		{
			System.err.println(e);
		}
		
		catch(ArithmeticException e)
		{
			System.err.println(e);
		}
	}
	*/
}