public class D_Test
{
	public static void main(String[] args)
	{
		D_DateClass birth = new D_DateClass(7,24,1949);
		D_DateClass hire = new D_DateClass(3,12,1988);
		D_Employee e = new D_Employee("Bob","Blue",birth,hire);
		
		System.out.println(e);
	}
}