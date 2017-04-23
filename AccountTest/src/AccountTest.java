import java.util.Scanner;
public class AccountTest{
	public static void main(String []args){
		/*Account account1 = new Account();
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
		
		account1.debit(sub1);
		System.out.printf("subracting %f from account1 balance\n",sub1);
		
		account1.balance(1);
		account2.balance(2);
		
		System.out.print("Enter withdrawal amount for account2 :");
		double sub2 = input.nextDouble();
		
		account2.debit(sub2);

		account1.balance(1);
		account2.balance(2);*/
		
		System.out.print("여기 까지가 실습 첫번째꺼\n");
		Scanner input = new Scanner(System.in);
		
		CheckingAccount checkingaccount1= new CheckingAccount(900,0.01,0.07);
		CheckingAccount checkingaccount2 = new CheckingAccount(900,0.01,0.07);
		
		checkingaccount1.credit(100);
		checkingaccount2.credit(100);
	
		checkingaccount1.balance(1);
		checkingaccount2.balance(2);
		
		System.out.print("Enter deposit amount for Account1 :");
		double add3 = input.nextDouble();
		checkingaccount1.credit(add3);
		checkingaccount1.balance(1);
		checkingaccount2.balance(2);
		
		System.out.print("Enter withdrawal amount for Account2 : ");
		double deposit = input.nextDouble();
		checkingaccount2.debit(deposit);
		checkingaccount1.balance(1);
		checkingaccount2.balance(2);
		
		System.out.print("next month!\n");
		checkingaccount1.nextmonth();
		checkingaccount2.nextmonth();
		checkingaccount1.balance(1);
		checkingaccount2.balance(2);
		
	}
}