package ch9;

public class Student implements Comparable<Student> {
	
	private int id;
	private String firstName;
	private int age;
	private double gpa;
	private String email;
	
	public Student(int id, String firstName, int age, double gpa, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.gpa = gpa;
		this.email = email;
	}
	
	/* ******************** ID COMPARE ******************** */
	public int compareTo(Student student) {
		int result = Integer.compare(this.getId(), student.getId());
		return result;
	}

	
	/* ******************** NAME COMPARE *********************
	public int compareTo(Student student) {
		int result = Integer.compare(this.getName().length(), student.getName().length());
		return result;
	}
	****************************************************** */
	
	/* ******************** GPA COMPARE *********************
	public int compareTo(Student student) {
		int result = Double.compare(student.getGpa(), this.getGpa());
		return result;
	}
	****************************************************** */

	/* ******************** STUDENT COMPARE *********************
	public int compareTo(Student student) {
		int result = Integer.compare(this.getAge(), student.getAge());
		return result;
	}
	****************************************************** */
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return firstName;
	}

	public void setName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Student | ID=" + id + ", Name=" + firstName + ", Age=" + age + ", GPA=" + gpa + ", Email=" + email;
	}

}


