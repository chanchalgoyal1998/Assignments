package com.yash.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StudentCloneTest {

	@Test
	void testCloneObject() throws CloneNotSupportedException {
		
		Student st=new Student("Ram","Indore");
		Student cloneobj=(Student) st.clone();
		Assert.assertNotSame(st, cloneobj);
		
	}

	@Test
	void testCloneObjectMethodValue() throws CloneNotSupportedException {
		
		Student st=new Student("Ram","Indore");
		Student cloneobj=(Student) st.clone();
		assertEquals("Ram",cloneobj.getName());
		assertEquals("Indore",cloneobj.getCity());
	}

}
