package org.base;

import org.junit.Assert;
import org.junit.Test;

public class Assertio1 {

	@Test
	public void test1() {
		String s = "jacki";
		System.out.println("Test1");
		Assert.assertTrue(false);
		System.out.println("Test1:condition true : +s");
	}
	
	@Test
	public void test2() {
		String s = "Rosy";
		System.out.println("Test2");
		Assert.assertFalse(true);
		System.out.println("Test2: condition true : "+s);
	
	}
	@Test
	public void test3() {
		String s = "Nila";
		System.out.println("Test3");
		Assert.assertEquals("Nila", s);
		System.out.println("Test3:condition true :"+s);
	
	}
	@Test
	public void test4() {
		String s = "";
		boolean empty = s.isEmpty();
		System.out.println("Test4");
		Assert.assertEquals(true, empty);
		System.out.println("Test4: condition True :"+s);
	}
	@Test
	public void test5() {
		String s = "jinna";
		System.out.println("Test5");
		Assert.assertNotEquals("jinna", s);
		System.out.println("Test5:  condition True :"+s);
	}
	@Test
	public void test6() {
		System.out.println("Test6");
	}
	
	
	
	
	
	
	
	
}
