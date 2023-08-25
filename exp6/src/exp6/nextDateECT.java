package exp6;

import static org.junit.Assert.*;

import org.junit.Test;

public class nextDateECT {

	@Test
	public void test_1()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(15,6,1912),"16/6/1912");
	}
	@Test
	public void test_2()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(10,6,1912),"11/6/1912");
	}
	@Test
	public void test_3()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(10,6,1900),"11/6/1900");
	}
	@Test
	public void test_4()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(10,5,1912),"11/5/1912");
	}
	@Test
	public void test_5()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(20,10,2010),"21/10/2010");
	}

	//weak robust test cases

	@Test
	public void test_6()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(-1,10,1912),"Invalid Values");
	}

	@Test
	public void test_7()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(12,7,1912),"13/7/1912");
	}
	@Test
	public void test_8()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(12,8,1912),"13/8/1912");
	}
	@Test
	public void test_9()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(12,4,1912),"13/4/1912");
	}
	@Test
	public void test_10()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(12,9,1912),"13/9/1912");
	}
	@Test
	public void test_11()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(12,1,1912),"13/1/1912");
	}
	@Test
	public void test_12()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(12,2,1912),"13/2/1912");
	}
	@Test
	public void test_13()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(12,3,1912),"13/3/1912");
	}
	@Test
	public void test_14()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(10,3,1912),"11/3/1912");
	}
	@Test
	public void test_15()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(15,13,1912),"Invalid Values");
	}
	@Test
	public void test_16()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(1,6,2200),"Invalid Values");
	}
	@Test
	public void test_17()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(32,6,1912),"Invalid Values");
	}
	@Test
	public void test_18()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(15,6,1811),"Invalid Values");
	}
	@Test
	public void test_19()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(15,6,2013),"Invalid Values");
	}

	//strong robust test cases
	@Test
	public void test_20()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(2,1,1912),"3/1/1912");
	}
	@Test
	public void test_21()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(-1,3,1900),"Invalid Values");
	}
	@Test
	public void test_22()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(15,0,1811),"Invalid Values");
	}
	@Test
	public void test_23()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(33,12,1912),"Invalid Values");
	}
	@Test
	public void test_24()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(15,-1,-1),"Invalid Values");
	}
	@Test
	public void test_25()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(-1,6,-1),"Invalid Values");
	}
	@Test
	public void test_26()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(-1,-1,-1),"Invalid Values");
	}
	@Test
	public void test_27()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(31,12,2010),"1/1/2011");
	}
	@Test
	public void test_28()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(30,11,2010),"1/12/2010");
	}

	//////leap
	@Test
	public void test_29()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(3,2,2010),"4/2/2010");
	}

	@Test
	public void test_30()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(28,2,2010),"1/3/2010");
	}
	@Test
	public void test_31()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(20,2,2008),"21/2/2008");
	}
	@Test
	public void test_32()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(29,2,2000),"1/3/2000");
	}
	@Test

	public void test_33()
	{
	nextDate ob1=new nextDate();
	assertEquals(ob1.nextday(28,2,1900),"1/3/1900");
	}
	}

