package exp003;

import static org.junit.Assert.*;
import org.junit.Test;

public class Robust_WC_BVT {

	@Test
	public void test1() {
		date d1 = new date();
		assertEquals(d1.nextDate(0, 1, 1821), "Invalid date!");
	}
	@Test
	public void test2() {
		date d1 = new date();
		assertEquals(d1.nextDate(0, 1, 1822), "Invalid date!");
	}
	@Test
	public void test3() {
		date d1 = new date();
		assertEquals(d1.nextDate(0, 1, 1921), "Invalid date!");
	}
	@Test
	public void test4() {
		date d1 = new date();
		assertEquals(d1.nextDate(0, 1, 2020), "Invalid date!");
	}
	@Test
	public void test5() {
		date d1 = new date();
		assertEquals(d1.nextDate(0, 1, 2021), "Invalid date!");
	}
	@Test
	public void test6() {
		date d1 = new date();
		assertEquals(d1.nextDate(1, 1, 1821), "The next date is: 2-1-1821");
	}
	@Test
	public void test7() {
		date d1 = new date();
		assertEquals(d1.nextDate(1, 1, 1822), "The next date is: 2-1-1822");
	}
	@Test
	public void test8() {
		date d1 = new date();
		assertEquals(d1.nextDate(1, 1, 1921), "The next date is: 2-1-1921");
	}
	@Test
	public void test9() {
		date d1 = new date();
		assertEquals(d1.nextDate(1, 1, 2020), "The next date is: 2-1-2020");
	}

	@Test
	public void test10() {
		date d1 = new date();
		assertEquals(d1.nextDate(1, 1, 2021), "The next date is: 2-1-2021");
	}
	@Test
	public void test11() {
		date d1 = new date();
		assertEquals(d1.nextDate(2, 1, 1821), "The next date is: 3-1-1821");
	}
	@Test
	public void test12() {
		date d1 = new date();
		assertEquals(d1.nextDate(2, 1, 1822), "The next date is: 3-1-1822");
	}
	@Test
	public void test13() {
		date d1 = new date();
		assertEquals(d1.nextDate(2, 1, 1921), "The next date is: 3-1-1921");
	}
	@Test
	public void test14() {
		date d1 = new date();
		assertEquals(d1.nextDate(2, 1, 2020), "The next date is: 3-1-2020");
	}
	@Test
	public void test15() {
		date d1 = new date();
		assertEquals(d1.nextDate(2, 1, 2021), "The next date is: 3-1-2021");
	}
	@Test
	public void test16() {
		date d1 = new date();
		assertEquals(d1.nextDate(6, 1, 1821), "The next date is: 7-1-1821");
	}
	@Test
	public void test17() {
		date d1 = new date();
		assertEquals(d1.nextDate(6, 1, 1822), "The next date is: 7-1-1822");
	}
	@Test
	public void test18() {
		date d1 = new date();
		assertEquals(d1.nextDate(6, 1, 1921), "The next date is: 7-1-1921");
	}
	@Test
	public void test19() {
		date d1 = new date();
		assertEquals(d1.nextDate(6, 1, 2020), "The next date is: 7-1-2020");
	}
	@Test
	public void test20() {
		date d1 = new date();
		assertEquals(d1.nextDate(6, 1, 2021), "The next date is: 7-1-2021");
	}
	@Test
	public void test21() {
		date d1 = new date();
		assertEquals(d1.nextDate(30, 1, 1821), "The next date is: 31-1-1821");
	}
	@Test
	public void test22() {
		date d1 = new date();
		assertEquals(d1.nextDate(30, 1, 1822), "The next date is: 31-1-1822");
	}
	@Test
	public void test23() {
		date d1 = new date();
		assertEquals(d1.nextDate(30, 1, 1921), "The next date is: 31-1-1921");
	}
	@Test
	public void test24() {
		date d1 = new date();
		assertEquals(d1.nextDate(30, 1, 2020), "The next date is: 31-1-2020");
	}
	@Test
	public void test25() {
		date d1 = new date();
		assertEquals(d1.nextDate(30, 1, 2021), "The next date is: 31-1-2021");
	}
	@Test
	public void test26() {
		date d1 = new date();
		assertEquals(d1.nextDate(31, 1, 1821), "The next date is: 1-2-1821");
	}
	@Test
	public void test27() {
		date d1 = new date();
		assertEquals(d1.nextDate(31, 1, 1822), "The next date is: 1-2-1822");
	}
	@Test
	public void test28() {
		date d1 = new date();
		assertEquals(d1.nextDate(31, 1, 1921), "The next date is: 1-2-1921");
	}
	@Test
	public void test29() {
		date d1 = new date();
		assertEquals(d1.nextDate(31, 1, 2020), "The next date is: 1-2-2020");
	}
	@Test
	public void test30() {
		date d1 = new date();
		assertEquals(d1.nextDate(31, 1, 2021), "The next date is: 1-2-2021");
	}

	@Test
	public void test31() {
		date d1 = new date();
		assertEquals(d1.nextDate(32, 1, 1821), "Invalid date!");
	}
	@Test
	public void test32() {
		date d1 = new date();
		assertEquals(d1.nextDate(32, 1, 1822), "Invalid date!");
	}
	@Test
	public void test33() {
		date d1 = new date();
		assertEquals(d1.nextDate(32, 1, 1921), "Invalid date!");
	}
	@Test
	public void test34() {
		date d1 = new date();
		assertEquals(d1.nextDate(32, 1, 2020), "Invalid date!");
	}
	@Test
	public void test35() {
		date d1 = new date();
		assertEquals(d1.nextDate(32, 1, 2021), "Invalid date!");
	}
}

