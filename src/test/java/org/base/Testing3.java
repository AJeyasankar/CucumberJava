package org.base;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Testing3 {

	@Parameters({"username"})
	@Test
	private void tc01(String s) {
	System.out.println(s);
	
	
	}
}
