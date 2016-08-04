package functional;

import java.util.ArrayList;

public class League {
	ArrayList<Person> students = new ArrayList<>();
	
	public void addStudent(Person p) {
		students.add(p);
	}
	
	public ArrayList<Person> getStudents() {
		return students;
	}
	
	public ArrayList<Person> moveAllStudentsToUpperLevel() {
		for (Person person : students) {
			person.moveToUpperLevel();
		}
		return students;
	}
	
	public ArrayList<Person> getStudentsAbove(int age) {
		ArrayList<Person> studentsAbove = new ArrayList<Person>();
		for (Person person : students) {
			if (person.getAge() > age) {
				studentsAbove.add(person);
			}
		}
		return studentsAbove;
	}
}
