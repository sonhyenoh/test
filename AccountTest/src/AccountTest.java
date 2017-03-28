import java.util.Scanner;
public class AccountTest {
	public static void main(String[]args){
		Account account1 = new Account(50);
		Account account2 = new Account(0);
			
		System.out.print("Enter withdrawal amount for account1 : ");
		Scanner input = new Scanner(System.in);
		double grade = input.nextDouble();
	
     account1.debit(grade);
 	account1.getBalance();
 account2.getBalance();
 	System.out.print("Enter withdrawal amount for account2 : ");
	
	double grade2 = input.nextDouble();
	account2.debit(grade2);
 	account1.getBalance();
 account2.getBalance();
	}
}
