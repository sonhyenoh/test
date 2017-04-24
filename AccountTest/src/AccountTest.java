import java.util.Scanner;
public class AccountTest{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
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
		
		/*System.out.print("여기 까지가 실습 첫번째꺼\n");
		
		
		Account account1 = new CheckingAccount(900,0.01,0.07);
		Account account2 = new CheckingAccount(900,0.01,0.07);
		account1.credit(100);
		account2.credit(100);
	
		account1.balance(1);
		account2.balance(2);
		
		System.out.print("Enter deposit amount for Account1 :");
		double add3 = input.nextDouble();
		account1.credit(add3);
		account1.balance(1);
		account2.balance(2);
		
		System.out.print("Enter withdrawal amount for Account2 : ");
		double deposit = input.nextDouble();
		account2.debit(deposit);
		account1.balance(1);
		account2.balance(2);
		
		System.out.print("next month!\n");
		((CheckingAccount)account1).nextmonth();
		((CheckingAccount)account2).nextmonth();
		account1.balance(1);
		account2.balance(2);
		*/
		Account account1  = new CheckingAccount(100,50,0.01,0.07);
		Account account2  = new SavingAccount(100,0.05);
		
		Scanner scan = new Scanner(System.in);
		double amount;
		
		System.out.printf("Account1 balance : $%.2f \t 현재 출금가능액 : %.2f\n", account1.getBalance(), account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amout for Account1: ");
		amount = scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance : $%.2f \t 현재 출금가능액 : %.2f\n", account1.getBalance(), account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupt()){
			System.out.print("account1 went Bankrupt!\n" );
		};
		account1.passTime(1);
		System.out.printf("Account1 balance : $%.2f \t 현재 출금가능액 : %.2f\n", account1.getBalance(), account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupt()){
			System.out.print("account1 went Bankrupt!\n" );
		};
		account1.passTime(5);
		System.out.printf("Account1 balance : $%.2f \t 현재 출금가능액 : %.2f\n", account1.getBalance(), account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupt()){
			System.out.print("account1 went Bankrupt!\n" );
		};
		
		System.out.println();
		System.out.printf("Account2 balance : $%.2f\t현재출금가능액 : %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance : $%.2f\t현재출금가능액 : %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance : $%.2f\t현재출금가능액 : %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance : $%.2f\t현재출금가능액 : %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance : $%.2f\t현재출금가능액 : %.2f\n", account2.getBalance(),account2.getWithdrawableAccount());
	}
}