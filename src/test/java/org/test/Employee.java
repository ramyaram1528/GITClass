package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Employee {
	@Before
	public void before() {
          System.out.println("before");
	}
	@AfterClass
public static void afterclass() {
		 System.out.println("After class");
    }
	@Test
	public void test() {
		System.out.println("Test");
	}
	@BeforeClass
	public static void beforeclass() {
System.out.println("before class");
	}
	@After
	public void after() {
System.out.println("after");
	}
}
