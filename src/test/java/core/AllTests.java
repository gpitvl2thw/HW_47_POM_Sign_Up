package core;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ // ---------------------------------------
No001_11CheckUrlToS2DTest.class, // -----------------
		No002_12CheckUrlFalseToS2DTest.class, // -----------------
		No003_21CheckTitleToS2DTest.class, // -----------------
		No004_22CheckTitleFalseToS2DTest.class, // -----------------
		No005CheckAmountAllElementsTest.class, // -----------------
		No006CheckDisplayedlElementsTest.class, // -----------------
		No007CheckTableSTest.class, // -----------------
		No008CheckTable2Test.class, // -----------------
		No009CheckTable4Test.class, // -----------------
		No010CheckTable3Test.class, // -----------------
		No011_11CheckUrlToS2DP2Test.class, // -----------------
		No012_12CheckUrlFalseToS2DP2Test.class, // -----------------
		No013_21CheckTitleToS2DP2Test.class, // -----------------
		No014_22CheckTitleFalseToS2DP2Test.class, // -----------------
		No015CheckAmountAllElementsP2Test.class, // -----------------
		No016CheckDisplayedlElementsP2Test.class, // -----------------
		No017CheckTableSP2Test.class, // -----------------
		// No018CheckTable2P2Test.class, // так как он пустой - no quotes
		No019CheckTable4P2Test.class, // -----------------
		No020CheckTable3P2Test.class, // -----------------
		No021PushResetTitleTest.class, // -----------------
		No022PushResetElementSTest.class, // -----------------
		No023PushSubmitTitleTest.class, // -----------------
		No024PushSubmitElementSTest.class, // -----------------
		No025PushBackTitleTest.class, // -----------------
		No026PushBackElementSTest.class, // -----------------
		No027ErrorHandlingTest.class, // -----------------

// если используется один браузер
// NoLastCloseWebDriver - NoLastCloseWebDriver
// NoLastCloseWebDriver.class // NoLastCloseWebDriver
})
public class AllTests {

}
