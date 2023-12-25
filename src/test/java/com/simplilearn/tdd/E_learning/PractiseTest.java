package com.simplilearn.tdd.E_learning;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PractiseTest {
	
	PractiseService prac;
	@BeforeTest
	public void setup() {
		prac=new PractiseService();
		
	}
	@AfterTest
	public void cleanup() {
		if(prac!=null)
			prac=null;
	}
	@Test
	public void test1() {
		assertNotNull(prac);
	}
	@Test
	public void test2() {
		assertTrue(prac.getPractice().size()==5);
	}
	@Test
	public void test3() {
		assertEquals(prac.getPractice().size(),5);
	}

}
