package io.github.priscillacordeiro.bank;

public class Bank {

	public static void main(String[] args) {
		
		Client client1 = new Client("Priscilla Cordeiro", "987654321");
		Account acc1 = new Account("068724", 100.0, client1);
		
		Client client2 = new Client("Patrick Colins", "1020304050");
		Account acc2 = new Account("456123", client2);

		System.out.println("Account 1 balance: US$ " + acc1.getBalance());
		System.out.println("Account 2 balance: US$ " + acc2.getBalance());
		System.out.println("-----------------------------------");
		
		acc1.credit(200.0);
		acc2.credit(300.0);
		
		System.out.println("Account 1 balance: US$ " + acc1.getBalance());
		System.out.println("Account 2 balance: US$ " + acc2.getBalance());
		System.out.println("-----------------------------------");
		
		acc1.debit(250.0);
		acc2.debit(20.0);

		System.out.println("Account 1 balance: US$ " + acc1.getBalance());
		System.out.println("Account 2 balance: US$ " + acc2.getBalance());
		System.out.println("-----------------------------------");
		
		acc2.transfer(150.0, acc1);
		
		System.out.println("Account 1 balance: US$ " + acc1.getBalance());
		System.out.println("Account 2 balance: US$ " + acc2.getBalance());
		System.out.println("-----------------------------------");
		
		acc1.transfer(500.0, acc2);
		
		System.out.println("Account 1 balance: US$ " + acc1.getBalance());
		System.out.println("Account 2 balance: US$ " + acc2.getBalance());
		System.out.println("-----------------------------------");
	}

}
