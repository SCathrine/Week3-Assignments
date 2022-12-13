package week3.day2.CollectionAssignment;

public class BankInfo {
	
	public void savings() {
		
		System.out.println("savings");
	}
public void fixed() {
		
		System.out.println("fixed amount 200000");
	}

public void deposite() {
	
	System.out.println("pls deposite here in Bank");
}

	public static void main(String[] args) {
		
		BankInfo bank=new BankInfo();
		bank.deposite();
		bank.fixed();
		bank.savings();
		
	}

}
