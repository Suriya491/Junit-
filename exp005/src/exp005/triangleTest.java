package exp005;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Test;

public class triangleTest {

	@Test
	public void test1() {
		triangle t1 = new triangle();
		assertEquals(t1.check(1, 2, 3), "Given dimensions do not form a triangle!");
	}
	

	@Test
	public void test2() {
		triangle t1 = new triangle();
		assertEquals(t1.check(2, 2, 2), "Given dimensions form an equilateral triangle!");
	}
	
	@Test
	public void test3() {
		triangle t1 = new triangle();
		assertEquals(t1.check(2, 2, 3), "Given dimensions form an isosceles triangle!");
	}
	
	@Test
	public void test4() {
		triangle t1 = new triangle();
		assertEquals(t1.check(4, 5, 6), "Given dimensions form a scalene triangle!");
	}

	@Test
	public void test5() {
		triangle t1 = new triangle();
		assertEquals(t1.check(-4, 5, 6), "Enter a valid input!");
	}
	
	@Test
	public void test6() {
		triangle t1 = new triangle();
		assertEquals(t1.check(4, 5, 4), "Given dimensions form an isosceles triangle!");
	}
	
	@Test
	public void test7() {
		triangle t1 = new triangle();
		assertEquals(t1.check(5, 4, 4), "Given dimensions form an isosceles triangle!");
	}
	
	@Test
	public void test8() {
		triangle t1 = new triangle();
		assertEquals(t1.check(7, 4, 2), "Given dimensions do not form a triangle!");
	}
	
	@Test
	public void test9() {
		triangle t1 = new triangle();
		assertEquals(t1.check(4, 7, 2), "Given dimensions do not form a triangle!");
	}
	
	@Test
	public void test10() {
		triangle t1 = new triangle();
		assertEquals(t1.check(4, -5, 6), "Enter a valid input!");
	}
	@Test
	public void test11() {
		triangle t1 = new triangle();
		assertEquals(t1.check(4, 5, -6), "Enter a valid input!");
	}
	
	@Test
	public void test12() {
		triangle t1 = new triangle();
		assertEquals(t1.check(4, 205, -6), "Enter a valid input!");
	}
	
	@Test
	public void test13() {
		triangle t1 = new triangle();
		assertEquals(t1.check(204, 205, 209), "Enter a valid input!");
	}
	
	@Test
	public void test14() {
		triangle t1 = new triangle();
		assertEquals(t1.check(5, 5, 209), "Enter a valid input!");
	}
}
