//2020110975 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

class Friend
{
	String names;
	int ages;
	
	public Friend(String names, int ages) 
	{
		this.names = names;
		this.ages = ages;
	}
	
	public String toString()
	{
		return names+ages;
	}
}

public class FriendTest
{
	public static void main(String[] args)
	{
		String[] names = {"������", "��ȣ��", "�賲��"};
		int[] ages = {1997, 1994, 1994};
		
		//��ü�迭 ����, for�� �̿�
		Friend[] friends = new Friend[3];
		for (int count = 0; count<names.length; count++)
			friends[count] = new Friend(names[count], ages[count]);
		
		//counter controlled for���� ����� ��ü ���� ���,
		//System.out.printf �޼ҵ� ���, Friend�� toString�� �Ϲ������� ȣ���
		for (int i = 0; i<friends.length; i++)
			System.out.printf("%s\n", friends[i]);
		
		//enhanced for���� ����� ��ü ���� ���,
		//System.out.printf �޼ҵ� ���, Friend�� toString�� �Ϲ������� ȣ���
		for (Friend i : friends)
			System.out.printf("%s\n", i);
	}
}

