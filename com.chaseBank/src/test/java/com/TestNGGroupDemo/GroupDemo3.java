package com.TestNGGroupDemo;

import org.testng.annotations.Test;

public class GroupDemo3 {
	
	
	@Test(priority=1, groups= {"Smoke"})
	public void test1() {
		System.out.println("This is class-3 and test-1");
	}
	@Test(priority=2, groups= {"Regression"})
	public void test2() {
		System.out.println("This is class-3 and test-2");
	}

	@Test(priority=3, groups= {"Sanity"})
	public void test3() {
		System.out.println("This is class-3 and test-3");
	}
	
	@Test(priority=4, groups= {"Sanity", "Regression", "linux.Regression"})
	public void test4() {
		System.out.println("This is class-3 and test-4");
	}
	
	@Test(priority=5, groups= {"Smoke", "Regression"})
	public void test5() {
		System.out.println("This is class-3 and test-5");
	}
	
	@Test(priority=6)
	public void test6() {
		System.out.println("This is class-3 and test-6");
	}


}
