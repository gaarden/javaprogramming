//2020110975 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

public class ArrayTest2
{
	public static void main(String[] args)
	{
		//2���� �迭 ����, new ������ ���, 4����
		int[][] d = new int[3][];
		d[0] = new int[2];
		d[1] = new int[1];
		d[2] = new int[3];
		
		//��� �迭 ���ҿ� 1 �Ҵ�, counter controlled for statement
		for (int i = 0; i<d.length; i++)
			for (int j = 0; j<d[i].length; j++)
				d[i][j] = 1;
		
		//�迭 ������ ���� �׸��� ���� ������� ���, enhanced for statement
		for (int[] value: d)
		{
			for (int c: value)
				System.out.printf("%d ",c);
			System.out.println();
		}
	}
}