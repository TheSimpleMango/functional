package functionalCopy;

import static org.junit.Assert.*;

import org.junit.Test;

public class testLeague {

	@Test
	public void testAddAndGet() {
		Person john = new Person(15, "John", "Snow", 1);
		League league = new League();
		assertTrue(league.getStudents().isEmpty());
		league.addStudent(john);
		assertEquals(league.getStudents().size(), 1);
	}
	
	@Test
	public void testMoveStudentsToUpperLevel() {
		Person john = new Person(15, "John", "Snow", 1);
		Person noone = new Person(16, "Ed", "Ward", 2);
		Person third = new Person(15, "Third", "Students", 3);
		League league = new League();
		league.addStudent(john);
		league.addStudent(noone);
		league.addStudent(third);
		assertEquals(league.getStudents().size(), 3);
		league.moveAllStudentsToUpperLevel();
		assertEquals(2, john.getLevel());
		assertEquals(3, noone.getLevel());
		assertEquals(4, third.getLevel());
	}
	
	@Test
	public void removeGrads() {
		Person john = new Person(15, "John", "Snow", 1);
		Person you = new Person(15, "You", "Know", 2);
		Person no = new Person(15, "No", "Thing", 9);
		Person jean = new Person(15, "Jean", "Smith", 10);
		League league = new League();
		league.addStudent(john);
		league.addStudent(you);
		league.addStudent(no);
		league.addStudent(jean);
		assertEquals(league.getStudents().size(), 4);
		league.removeGraduates();
		assertEquals(league.getStudents().size(), 2);
	}
	
}
