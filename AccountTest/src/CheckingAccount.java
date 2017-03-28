import java.util.Scanner;
public class CheckingAccount {
 public static void main(String[]args){
 		Account account1 = new Account(100);
 		Account account2 = new Account(100);
 		account1.getBalance();
 		account2.getBalance();
 		
 		System.out.print("Enter deposit amount for Account1: ");
 		Scanner input = new Scanner(System.in);
 		double deposit = input.nextDouble();
 		
 		account1.credit(deposit);
 		account1.getBalance();
 		account2.getBalance();
 		System.out.print("Enter withdrawal amount for Account2: ");
 		double withdrawal = input.nextDouble();
 		
 		account2.debit(withdrawal);
 		account1.getBalance();
 		account2.getBalance();
 		
 		System.out.println("next month!");
 		
 		account1.setBalance();
 		account2.setBalance();
 		
 		account1.getBalance();
 		account2.getBalance();
 		
 	
 }
}
