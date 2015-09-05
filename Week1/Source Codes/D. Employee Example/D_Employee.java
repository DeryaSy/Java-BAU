public class D_Employee
{
	private String firstName;
	private String lastName;
	private D_DateClass birthDate;
	private D_DateClass hireDate;
	
	public D_Employee(String first, String last, D_DateClass birth, D_DateClass hire)
	{
		firstName = first;
		lastName = last;
		birthDate = birth;
		hireDate = hire;
	}
	public String toString()
	{
		return String.format("%s, %s Hired: %s Birthday: %s",
		lastName, firstName, hireDate, birthDate);
	}
}