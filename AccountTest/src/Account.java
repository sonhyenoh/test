import java.util.Scanner;

public class Account {
	
	private double account1 = 50.00;
	
	private double account2 = 0.00;
	public void a1(double grade){
		account1 = account1 - grade;
		
	}
	public void a2(double grade){
		if(account2>grade){
			
		
		account2 = account2 - grade;
		}else if(account2<grade){
			System.out.print("dedib : ");
		}
	}
	public double getAccount1(){
		return account1;
	}
	public double getAccount2(){
		return account2;
	}
}
	
	
	
	

