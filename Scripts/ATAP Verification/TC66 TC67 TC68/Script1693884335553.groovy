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

'TC66'
WebUI.click(findTestObject('ATAP HH/Module/Module_Billings'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC66-List of Case - New Bills_' + dateTime) + '.png')

'TC67'
WebUI.verifyElementPresent(findTestObject('ATAP HH/Bill Verification/Tab_New Bill(s)'), 0)

WebUI.click(findTestObject('ATAP HH/Bill Verification/Tab_Confirmed Bill(s)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC67-Case - Confirmed Bills_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAP HH/Bill Verification/Tab_Verified Bill(s)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC67-Case - Verified Bills_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAP HH/Bill Verification/Tab_Rejected Bill(s)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC67-Case - Rejected Bills_' + dateTime) + '.png')

'TC68'
WebUI.click(findTestObject('ATAP HH/Bill Verification/Tab_Confirmed Bill(s)'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAP HH/General/Button View'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC68-Confirmed Bill - View Assignment Date_' + dateTime) + 
    '.png')

