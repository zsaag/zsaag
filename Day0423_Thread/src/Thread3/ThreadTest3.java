package Thread3;

public class ThreadTest3 {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		Runnable person1 = new User(myAccount);
		
		
		
		User person2 = new User(myAccount);
		
		Thread t1 = new Thread(person1);
		Thread t2 = new Thread(person2);
		t1.start();
		t2.start();
		
		
	}
}
