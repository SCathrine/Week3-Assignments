package week3.day2.CollectionAssignment;

public class Students {

	public void getstudentinfo() {
		System.out.println("1st getStudentinfo");		
	}
	
	public int getstudentinfo(int a) {
		System.out.println("2nd getStudentinfo");
		 int id=a;
			
		 return id;
	}
	
	public void getstudentinfo(int a, String name) {
		System.out.println("3rd getStudentinfo");
		int i= a;
		String n= name;
		System.out.println("id is: " +i);
		System.out.println("name is: " +n);
	}
	
	public void getstudentinfo(String email, int num) {
		System.out.println("4th getStudentinfo");
		String emailid= email;
		int phno=num;
		System.out.println("email id is: " +emailid);
		System.out.println("phonenumber id is: " +phno);
	}
	

	public static void main(String[] args) {
	Students s= new Students();
    s.getstudentinfo();
    int stdid =s.getstudentinfo(6);
    System.out.println("printing id from main(): " +stdid);
    s.getstudentinfo(011,"mathews");
    s.getstudentinfo("mat@gmail.com", 1234445566);
		

	}

}
