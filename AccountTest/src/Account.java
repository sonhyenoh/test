import java.util.Scanner;

public class Account {
	
	private double account ;
	
	
 Account(double w){
	 account = w;
}
	public void credit(double grade){
	 account += grade;
	}
	// �ؿ� �Լ��� 0���Ϸ� ������ ���� �Լ�~
	/*public void debit(double grade){
		if(account>grade){
			
		
		account = account - grade;
	
		}else if(account<grade){
			System.out.print("debit amount exceeded account balance \n");
		}
	}
*/
	public void debit(double grade){
		if(account>grade){
			
		
		account = account - grade;
	
		}else if(account<grade){
			account = account - grade;
			System.out.print("debit amount exceeded account balance \n");
		}
	}
	public void getBalance(){
		System.out.printf("account : $%f \n", account);
               
	}
	
	protected void setBalance(){
		if(account>0){
			account += account*0.01;
		}else if(account<0){
			account += account*0.07;
		}
	}
}
	
	
	
	

