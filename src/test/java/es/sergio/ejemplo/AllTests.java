package es.sergio.ejemplo;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestEsPar.class);
		//$JUnit-END$
		return suite;
	}

}
