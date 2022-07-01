package com.yash.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Question1To10Test {

	@Test
	public void testHcfForValidInput() {
		
	  assertEquals(8, Question1To10.hcfOfTwoNumber(8, 16));
	  assertEquals(1, Question1To10.hcfOfTwoNumber(7, 16));
	}
	
	@Test
	public void TestWhenNumberIsArmstrong()
	{
		assertTrue(Question1To10.isArmstrong(371));	
	}
	
	@Test
	public void TestWhenNumberIsNotArmstrong()
	{
		assertFalse(Question1To10.isArmstrong(324));
	}
	
	@Test
	public void findDigitLength()
	{
		assertEquals(3,Question1To10.findDigitLength(371));
	}
	
	@Test
	public void WhenNumbersSatisfyPythagorasTemplate()
	{
		assertTrue(Question1To10.checkPythagorasTemplate(3, 4, 5));	
	}
	
	@Test
	public void WhenNumbersNotSatisfyPythagorasTemplate()
	{
		assertFalse(Question1To10.checkPythagorasTemplate(3, 14, 15));
	}
	
	@Test
	public void TestCountVowel()
	{
		assertEquals(2,Question1To10.countVowel("hello") );
		assertEquals(0,Question1To10.countVowel("rhjg") );
	}
	
	@Test
	public void TestWhenNumberisPalindrome()
	{
		assertTrue(Question1To10.checkNoIsPalindrom(121) );
		
	}
	@Test
	public void TestWhenNumberisNotPalindrome()
	{
		assertFalse(Question1To10.checkNoIsPalindrom(1212) );
		
	}
	
	@Test
	public void TestWhenAllNumberAreEven()
	{
		int ary[]= {2,4,8,6,10,88};
		assertTrue(Question1To10.chaeckAllNoAreEven(ary));
	}
	
	
	@Test
	public void TestWhenAllNumberAreNotEven()
	{
		int ary[]= {2,4,8,17,10,88};
		assertFalse(Question1To10.chaeckAllNoAreEven(ary));
	}
	
	@Test
	public void TestRemovedAllDigitsWhiteSpaceSpecialChar()
	{
		assertEquals("This Red car", Question1To10.removedAllDigitsWhiteSpaceSpecialChar("This @ Red $car-"));
	}
	
	
	@Test
	public void TestGetUpdatedString()
	{
		String fruits[] = {"apple","orange","banana","lemon"};
		assertEquals("apple-orange-banana-lemon",Question1To10.getUpdatedString(fruits) );
	}
	
	@Test
	public void TestTocheckTwoStringArePalindrome()
	{
		assertTrue(Question1To10.checkTwoStringArePalindrome("naman","naman"));
	}
	
	
	
}
