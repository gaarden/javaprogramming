// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

// UncheckedException인 InputMismatchException, ArithmeticException을 예외처리 하지 않아도 
// 컴파일 에러가 발생하지 않는다.

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