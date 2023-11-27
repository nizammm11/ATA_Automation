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
import java.time.format.DateTimeFormatter as DateTimeFormatter

//__________________SCREENSHOT_________________________
Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Login'), [('Username') : '80007700', ('Password') : 'DragCk23/'], FailureHandling.STOP_ON_FAILURE)

'TC74'
WebUI.click(findTestObject('ATAP HH/Module/Module_Inbox'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC74-Module Inbox_' + dateTime) + 
    '.png')

WebUI.click(findTestObject('ATAP HH/Inbox/Button_Approve (Inbox)'))

WebUI.setText(findTestObject('ATAP HH/Inbox/Inbox_Remarks'), 'Test')

WebUI.verifyElementPresent(findTestObject('ATAP HH/Inbox/Button_Close (Inbox)'), 0)

WebUI.click(findTestObject('ATAP HH/Inbox/Button_Approve'))

WebUI.click(findTestObject('ATAP HH/General/Button_OK'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC74-Inbox - Approved_' + dateTime) + 
    '.png')

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Logout'), [:], FailureHandling.STOP_ON_FAILURE)

