package week3.day2.CollectionAssignment;

public class Automation extends MultipleLanguage implements Language,TestTool

{

	public static void main(String[] args) {
		
		Automation a=new Automation();
		a.python();
		a.java();
		a.ruby();
		a.selenium();

	}

	public void selenium() {
		
		System.out.println("Selenium is an automation testing tool");
		
	}

	public void java() {
		System.out.println("Java is a language used in automation testing");
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby is also an automation testing langauge");
		
	}

}
