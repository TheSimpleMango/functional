package functionalCopy;

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
		students.forEach(p -> p.moveToUpperLevel());
		return students;
	}
	
	public ArrayList<Person> getStudentsAbove(int age) {
		ArrayList<Person> studentsAbove = new ArrayList<Person>();
		students.forEach(p -> { 
			if (p.getAge() > age) 
				studentsAbove.add(p);
		});
		return studentsAbove;
	}

	public void removeGraduates() {
		/*for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getLevel() >= 9) {
				students.remove(i);
				i--;
			}
		}*/
		students.removeIf(p -> p.getLevel() >= 9);
	} 
}
