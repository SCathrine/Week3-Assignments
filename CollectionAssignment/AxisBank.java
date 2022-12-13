package week3.day2.CollectionAssignment;

public class AxisBank extends BankInfo{


	public void deposite() {
		
		System.out.println("OverrideAxisBank deposite");
		//method Overriding
		//use super keyword to access super class override method.
		super.deposite();
		
	}
	public static void main(String[] args) {

             AxisBank a=new AxisBank();
             a.deposite();
             a.fixed();a.savings();
             
	}

}
