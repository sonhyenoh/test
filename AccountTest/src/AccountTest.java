import java.util.Scanner;
public class AccountTest {
	public static void main(String[]args){
		Account account = new Account(50);
		Account account2 = new Account(0);
			
		System.out.print("Enter withdrawal amount for account1 : ");
		Scanner input = new Scanner(System.in);
		double grade = input.nextDouble();
	
 	account.a1(grade);
 	System.out.printf("account1 : $%f \n",account.getAccount1());
 	System.out.printf("account2 : $%f \n",account.getAccount2());
 	System.out.print("Enter withdrawal amount for account2 : ");
	
	double grade2 = input.nextDouble();
	account.a2(grade2);
	
	}
}
