package Bank;
/**
 * @author BHARATHESH
 *
 */
public class Account extends Person {
	
	long accountNo;
	double balance;
	String accHolder;
	
	public void setAccHolder() {
		accHolder = Person.getName();
	}
	
	public void getAccHolder() {
		System.out.println(accHolder);
	}
	public long getAccountNo() {
		return accountNo;
	}
	
	public void SetAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	
	public void getBalance() {
		System.out.println(balance);
	}
	
	public void setInitialBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withDraw(double amount) {
		this.balance -= amount;
	}
}
