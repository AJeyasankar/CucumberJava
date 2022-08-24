package org.base;

import org.testng.annotations.Test;

public class GroupTestingSample {
@Test(groups = "Sanity",dependsOnMethods = "tc09")
private void tc01() {
System.out.println("Sanity : Test1");
}
@Test(groups = "Regg",dependsOnGroups = "Sanity")
private void tc02() {
System.out.println("Regg : Test2");
}
@Test(groups = "Smoke")
private void tc03() {
System.out.println("Smoke : Test3");
}
@Test(groups = "Sanity")
private void tc04() {
System.out.println("Sanity : Test4");
}
@Test(groups = "Smoke")
private void tc05() {
System.out.println("Smoke : Test5");
}
@Test(groups = "Regg")
private void tc06() {
System.out.println("Regg : Test6");
}
@Test(groups = "Sanity")
private void tc07() {
System.out.println("Sanity : Test7");
}
@Test(groups = "Unit")
private void tc08() {
System.out.println("Unit : Test8");
}
@Test(groups = "Unit")
private void tc09() {
System.out.println("Unit : Test9");
}
@Test(groups = "Integra")
private void tc10() {
System.out.println("Integra : Test10");
}




}
