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

'TC35 - Tab Verify'
WebUI.click(findTestObject('ATAP HH/Module/Module_Cases'))

WebUI.click(findTestObject('ATAP HH/Verification/Tab_New Request'))

WebUI.verifyElementClickable(findTestObject('ATAP HH/Verification/Tab_New Request'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC35-Tab Verify - New Request Case_' + dateTime) + 
    '.png')

WebUI.click(findTestObject('ATAP HH/Verification/Tab_Open'))

WebUI.verifyElementClickable(findTestObject('ATAP HH/Verification/Tab_Open'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC35-Tab Verify - Open Case_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAP HH/Verification/Tab_In Progress'))

WebUI.verifyElementClickable(findTestObject('ATAP HH/Verification/Tab_In Progress'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC35-Tab Verify - In Progress Case_' + dateTime) + 
    '.png')

WebUI.click(findTestObject('ATAP HH/Verification/Tab_Resolved'))

WebUI.verifyElementClickable(findTestObject('ATAP HH/Verification/Tab_Resolved'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC35-Tab Verify - Resolved Case_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAP HH/Verification/Tab_History'))

WebUI.verifyElementClickable(findTestObject('ATAP HH/Verification/Tab_History'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC35-Tab Verify - History Case_' + dateTime) + '.png')

