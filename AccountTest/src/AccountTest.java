import java.util.Scanner;
public class AccountTest{
	public static void main(String []args){
		Account account1 = new Account();
		Account account2 = new Account();
		
		System.out.print("계좌1에 돈을 얼마나 넣을것인가? : ");
		Scanner input = new Scanner(System.in);
		double add1 = input.nextDouble();
		account1.credit(add1);
		
		System.out.print("계좌2에 돈을 얼마나 넣을것인가? : ");
     	double add2 = input.nextDouble();
		account2.credit(add2);
		
		account1.balance(1);
		account2.balance(2);
		
		System.out.print("Enter withdrawal amount for account1 :");
		double sub1 = input.nextDouble();
		
		account1.withdrawal(sub1);
		System.out.printf("subracting %f from account1 balance\n",sub1);
		
		account1.balance(1);
		account2.balance(2);
		
		System.out.print("Enter withdrawal amount for account2 :");
		double sub2 = input.nextDouble();
		
		account2.withdrawal(sub2);

		account1.balance(1);
		account2.balance(2);

		
	}
}