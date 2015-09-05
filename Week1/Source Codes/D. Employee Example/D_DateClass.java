public class D_DateClass
{
	private int month;
	private int day;
	private int year;
	
	private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public D_DateClass(int m, int d, int y)
	{
		month = checkMonth(m);
		year = y;
		day = checkDay(d);
	}
	
	private int checkMonth(int m)
	{
		if(m>0 && m<=12)
			return m;
		else
			return -1;
	}
	
	private int checkDay(int d)
	{
		if(d >0 && d <= daysPerMonth[month])
			return d;
		else if(month == 2 && d == 29 && (year%400 == 0 || (year%4==0&&year%100!=0)))
			return d;
		else
			return -1;
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d",month,day,year);
	}
}