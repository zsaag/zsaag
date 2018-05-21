package Thread3;

public class BankAccount {
	private int balance;
	
	public synchronized int getBalance() {
		return balance;
	}
	//balance에 값을 더함
	public synchronized void deposit(int amount) {
		balance =balance + amount;
	}
	//balance에 값을 뺌
	public synchronized void withdraw(int amount) {
		balance =balance - amount;
	}
}
