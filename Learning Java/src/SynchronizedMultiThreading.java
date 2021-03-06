/* the most important thing to note while using mutithreading synchronization is to use the word "synchronized",
 * we need to pass the variable whose function we want to use, basically the object idenfitier.
 */

import java.util.Scanner;

class Account{
	private int bal;
	public Account(int bal) {
		this.bal = bal;
	}
	
	public boolean isSufficient(int amt) {
		if(amt <= bal) return true;
		else return false;
	}
	
	public void withdraw(int amt) {
		bal = bal - amt;
		System.out.println("The withdrawn amount is " + amt);
		System.out.println("The current balance is " + bal);
	}
}

class Customer implements Runnable{
	private Account account;
	private String name;

	public Customer(Account account, String name) {
		this.name = name;
		this.account = account;
	}
	
	public void run() {
		
		synchronized(account) { 
			
		System.out.println(name + " ,Enter the amount you want to withdraw");
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		
			if(account.isSufficient(amt)){
				account.withdraw(amt);
			} else {
				System.out.println("Insufficient balance");
			}	
		}
	}
}

public class SynchronizedMultiThreading {

	public static void main(String[] args) {
		Account a1 = new Account(1000);
		Customer c1 = new Customer(a1, "Sam"), c2 = new Customer(a1, "Jon");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}
}
