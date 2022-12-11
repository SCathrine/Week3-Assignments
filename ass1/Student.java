package week3.day1.ass1;

public class Student extends Department {

	public void stdName() {
		System.out.println("name is cathrine");
	}
	public void stdDept() {
		System.out.println("dept is MCA");
	}
	public void stdid() {
		System.out.println("std id is 005");
	}
	public static void main(String[] args) {
		
		Student s=new Student();
		s.collegeName();
		s.collegecode();
		s.collegeRank();
		s.deptName();
		s.stdDept();
		s.stdid();
		s.stdName();

	}

}
