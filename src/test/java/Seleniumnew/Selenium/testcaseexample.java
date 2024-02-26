package Seleniumnew.Selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class testcaseexample {
	@Test
	
	public void tc1() {
		System.out.println("System in ....");
	}
	@Before
	public void precondition() {
		System.out.println("before.....");
	
	}
	@After
	public void closure() {
		System.out.println("After...");
		
	}
	@BeforeClass
	public static void bfclass() {
		System.out.println("before class...");
		
	}
	@AfterClass
	public static void afclass() {
		System.out.println("af class...");
	}
	

}
