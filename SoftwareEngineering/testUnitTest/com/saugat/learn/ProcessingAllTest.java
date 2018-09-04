package com.saugat.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProcessingAllTest {

	private static ProcessingAll processing;
	@Before
	public void setUp() throws Exception {
		processing = new ProcessingAll();
	}

	@Test
	public void testSlopeOfLine() {
		//fail("Not yet implemented");
		
		float a1 = 4;
		float b1 = 4;
		float a2 = 6;
		float b2 = 8;

		float result = (b2 - b1)/(a2 - a1);
		assertEquals(result, processing.slope(4, 4, 6, 8), 0.001);

	}
	@Test
	public void testDistanceBetweenPoints() {
		//fail("Not yet implemented");
		float a1 = 2;
		float b1 = 3;
		float a2 = 5;
		float b2 = 7;

		float res = (float) Math.sqrt((a2 - a1)*(a2 - a1) + (b2 - b1)*(b2 - b1));
		assertEquals(res, processing.distance(2, 3, 5, 7), 0.001);

	}
	@Test
	public void testEquationOfLine() {
		//fail("Not yet implemented");
		
		float a1 =3;
		float b1=5;
		float slope =2;
		float value = y1 - (slope*x1);
		
		String res= "y -"+slope+"x =" +value;
		assertEquals(res, processing.equation(x1, y1, slope));
		
	}

}
