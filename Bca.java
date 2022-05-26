//This is a demo program
/*
 * This is the first Java program in Eclipse
 * 
 */
public class Bca {
	static String batch = "2019";
	int student_strength = 8;
	int roll_no;
	String name;
	
	public static void PrintClassDetails() {
		System.out.println("This is a " + batch + " batch class");
	}
	
	public void printStudentDetails() {
		System.out.println("The Student Details are:\n");
		System.out.println("Name = "+ name + " , Roll No = " + roll_no);
		System.out.println("\n Batch = "+ batch);
	}
	
	public void getBatch() {
		System.out.println("The batch of the student is " + batch);
	}
	
	public void setRoll_no(int r) {
		roll_no = r;
	}
	public void setName(String n) {
		name = n;
	}
	
	public static void main(String[] args) {
		Bca student1 = new Bca();
		Bca student2 = new Bca();
		Bca student3 = new Bca();
		Bca.PrintClassDetails();
//		student1.getBatch();
		student1.setRoll_no(5);
		student1.setName("Maqsood hussain ");
		student1.printStudentDetails();
		
		student2.setName("Qurat ul Ain");
		student2.setRoll_no(8);
		student2.printStudentDetails();
	}
}
