//2020110975 문정원
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

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