//2020110975 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

public class MethodOverload
{
	public static void main(String[] args)
	{
		System.out.printf("Multiply 7 and 8 is %d\n", mult(7, 8));
		System.out.printf("Multiply 7.5 and 8.5 is %f\n", mult(7.5, 8.5));
	}
	
	public static int mult(int int1, int int2)
	{
		return int1*int2;
	}
	
	public static double mult(double double1, double double2)
	{
		return double1*double2;
	}
}