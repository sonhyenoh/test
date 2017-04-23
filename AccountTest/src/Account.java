public abstract class Account{
	private double account;
	
	public Account(){
		
	}
	
	public abstract double getWithdrawableAccount();
	public abstract double passTime(int moon);
	public double getBalance(){
		return account;
	}
	protected double setBalance(double account){
		this.account = account;
		return account;
	}
	
    public double credit(double add){
    	account += add;
    	return account;
    }
    
    public double balance(int num){
    	
    	System.out.printf("account%d balance : $%.2f\n",num, account);
    	if(account<0){
    		System.out.printf("Oh! Your account%d is small than 0\n",num);
    	}
    	return account;
    }
	public double debit(double sub){
		if(sub>account){
			System.out.print("Debit amount exceeded account balance\n");
		}
		else{
		account -= sub;
		}
		return account;
	}	
	
	
}