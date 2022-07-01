package com.yash.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class SingletonPerson {

	@Test
	public void TestSingletonPerson()
	{
	  Person p1=Person.getInstance();
	  Person p2=Person.getInstance();
	  Assert.assertSame(p1, p2);
	}

	@Test
	public void TestSingletonPersonHashcode()
	{
	  Person p1=Person.getInstance();
	  Person p2=Person.getInstance();
	  assertEquals(p1.hashCode(),p2.hashCode());
	}
}
