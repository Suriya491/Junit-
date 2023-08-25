package exp003;

import static org.junit.Assert.*;
import org.junit.Test;

public class RobustBVT {

	@Test
	public void test1() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 6, 1820), "Invalid date!");
	}
	@Test
	public void test2() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 6, 1821), "The next date is: 16-6-1821");
	}
	@Test
	public void test3() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 6, 1822), "The next date is: 16-6-1822");
	}
	@Test
	public void test4() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 6, 1921), "The next date is: 16-6-1921");
	}
	@Test
	public void test5() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 6, 2020), "The next date is: 16-6-2020");
	}
	@Test
	public void test6() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 6, 2021), "The next date is: 16-6-2021");
	}
	@Test
	public void test7() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 6, 2022), "Invalid date!");
	}
	@Test
	public void test8() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 0, 1921), "Invalid date!");
	}
	@Test
	public void test9() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 1, 1921), "The next date is: 16-1-1921");
	}

	@Test
	public void test10() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 2, 1921), "The next date is: 16-2-1921");
	}
	@Test
	public void test11() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 11, 1921), "The next date is: 16-11-1921");
	}
	@Test
	public void test12() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 12, 1921), "The next date is: 16-12-1921");
	}
	@Test
	public void test13() {
		date d1 = new date();
		assertEquals(d1.nextDate(15, 13, 1921), "Invalid date!");
	}
	@Test
	public void test14() {
		date d1 = new date();
		assertEquals(d1.nextDate(0, 6, 1921), "Invalid date!");
	}
	@Test
	public void test15() {
		date d1 = new date();
		assertEquals(d1.nextDate(1, 6, 1921), "The next date is: 2-6-1921");
	}
	@Test
	public void test16() {
		date d1 = new date();
		assertEquals(d1.nextDate(2, 6, 1921), "The next date is: 3-6-1921");
	}
	@Test
	public void test17() {
		date d1 = new date();
		assertEquals(d1.nextDate(29, 6, 1921), "The next date is: 30-6-1921");
	}
	@Test
	public void test18() {
		date d1 = new date();
		assertEquals(d1.nextDate(30, 6, 1921), "The next date is: 1-7-1921");
	}
	@Test
	public void test19() {
		date d1 = new date();
		assertEquals(d1.nextDate(31, 6, 1921), "Invalid date!");
	}
}
