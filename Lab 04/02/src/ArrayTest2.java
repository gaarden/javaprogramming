//2020110975 문정원
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class ArrayTest2
{
	public static void main(String[] args)
	{
		//2차원 배열 선언, new 연산자 사용, 4문장
		int[][] d = new int[3][];
		d[0] = new int[2];
		d[1] = new int[1];
		d[2] = new int[3];
		
		//모든 배열 원소에 1 할당, counter controlled for statement
		for (int i = 0; i<d.length; i++)
			for (int j = 0; j<d[i].length; j++)
				d[i][j] = 1;
		
		//배열 원소의 값을 그림과 같은 모양으로 출력, enhanced for statement
		for (int[] value: d)
		{
			for (int c: value)
				System.out.printf("%d ",c);
			System.out.println();
		}
	}
}