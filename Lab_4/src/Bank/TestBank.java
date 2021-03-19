package Bank;

public class TestBank {
	
	public static void main(String[] args) {
		
		Account person = new Account();
		
		person.setName("Smith");
		person.setAccHolder();
		person.setInitialBalance(2000);
		person.deposit(2000);
		person.getAccHolder();
		person.getBalance();
		
		person.setName("Kathy");
		person.setAccHolder();
		person.setInitialBalance(3000);
		person.withDraw(2000);
		person.getAccHolder();
		person.getBalance();
	}
}
