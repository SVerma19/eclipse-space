package ch1;

public class Person {
	
	private int age;
	private String name;
	
	// Constructor
	public Person(int a, String n) {
		age = a;
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void printName() {
		System.out.println("my name is " + name);
	}
	
	public String toString() {
		return ("name: " + name + " | age: " + age);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person(19, "Sachin");
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		System.out.println(" ");
		
		Person p2 = new Person(25, "Joe");
		System.out.println(p2.toString());
	}
		
  }


