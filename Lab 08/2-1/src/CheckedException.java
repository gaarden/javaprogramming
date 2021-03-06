// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

// CheckException인 IOException을 예외처리하지 않는 경우, 컴파일 단계에서 에러가 발생한다.

import java.io.IOException;

public class CheckedException {
	/*
	public static void main(String[] args){
		System.out.println("enter a number: ");
		int num = System.in.read();
		
		System.out.println((char)(num));
	}
	*/
	public static void main(String[] args){
		try
		{
			System.out.println("enter a number: ");
			int num = System.in.read();
			
			System.out.println((char)(num));
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
}