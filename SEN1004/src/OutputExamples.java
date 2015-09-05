
public class OutputExamples {
	//What does the following code do?
	public static int Method1(int a, int b) //a^b
	{
		if(b == 1)
			return a;
		else
			return a * Method1(a, b-1);
	}

	//What does the following code do? Find the errors in the following recursive method.
	public static int Method2(int n) //n is not decreasing
	{
		if(n==1)
			return 1;
		else
			return n * Method2(n);
	}

	//What does the following code do?
	public static long Method3(int[] arr, int size) //arr[len]*arr[len-1]*arr[len-2]*...*arr[0]
	{
		if(size == 1)
			return arr[0];
		else
			return arr[size - 1] * Method3(arr, size - 1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(Method1(4,3));
		
		//System.out.println(Method2(5));
		
		int[] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		System.out.println(Method3(a, a.length));
		
		int[] b = {4,6,9 };
		System.out.println(Method3(b, b.length));
		
	}
}
