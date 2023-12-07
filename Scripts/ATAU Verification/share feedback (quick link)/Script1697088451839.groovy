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

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\QuickLinksShareFeedback\\1. Share Feedback_' + dateTime) + '.png')

WebUI.click(findTestObject('Object Repository/ATAU/button_Got It'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/feedback/a_Share feedback'))

WebUI.verifyElementText(findTestObject('ATAU/feedback/title_We care experience and would hear feedback'), 'We genuinely care about your experience with us and would love to hear your honest feedback.')

WebUI.verifyElementText(findTestObject('ATAU/feedback/subtitle_To proceed, key in vehicle number'), 'To proceed, key in your vehicle number below')

WebUI.verifyElementPresent(findTestObject('ATAU/feedback/input_vehicle number'), 0)

WebUI.setText(findTestObject('ATAU/feedback/input_vehicle number'), findTestData('ATAU Verify').getValue('QuickPlateNum', 1))

WebUI.verifyElementText(findTestObject('ATAU/feedback/note_Enter your vehicle number'), 'Enter your vehicle number without empty space')

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\QuickLinksShareFeedback\\2. Share Feedback_' + dateTime) + '.png')

WebUI.verifyElementPresent(findTestObject('ATAU/feedback/button_Proceed'), 0)

WebUI.verifyElementText(findTestObject('ATAU/feedback/button_Proceed'), 'Proceed')

WebUI.click(findTestObject('ATAU/feedback/button_Proceed'))

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\QuickLinksShareFeedback\\3. Share Feedback_' + dateTime) + '.png')

WebUI.closeBrowser()

