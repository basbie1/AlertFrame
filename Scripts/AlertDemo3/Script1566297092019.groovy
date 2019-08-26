import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt')

WebUI.click(findTestObject('Page_Tryit Editor v36/button_Try it'))

WebUI.verifyAlertPresent(2)

WebUI.delay(2)

WebUI.dismissAlert()

confirmCancelledText = WebUI.getText(findTestObject('nagrany_obiekty/Page_Tryit Editor v36/Page_Tryit Editor v36/p_User cancelled the prompt'))

WebUI.verifyMatch(confirmCancelledText, 'User cancelled the prompt.', false)

WebUI.click(findTestObject('nagrany_obiekty/Page_Tryit Editor v36/button_Try it_AGAIN'))

alertText = WebUI.getAlertText()

WebUI.verifyMatch(alertText, 'Please enter your name:', false)

println('Alert text is' + alertText)

//WebUI.verifyElementPresent(findTestObject('null'),3)
WebUI.setAlertText('Basia')

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(4)

confirmText = WebUI.getText(findTestObject('nagrany_obiekty/Page_Tryit Editor v36/p_User cancelled the prompt'))

WebUI.verifyMatch(confirmText, 'Hello Basia! How are you today?', false)

println('Confirm text is:' + confirmText)

WebUI.closeBrowser()

