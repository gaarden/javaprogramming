//2020110975 문정원
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class Craps
{
	private enum Status {CONTINUE, WON, LOST};
	private enum Numbers {ZERO, ONE, TWO};
	
	public void play()
	{
		//syntax errors
		int intNum1 = Status.CONTINUE;//좌변은 int형이지만, 우변은 enum형이라서 오류가 발생한다.(형태가 같아야 한다.)
		int intNum2 = (int)Status.CONTINUE;//type casting 해도 안된다.
		Status enmNum1 = 1;//enum형 변수에 int형 값을 넣을 수 없다.
		Status enmNum2 = (Status)1;//type casting 해도 안된다.
		
		//correct statements: enumNum, ZERO, ONE, TWO 모두 enum형이다.
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
		
		//correct statement: intNum3, intConsNum 모두 int형이다.
		final int intConsNum = 0;
		int intNum3 = 0;
		switch (intNum3)
		{
		case intConsNum:
			break;
		}
		
		//syntax error: intNum4는 int형이지만, ZERO는 enum형이다.
		int intNum4 = 0;
		switch (intNum4)
		{
		case ZERO:
			break;
		}
	}
}