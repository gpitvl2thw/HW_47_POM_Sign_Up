package core;

import org.junit.AfterClass;
import org.junit.Test;

//import static org.junit.Assert.*;

public class NoLastCloseWebDriver {

	/*
	@BeforeClass
	// 1
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	// 2
	public void setUp() throws Exception {
	}

	@After
	// 1
	public void tearDown() throws Exception {
	}
	*/
	
	@AfterClass
	// 2
	public static void tearDownAfterClass() throws Exception {
		//No1CheckUrlAndTitle.getWebDriver().quit();
	}

	@Test
	public void test() {
		// assertTrue(true);
	}
}