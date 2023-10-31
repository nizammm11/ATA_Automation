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

//WebUI.openBrowser('')
//__________________SCREENSHOT_________________________
Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('URL').getValue('ATAU', 1))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/location pop up/text_Please enable your location settings'), 'Please enable your location settings', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATAU/location pop up/text_This allows us to locate you and dispatch assistance from the nearest location'), 
    'This allows us to locate you and dispatch assistance from the nearest location', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATAU/location pop up/text_For Android'), 'For Android', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATAU/location pop up/text_Settings  Location  Access my location'), 'Settings > Location > Access my location', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATAU/location pop up/text_For iOS'), 'For iOS', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATAU/location pop up/text_Settings  Privacy  Location Services'), 'Settings > Privacy > Location Services', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/ATAU/button_Got It'), 'Got It', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATAU/location pop up/Ill provide it manually link'), 'I\'ll provide it manually', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

