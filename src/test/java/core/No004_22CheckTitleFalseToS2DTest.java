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
public class No004_22CheckTitleFalseToS2DTest {
	private static String addString = "123456789";
	private static String strNP = "P1";

	@BeforeClass
	public static void BeforeClass01() throws Exception {
	}

	// Test data generator
	@Parameters(name = "Iteration # {index} : exp: {1}; act: {2}")
	public static Collection<String[]> data() throws IOException {
		core.No001CheckUrlAndTitle propertiesLoad = new core.No001CheckUrlAndTitle();
		return Arrays.asList(propertiesLoad.No001CheckTitleToS2D(addString,
				strNP));
		/*
		 * System.out.println(core.No1CheckUrlAndTitle.getContinueTC()); if
		 * (core.No1CheckUrlAndTitle.getContinueTC()) { core.No1CheckUrlAndTitle
		 * propertiesLoad = new core.No1CheckUrlAndTitle(); return
		 * Arrays.asList(propertiesLoad.No1CheckTitleToS2D()); } else {
		 * String[][] st = new String[1][3]; st[0][0] = "0000"; st[0][1] =
		 * "1111"; st[0][2] = "2222"; return Arrays.asList(st); }
		 */
	}

	// @Parameter for Field injection instead of Constructor
	@Parameter(value = 0)
	public String testID;

	@Parameter(value = 1)
	public String expectedResult;

	@Parameter(value = 2)
	public String actualResult;

	@Test
	public void testCheckTitleFalseValidation() throws ComparisonFailure {
		assertEquals("FAILED", expectedResult + addString, actualResult);
	}
}