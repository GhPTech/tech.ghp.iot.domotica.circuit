package tech.ghp.iot.domotica.circuit.provider;

import junit.framework.TestCase;

/*
 * 
 * 
 * 
 */

public class CircuitImplTest extends TestCase {
	
	/*
	 * 
	 * 
	 * 
	 */
	public void testSimple() throws Exception {
			CircuitImpl testString = new CircuitImpl();
			String expectedString = new String("GHP");
			String inputString = new String(testString.upper("ghp"));
			assertEquals(expectedString,inputString);
	}
}
