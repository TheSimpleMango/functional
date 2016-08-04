package functionalCopy;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPerson {

	@Test
	public void testConstructor() {
		Person john = new Person(15, "John", "Snow", 1);
		assertEquals(john.getFullName(), "John Snow");
		assertEquals(15, john.getAge());
		assertEquals(1, john.getLevel());
	}
	
	@Test
	public void testMoveToUpperLevel() {
		Person john = new Person(15, "John", "Snow", 1);
		assertEquals(2, john.getLevel());
	}

}
