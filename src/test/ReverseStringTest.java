package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import StringsandArraysCC.ReverseString;
public class ReverseStringTest {

	@Test
	public void reverseStringTest() {
		ReverseString revStrClass = new ReverseString();
		String str = revStrClass.reverseString("Such");
		assertEquals("hcuS", str);
	}
	
}
