import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Open Browser'
WebUI.openBrowser('')

'Open Site \'http://www.bdirectcloud.net/\''
WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

'Verify UserName field is present'
WebUI.verifyElementPresent(findTestObject('Page_myBidfood/input_Stay Signed In_UserName'), 0)

'Enter UserName'
WebUI.setText(findTestObject('Object Repository/Page_myBidfood/input_Stay Signed In_UserName'), GlobalVariable.UserName)

'Verify Password field is present'
WebUI.verifyElementPresent(findTestObject('Page_myBidfood/input_Stay Signed In_Password'), 0)

'Enter Password'
WebUI.setText(findTestObject('Object Repository/Page_myBidfood/input_Stay Signed In_Password'), GlobalVariable.Password)

'Verify Login Button is present'
WebUI.verifyElementPresent(findTestObject('Page_myBidfood/input_Stay Signed In_submitBtn'), 0)

'Click on Login button'
WebUI.click(findTestObject('Object Repository/Page_myBidfood/input_Stay Signed In_submitBtn'))

WebUI.delay(2)

'Click on user\'s logout dropdown list\r\n'
WebUI.click(findTestObject('Page_myBidfood/svg_will help us improve it_icon down-arrow'))

'Verify Logout option is present'
WebUI.verifyElementPresent(findTestObject('Page_myBidfood/a_Logout'), 0)

'Click on LogOut button'
WebUI.click(findTestObject('Page_myBidfood/a_Logout'))

'Close Browser'
WebUI.closeBrowser()

