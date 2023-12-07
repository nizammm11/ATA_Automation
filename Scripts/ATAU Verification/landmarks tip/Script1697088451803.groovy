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

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\landmark_tips\\1. landmark_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAU/location pop up/Ill provide it manually link'))

WebUI.delay(2)

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\landmark_tips\\2. landmark_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAU/landmark/Im not sure where I am'))

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\landmark_tips\\3. landmark_' + dateTime) + '.png')

WebUI.verifyElementText(findTestObject('ATAU/landmark/Heres a tip'), 'Here\'s a tip:', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATAU/landmark/Additional Information'), 'Look around you to find any landmarks nearby and let us know in the Additional Information section.', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATAU/landmark/Example of landmarks'), 'Example of landmarks:', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ATAU/landmark/image1'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/landmark/image2'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/landmark/image3'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/landmark/image4'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/landmark/image5'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/landmark/image6'), 0)

WebUI.closeBrowser()

