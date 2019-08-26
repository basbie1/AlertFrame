import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject



//class BeforeAndAfterTestCase {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
//	protected WebDriver driver;
//	protected WebDriverWait wait;
	
	//@BeforeTestCase
	//public void sampleBeforeTestCase() {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bbieszk\\Downloads\\chromedriver.exe");
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("start-maximized");
	//	driver = new ChromeDriver(options);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	wait = new WebDriverWait(driver, 10);
		
	//}
//	@BeforeTestCase
	//def beforeTestcase(TestCaseContext testCaseContext) {
	//	if (GlobalVariable.init_browser) {
		//	WebUI.openBrowser(GlobalVariable.URL);
		//	WebUI.maximizeWindow();
			//WebUI.navigateToUrl(GlobalVariable.URL);
		//}
//	}
	
//	@AfterTestCase
//	def afterTestcase(TestCaseContext testCaseContext) {
	//	WebUI.closeBrowser();

//}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	//@AfterTestCase
	//public void sampleAfterTestCase() {
	//	driver.quit();
	//	driver = null;
	//}
		

//	}