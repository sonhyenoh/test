public class CheckingAccount extends Account{
	private double credit_limit;
	private double interest;
	private double loan_interest;
	private double mon;
	public CheckingAccount(double account,double credit_limit, double interest,double loan_interest){
		setBalance(account);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	@Override
	public double credit(double add){
		super.credit(add);
		return getBalance();
	}
	@Override
	public double balance(int num){
		super.balance(num);
		return getBalance();
	}

	@Override
	public double debit(double add){
		/*if(add > getBalance()){ //debit함수를 재정의  
		if(add > credit_limit){
			System.out.printf("함도초과 입니다. 한도는 $%f입니다.",credit_limit);
			}
		else{
			  double account3 = getBalance();
			  account3 -= add;
			  setBalance(account3);
		}
		}
		else{
		super.debit(add);
		}*/  //이것은 checkingAccount할때 debit함수의 정의
		if(add> getBalance()+ credit_limit){
			System.out.print("출금하실수 없습니다.");
		}
		else{
			setBalance(getBalance()-add);
			
		}
		return getBalance();
	}
	
	@Override
	public double getWithdrawableAccount(){
		
		if(getBalance()>0){
			 return credit_limit + getBalance();
		}
		else{
		 double total2 = credit_limit + getBalance();
		 if(total2 < 0){
			 return 0;
		 }
		 else{
			 return total2;
		 }
		}
	}
	@Override
	public double passTime(int moon){
		mon += moon;
		double pass = getBalance()*Math.pow((1+ loan_interest),mon);
		setBalance(pass);
		return getBalance();
	}
	public double isBankrupt(){
		if(getWithdrawableAccount()==0){
			System.out.print("account1 went Bankrupt!\n" );
		}
		return getBalance();
	}
	public double nextmonth(){
		if(getBalance() >= 0){
			double account4 = getBalance();
			account4 = account4 + account4*interest;
			setBalance(account4);
		}else{
			double account5 = getBalance();
			account5 = account5 + account5*loan_interest;
			setBalance(account5);
		}
		return getBalance();
	}

	
}