package org.base;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class Testing2 {

	@Test(priority = -9)
	private void tc01() {
		System.out.println("T1");
	}
	
	@Test(priority = -10)
	private void tc02() {
		System.out.println("T2");
	}
	
	@Test(priority = 2,invocationCount = 20)
	private void tc03() {
		System.out.println("T3");
	}
	
	@Test(priority = 0)
	private void tc04() {
		System.out.println("T4");
	}
	@Test(priority = -5, enabled = false)
	private void tc05() {
		System.out.println("T5");
	}
	
	
}
