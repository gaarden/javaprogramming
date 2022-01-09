//2020110975 문정원
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

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
		String[] names = {"전정국", "정호석", "김남준"};
		int[] ages = {1997, 1994, 1994};
		
		//객체배열 생성, for문 이용
		Friend[] friends = new Friend[3];
		for (int count = 0; count<names.length; count++)
			friends[count] = new Friend(names[count], ages[count]);
		
		//counter controlled for문을 사용한 객체 정보 출력,
		//System.out.printf 메소드 사용, Friend의 toString이 암묵적으로 호출됨
		for (int i = 0; i<friends.length; i++)
			System.out.printf("%s\n", friends[i]);
		
		//enhanced for문을 사용한 객체 정보 출력,
		//System.out.printf 메소드 사용, Friend의 toString이 암묵적으로 호출됨
		for (Friend i : friends)
			System.out.printf("%s\n", i);
	}
}

