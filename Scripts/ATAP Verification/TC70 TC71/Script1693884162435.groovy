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

WebUI.click(findTestObject('ATAP HH/Module/Module_Billings'))

WebUI.click(findTestObject('ATAP HH/Bill Verification/Tab_Confirmed Bill(s)'))

WebUI.click(findTestObject('ATAP HH/General/Button View'))

'TC70'
WebUI.click(findTestObject('ATAP HH/Bill Verification/Button_Reject'))

WebUI.setText(findTestObject('ATAP HH/Bill Verification/Reject Reason'), 'test')

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC70-Reject Bill Details_' + dateTime) + '.png')

WebUI.verifyElementPresent(findTestObject('ATAP HH/Bill Verification/Reject_No'), 0)

WebUI.click(findTestObject('ATAP HH/Bill Verification/Reject_Yes'))

'TC71'
WebUI.click(findTestObject('ATAP HH/Module/Module_Billings'))

WebUI.click(findTestObject('ATAP HH/Bill Verification/Tab_Verified Bill(s)'))

WebUI.click(findTestObject('ATAP HH/General/Button View'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC71-Verified Bill - Table Price Details_' + dateTime) + 
    '.png')

