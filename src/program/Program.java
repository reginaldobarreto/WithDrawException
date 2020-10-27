package program;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = scanner.nextInt();
		System.out.print("Holder: ");
		scanner.nextLine();
		String holder = scanner.nextLine();
		System.out.print("Initial balance: ");
		Double balance = scanner.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = scanner.nextDouble();
		Account account = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double amount = scanner.nextDouble();
		scanner.close();
		try {
			account.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
