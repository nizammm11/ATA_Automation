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

Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('URL').getValue('ATAU', 1))

WebUI.click(findTestObject('Object Repository/ATAU/button_Got It'))

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAU\\//WhereAreYouNow//1. Location_' + dateTime) + '.png')
WebUI.click(findTestObject('Object Repository/ATAU/main page/Where Are You Now'))

WebUI.click(findTestObject('Object Repository/ATAU/button_Got It'))

WebUI.verifyElementText(findTestObject('ATAU/location page/Your location'), 'Your location', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATAU/location page/Or use my current location'), 'Or use my current location', FailureHandling.STOP_ON_FAILURE)

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAU\\//WhereAreYouNow//2. Location_' + dateTime) + '.png')
//WebUI.verifyElementText(findTestObject('ATAU/landmark/Im not sure where I am'), 'I\'m not sure where I am', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('ATAU/location page/Back to main'), 'Back', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATAU/location page/btn_Confirm_Location'), 'Confirm Location', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/ATAU/location page/location'), findTestData('ATAU Verify').getValue('Location', 1))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ATAU/location page/location'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('ATAU/location page/location'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ATAU/location page/x_button'), 0)

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAU\\//WhereAreYouNow//3. Location_' + dateTime) + '.png')
WebUI.click(findTestObject('Object Repository/ATAU/location page/btn_Confirm_Location'))

WebUI.delay(2)

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAU\\//WhereAreYouNow//4. Location_' + dateTime) + '.png')
WebUI.closeBrowser()

