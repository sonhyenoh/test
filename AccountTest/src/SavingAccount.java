
public class SavingAccount extends Account {
	private double interest;
	private int mon=0;
	private double drive;
	public SavingAccount(double account, double interest){
		setBalance(account);
		this.interest= interest;
		this.drive = account;
	}
	public String toString(){
		return "SavingAccount_Balance :" + getBalance();
	}
	@Override
	public double EstimateValue(int month){
		double pass =  getBalance()*Math.pow((1+interest),month);
		setBalance(pass);
		return getBalance();
	}
	@Override
	public double debit(double sub){
		if(mon<12){
			System.out.print("���� ����Ҽ� �����ϴ�\n");
		}else{
			setBalance(getBalance() - sub);
		}
		return getBalance();
	}
	@Override
	public double getWithdrawableAccount(){
		if(mon<12){
			return 0;
		}else{
		return getBalance();
		}
	}
	@Override
	public double passTime(int moon){
		this.mon += moon;
		
		System.out.printf("Moon : %d \n", mon);
			if(mon >= 12){
		setBalance(drive*Math.pow((1+interest), 12)); //�� drive�� �߳ĸ� ���� mon�� 12�̻��϶��� ��� account���� ���ϱ� ������ ó���� �����س��� �װ����� ���.
			}
		return getBalance();
	}

}
