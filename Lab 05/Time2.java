// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class Time2 {
	private int second;
	
	public Time2()
	{
		this(0, 0, 0);
	}
	
	public Time2(int hour)
	{
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute)
	{
		this(hour, minute, 0);
	}
	
	public Time2(int hour, int minute, int second)
	{
		if (hour<0 || hour>=24)
		{
			throw new IllegalArgumentException("hour must be 0~23");
		}
		
		if (minute<0 || minute>=60)
		{
			throw new IllegalArgumentException("minute must be 0~59");
		}
		
		if (second<0 || second>=60)
		{
			throw new IllegalArgumentException("second must be 0~59");
		}
		
		this.second = hour*60*60+minute*60+second;
	}
	
	public Time2(Time2 time)
	{
		this(time.second/3600, (time.second%3600)/60, time.second%60);
	}
	
	public void setTime(int hour, int minute, int second)
	{
		if (hour<0 || hour>=24)
		{
			throw new IllegalArgumentException("hour must be 0~23");
		}
		
		if (minute<0 || minute>=60)
		{
			throw new IllegalArgumentException("minute must be 0~59");
		}
		
		if (second<0 || second>=60)
		{
			throw new IllegalArgumentException("second must be 0~59");
		}
		
		this.second = second;
	}
	
	public void setSecond(int second)
	{
		if (second<0 || second>=60)
		{
			throw new IllegalArgumentException("second must be 0~59");
		}
		
		this.second = second;
	}
	
	public int getHour()
	{
		return second/3600;
	}
	
	public int getMinute()
	{
		return (second-getHour()*3600)/60;
	}
	
	public int getSecond()
	{
		return second-getHour()*3600-getMinute()*60;
	}
	
	
	public String toUniversalString()
	{
		return String.format("%d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", ((getHour()==0||getHour()==12)?12:getHour()%12),
				getMinute(), getSecond(), (getHour()<12?"AM":"PM"));
	}
}
