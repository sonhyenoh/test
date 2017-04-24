public  class CheckingAccount extends Account{
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
	public String toString(){
		return "CheckingAccount_Balance :" + getBalance() ;
	}
	@Override
	public double EstimateValue(int month){
		double i;
		i = getBalance();
		i = i+ i*interest*month;
		setBalance(i);
		return getBalance();
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
	public void  debit(double amount) throws ArithmeticException{
		if(amount > getBalance()) throw new ArithmeticException("Deibt amount exceeded account balance");
		else if(amount <0)throw new ArithmeticException("�����Է�!");
		super.debit(amount);
		
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
		mon = moon; //ó���� mon���ٰ� +=��� �߾��µ� �޼��� ����Ǵ°� �ƴ϶� �Է��� �޼���ŭ ���ڸ� �ٱ⶧���� !
		//double pass = getBalance()*Math.pow((1+ loan_interest),mon);  //�̰��� ������ �ٺ���
	double pass=0;
	if(getBalance()<0){
		pass = getBalance() + getBalance()*loan_interest*mon; 
	}
	else if(getBalance()>0){
		pass = getBalance() + getBalance()*mon*interest;
		}
		
		
		setBalance(pass);
		
		return getBalance();
	}
	public boolean isBankrupt(){
		boolean isbank = false;
		
		if(isbank = getWithdrawableAccount()==0){
			return isbank;
		}
		else{
		return isbank;
	}
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