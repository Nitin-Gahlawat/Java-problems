//Question
	//WAP to Create a class Account which is inherited by SavingAccount & LoanAccount.
//Answer
package classes;
class Account{

	private long acc_no=2000;
	private final String name;
	private String address;
	private long phone;
	private String dob;
	protected double balance;
	private static int counter=0;
	public Account(String name, String address, long phone, String dob, double balance) {
		this.acc_no=this.acc_no+ counter++;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
		this.balance = balance;
	}
	public Account(String name, String address, long phone, String dob) {
		this.acc_no=this.acc_no+ counter++;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
		this.balance = 0;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	void closeAcc(){
		if(this.balance ==0)
			System.out.println("The Account is closed");
		else
			System.out.println("The Account Has Balance");
	}
	
}
class SavingAccount extends Account{
	double FixDepositAmount=0;
	public SavingAccount( String name, String address, long phone, String dob, double balance) {
		super( name, address, phone, dob, balance);
	}
	public SavingAccount( String name, String address, long phone, String dob) {
		super( name, address, phone, dob);
	}
	void deposit(double Amount){
		balance=balance+Amount;
	}
	void withdraw(double Amount) {
		balance=balance-Amount;
	}
	String fixedDeposit(double Amount) {
		if(balance<Amount)
			return "The Balance is Not Sufficient";
		else {
			balance=balance-Amount;
			FixDepositAmount+=Amount;
			return "The Balance is Sufficient";
		}
	}
	void liquidate() {
		balance=balance+(FixDepositAmount*0.05);
	}
}
class LoanAccount extends Account{
	public LoanAccount( String name, String address, long phone, String dob, double balance) {
		super( name, address, phone, dob, balance);
	}
	public LoanAccount(String name, String address, long phone, String dob) {
		super( name, address, phone, dob);
	}
	void payEmi(double Amount) {
		if(balance>Amount)
			balance=balance-Amount;
		else
			System.out.println("Balance is 0");
	}
	void topUpLoan(double Amount) {
		balance=balance+Amount;
	}
	void rePayment(double Amount) {
		if(balance==Amount) {
				balance=0;
				System.out.println("rePayment Successful");
		}
		else {
			System.out.println("the Balance amount is "+balance);
		}
	}
}
public class Bank {
	public static void main(String[] args) {
		System.out.println("*************************SavingAccount*******************************");
		SavingAccount saving=new SavingAccount("Java Account ","New York", 4154532, "12.7.1971");
		saving.deposit(200);
		System.out.println("Balance of Savings account "+saving.getBalance());
		saving.withdraw(200);
		saving.closeAcc();
		
		
		System.out.println("*************************LoanAccount*******************************");
		LoanAccount acc=new LoanAccount("Python Account ","China", 2058475, "15.12.1910",200000);
		System.out.println("Balance of Loan account "+acc.getBalance());
		acc.rePayment(acc.getBalance());
		acc.closeAcc();
	}
	
}
