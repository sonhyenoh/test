public class Account{
	private double account;
	
	public Account(){
	}
	
	public double getAccount(){
		return account;
	}
	
    public double credit(double add){
    	account += add;
    	return account;
    }
    
    public double balance(int num){
    	
    	System.out.printf("account%d balance : $%f\n",num, account);
    	return account;
    }
	public double withdrawal(double sub){
		if(sub>account){
			System.out.print("Debit amount exceeded account balance\n");
		}
		else{
		account -= sub;
		}
		return account;
	}	
}