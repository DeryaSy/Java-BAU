public class C_TestTimeClass
{
	public static void main(String[] args)
	{
		C_TimeClass time = new C_TimeClass();
		
		System.out.print("The initial universal time is: ");
		System.out.println(time.toUniversalString());
		System.out.print("The initial standard time is: ");
		System.out.println(time.toString());
		System.out.println();
		
		time.setTime(13,27,6);
		System.out.print("The initial universal time is: ");
		System.out.println(time.toUniversalString());
		System.out.print("The initial standard time is: ");
		System.out.println(time.toString());
		System.out.println();
		
		time.setTime(99,99,99);
		System.out.print("The initial universal time is: ");
		System.out.println(time.toUniversalString());
		System.out.print("The initial standard time is: ");
		System.out.println(time.toString());
		System.out.println();
	}
}