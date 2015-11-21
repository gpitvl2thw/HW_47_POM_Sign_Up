package core;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.BeforeClass;
import org.junit.ComparisonFailure;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class No027ErrorHandlingTest {
	private static String strNP = "P1";

	@BeforeClass
	public static void BeforeClass01() throws Exception {
	}

	// Test data generator
	@Parameters(name = "Iteration # {index} : exp: {1}; act: {2}")
	public static Collection<String[]> data() throws IOException {
		core.No027ErrorHandling propertiesLoad = new core.No027ErrorHandling();
		return Arrays.asList(propertiesLoad.No027ErrorHandlingToS2D(strNP));
	}

	// @Parameter for Field injection instead of Constructor
	@Parameter(value = 0)
	public String testID;

	@Parameter(value = 1)
	public String expectedResult;

	@Parameter(value = 2)
	public String actualResult;

	@Test
	public void testCheckTableSValidation() throws ComparisonFailure {
		assertEquals("FAILED", expectedResult, actualResult);
	}
}