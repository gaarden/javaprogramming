//2020110975 ������
//������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.

public class Craps
{
	private enum Status {CONTINUE, WON, LOST};
	private enum Numbers {ZERO, ONE, TWO};
	
	public void play()
	{
		//syntax errors
		int intNum1 = Status.CONTINUE;//�º��� int��������, �캯�� enum���̶� ������ �߻��Ѵ�.(���°� ���ƾ� �Ѵ�.)
		int intNum2 = (int)Status.CONTINUE;//type casting �ص� �ȵȴ�.
		Status enmNum1 = 1;//enum�� ������ int�� ���� ���� �� ����.
		Status enmNum2 = (Status)1;//type casting �ص� �ȵȴ�.
		
		//correct statements: enumNum, ZERO, ONE, TWO ��� enum���̴�.
		Numbers enumNum = Numbers.ZERO;
		switch (enumNum)
		{
		case ZERO:
			break;
		case ONE:
			break;
		case TWO:
			break;
		}
		
		//correct statement: intNum3, intConsNum ��� int���̴�.
		final int intConsNum = 0;
		int intNum3 = 0;
		switch (intNum3)
		{
		case intConsNum:
			break;
		}
		
		//syntax error: intNum4�� int��������, ZERO�� enum���̴�.
		int intNum4 = 0;
		switch (intNum4)
		{
		case ZERO:
			break;
		}
	}
}