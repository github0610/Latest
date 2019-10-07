package Com.catnav.QAM.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Com.catnav.QAM.base.TestBase;

public class TestUtil extends TestBase {
public static int IMPLICIT_WAIT=20;
public static int PAGELOAD_WAIT=20;
static String testdatapath=System.getProperty("user.dir")+"\\src\\main\\java\\Com\\catnav\\QAM\\testdata\\TestData.xlsx";
//static XSSFWorkbook workbook;
//static XSSFSheet sheet;
public static void selectCountry(String countryName)
{
Select sel = new Select(driver.findElement(By.id("ecomm-ship-country")));
	sel.selectByVisibleText(countryName);
}
public static void selectState(String stateName)
{
Select sel = new Select(driver.findElement(By.id("ecomm-ship-state")));
	sel.selectByVisibleText(stateName);
}
public static WebElement ReturnWeEelement()
{
	//System.out.println(locator);
	List<WebElement> list = driver.findElements(By.xpath("//section/a[2]/span[@class='ui-button-text']"));
	return list.get(0);
}
/*public static Object[][] getTestData(String sheetName)
{
	FileInputStream file=null;
	try {
		file=new FileInputStream(testdatapath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	workbook = new XSSFWorkbook();
}*/
}
//WebDriverWait wait = new WebDriverWait(driver, 10);
//WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='ecomm-step1-submit']/button")));
