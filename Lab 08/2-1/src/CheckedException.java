// 2020110975 ������
// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

// CheckException�� IOException�� ����ó������ �ʴ� ���, ������ �ܰ迡�� ������ �߻��Ѵ�.

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