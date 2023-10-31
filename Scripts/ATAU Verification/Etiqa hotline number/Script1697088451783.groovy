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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

//__________________SCREENSHOT_________________________
Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('URL').getValue('ATAU', 1))

WebUI.click(findTestObject('ATAU/button_Got It'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/Etiqa hotline/button_call'))

WebUI.verifyElementText(findTestObject('ATAU/Etiqa hotline/text_Malaysia'), 'Malaysia')

WebUI.verifyElementText(findTestObject('ATAU/Etiqa hotline/num_Malaysia'), '1-800-88-6491')

WebUI.verifyElementText(findTestObject('ATAU/Etiqa hotline/text_Singapore_Thailand_Brunei'), 'Singapore, Thailand & Brunei')

WebUI.verifyElementText(findTestObject('ATAU/Etiqa hotline/num_SgThaiBru'), '+603-2296 8600')

WebUI.verifyElementPresent(findTestObject('ATAU/Etiqa hotline/button_call_My'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/Etiqa hotline/button_call_SgThaiBru'), 0)

WebUI.closeBrowser()

