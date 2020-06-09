package es.sergio.ejemplo;

import junit.framework.TestCase;

public class TestEsPar extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testEsPar() {
		Par par = new Par();
		assertEquals(true, par.esPar(4));
		assertEquals(true, par.esPar(6));
		assertEquals(false, par.esPar(5));
	}

}
