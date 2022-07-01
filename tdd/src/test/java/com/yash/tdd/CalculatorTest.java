package com.yash.tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	    @BeforeClass
	   
		
     	@Test
	void testAddMethodWithNegativeNumber(){
	assertEquals(-2,Calculator.add(5, -7));
		}
		
		@Test
		void testAddMethodWithPositiveNumber(){
		assertEquals(12,Calculator.add(5, 7));
		}
		
		@Test
		void testSubMethodWithNegativeNumber(){
		assertEquals(2,Calculator.sub(-5, -7));
		assertEquals(12,Calculator.sub(5, -7));
		assertEquals(-12,Calculator.sub(-5, 7));
		assertEquals(7,Calculator.sub(0, -7));
		}

		@Test
		void testSubMethodWithPositiveNumber(){
		assertEquals(1,Calculator.sub(8, 7));
		assertEquals(-7,Calculator.sub(0, 7));
		}
		
		@Test
		void testMulMethodWithPositiveNumber(){
		assertEquals(56,Calculator.mul(8, 7));
		assertEquals(-0,Calculator.mul(0, 7));
		
		}
		
		
		@Test
		void testMulMethodWithNegativeNumber(){
		assertEquals(-56,Calculator.mul(8, -7));
		}
		
		@Test
		void testDivWhenDivideByZero()
		{
		  Throwable exception=assertThrows(ArithmeticException.class,()->{
				Calculator.div(12, 0);
			});
		  assertEquals("can't divide by zero", exception.getMessage());
		}
		
		@Test
		void testDivMethod()
		{
		  
		  assertEquals(4,Calculator.div(48, 12));
	}
		
		@Test
		void testDivWhenModulus()
		{
		  Throwable exception=assertThrows(ArithmeticException.class,()->{
				Calculator.modulus(12, 0);
			});
		  assertEquals("can't divide by zero", exception.getMessage());
		}
		
		
		@Test
		void testModulusMethod()
		{
		  
		  assertEquals(0,Calculator.modulus(48, 12));
		  assertEquals(2,Calculator.modulus(50, 12));
		}
		
		@Test
		void testPowerMethodWhenNegativePowerIsGiven()
		{
		 Throwable exception=assertThrows(IllegalArgumentException.class,()->{
				Calculator.power(2, -6);
			});
		 assertEquals("negative power not allowed", exception.getMessage());
		}
		
		@Test
		void testPowerMethodWithValiidInput()
		{
		  
		  assertEquals(1,Calculator.power(2, 0));
		  assertEquals(16,Calculator.power(2, 4));
		}
		
		@Test
		void testSquareRootMethodWhenNegativeNumberIsGiven()
		{
		 Throwable exception=assertThrows(IllegalArgumentException.class,()->{
				Calculator.squareRoot(-9);
			});
		 assertEquals("negative number for square root not allowed", exception.getMessage());
		}
		
		@Test
		void testSquareRootMethodWithValiidInput()
		{
		  
		  assertEquals(3,Calculator.squareRoot(9));
		 
		}
		
		@Test
		void testCubeRootMethodWhenNegativeNumberIsGiven()
		{
		 Throwable exception=assertThrows(IllegalArgumentException.class,()->{
				Calculator.cubeRoot(-27);
			});
		 assertEquals("negative number for cube not allowed", exception.getMessage());
		}
		
		@Test
		void testCubeRootMethodWithValiidInput()
		{
		  
		  assertEquals(3,Calculator.cubeRoot(27));
		 
		}
		

		
}
