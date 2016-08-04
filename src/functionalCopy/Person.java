package functionalCopy;

public class Person {
int age;
String firstName;
String lastName;
int level;
	public Person(int age, String firstName, String lastName, int level) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.level = level;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void moveToUpperLevel() {
		level++;
	}
	
}
