package Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setAccno(10101);
		System.out.println(acc.getAccNo());
		
		acc.setName("Rohit Sharma");
		System.out.println(acc.getName());
		
		acc.setAmount(1200000.00);
		System.out.println(acc.getAmount());
	}

}
