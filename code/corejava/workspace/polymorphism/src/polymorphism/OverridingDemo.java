package polymorphism;

public class OverridingDemo {
	public static void main(String[] args) {
		
	}
}


class Person {
	public void intro() {
		System.out.println("I am a Person");
	}
}

class Employee extends Person {
	public void intro() {
		System.out.println("I am a Employee");
	}
}

class Student extends Person {
	public void intro() {
		System.out.println("I am a Student");
	}
}