public class FactorialCalculator {

	public static int factorialLoop(int number)
	{ //uses repetition statements
		int result = 1;
		for (int i = number; i >= 1; i--) {
			result *= i;
		}
		return result;
	}

	public static int factorialRecursive(int number)
	{ //uses selection statements
		if(number > 1)
			return number * factorialRecursive(number - 1);
		else
			return 1;
	}

	public static void main(String[] args) {
		System.out.println(factorialRecursive(5));
		System.out.println(factorialLoop(5));
	}
}
