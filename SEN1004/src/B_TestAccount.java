import java.util.Scanner;
public class B_TestAccount {
	public static void main(String[] args) {
		B_Account a1 = new B_Account(50.00);
		B_Account a2 = new B_Account(-7.53);
		
		System.out.printf("account 1 balance: $%.2f\n",a1.getBalance());
		System.out.printf("account 2 balance: $%.2f\n",a2.getBalance());
		
		Scanner sc = new Scanner(System.in);
		double deposit;
		System.out.print("enter deposit for account 1:");
		deposit = sc.nextDouble();
		System.out.printf("\nadding %.2f to account 1 balance \n\n", deposit);
		a1.addCredit(deposit);
		
		System.out.printf("account 1 balance: $%.2f\n",a1.getBalance());
		System.out.printf("account 2 balance: $%.2f\n",a2.getBalance());
		
		System.out.print("enter deposit for account 2:");
		deposit = sc.nextDouble();
		System.out.printf("\nadding %.2f to account 2 balance \n\n", deposit);
		a2.addCredit(deposit);
		
		System.out.printf("account 1 balance: $%.2f\n",a1.getBalance());
		System.out.printf("account 2 balance: $%.2f\n",a2.getBalance());
	}
}