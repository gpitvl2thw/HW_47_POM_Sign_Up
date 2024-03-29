//BEGIN
package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * проверка tableS
 */
public class No007CheckTableS {

	// номер элемента с массива - AllElements
	private int noElemAllElements = 4;
	// кол-во элементов, которые нужно обработать
	private int stroki = 4;
	// 1-TC_ID, 2-exp., 3-act.
	private int stolbs = 3;
	// кол-во строк для каждого элемента
	// isEnabled, isDisplayed, locate, size
	private int amount = 4;

	public String[][] No007CheckTableSToS2D(String strNP) {

		if (!No000ValuesAndMetods.getContinueTC()) {
			String[][] str = { { "1", No000ValuesAndMetods.getContinueErr(), "" } };
			return str;
		}

		String[][] s2d = new String[stroki * amount][stolbs];
		for (int i = 0; i < stroki * amount; i++)
			s2d[i][0] = No000ValuesAndMetods.getTaseCase();

		// открыть новый браузер
		WebDriver dr = No000ValuesAndMetods.getWebDriver();

		// URL
		dr.get(No000ValuesAndMetods.getUrl(strNP));

		// Driver Class
		String drClass = No000ValuesAndMetods.getBrowser(dr);

		for (int i = 0; i < stroki; i++) {
			try {
				// поиск элемента
				String nameElem = No000ValuesAndMetods.getAllElements(
						noElemAllElements, strNP) + (i + 1);
				String nameElemLook = nameElem + "_look";
				String nameElemFile = No000ValuesAndMetods.getPropertyes(
						nameElem, strNP);

				WebElement element = null;
				if (No000ValuesAndMetods.getPropertyes(nameElemLook, strNP)
						.equals("xpath")) {
					element = dr.findElement(By.xpath(nameElemFile));
				} else if (No000ValuesAndMetods.getPropertyes(nameElemLook,
						strNP).equals("id")) {
					element = dr.findElement(By.id(nameElemFile));
				}

				// element.isEnabled(); - #1 - (+0)
				s2d[i * amount][1] = nameElemFile + " is Enabled";
				if (element.isEnabled())
					s2d[i * amount][2] = nameElemFile + " is Enabled";
				else
					s2d[i * amount][2] = nameElemFile + " isn't Enabled";

				// element.isDisplayed(); - #2 - (+1)
				s2d[i * amount + 1][1] = nameElemFile + " is Displayed";
				if (element.isDisplayed()) {
					s2d[i * amount + 1][2] = nameElemFile + " is Displayed";
					if (drClass.equals("Firefox"))
						No000ValuesAndMetods.showElement(dr, element);
				} else
					s2d[i * amount + 1][2] = nameElemFile + " isn't Displayed";

				// locate - #3 - (+2)
				s2d[i * amount + 2][1] = "Locate of "
						+ nameElemFile
						+ " is "
						+ No000ValuesAndMetods.getPropertyes(nameElem
								+ "_locate", strNP);
				s2d[i * amount + 2][2] = "Locate of " + nameElemFile + " is "
						+ element.getLocation();

				// size - #4 - (+3)
				s2d[i * amount + 3][1] = "Size of "
						+ nameElemFile
						+ " is "
						+ No000ValuesAndMetods.getPropertyes(
								nameElem + "_size", strNP);
				s2d[i * amount + 3][2] = "Size of " + nameElemFile + " is "
						+ element.getSize();
			} catch (Exception e) {
				// если не нашел элемента
				s2d[i * amount][1] = s2d[i * amount + 1][1] = s2d[i * amount
						+ 2][1] = s2d[i * amount + 3][1] = "111111111111";
				s2d[i * amount][2] = s2d[i * amount + 1][2] = s2d[i * amount
						+ 2][2] = s2d[i * amount + 3][2] = "222222222222";
			}
		}

		// проверка
		if (!No000ValuesAndMetods.getContinueTC()) {
			No000ValuesAndMetods.setContinueTC((s2d[0][2].equals(s2d[0][1])));
			No000ValuesAndMetods.setContinueErr("ERROR IN - No007CheckTableS");
		}

		dr.quit();
		return s2d;
	}

	/*
	 * public static void main(String[] args) { No007CheckTableSToS2D qwe = new
	 * No007CheckTableSToS2D(); String[][] as =
	 * qwe.No007CheckTableSToS2DToS2D("P1"); for (int i = 0; i < as.length; i++)
	 * System.out.println("i=" + i + ", as=" + as[i][0] + "###" + as[i][1] +
	 * "###" + as[i][2] + "###"); }
	 */
}
// END