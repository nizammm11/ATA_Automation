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

WebUI.delay(2)

'TC48'
WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

WebUI.click(findTestObject('ATAP HH/General/Button_Cancel Case'))

WebUI.setText(findTestObject('ATAP HH/General/Cancel Case_Remarks'), 'test')

WebUI.verifyElementPresent(findTestObject('ATAP HH/General/Button_No'), 0)

WebUI.click(findTestObject('ATAP HH/General/Button_Yes, Proceed'))

WebUI.click(findTestObject('ATAP HH/General/Button_OK'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC48-Cancel Case_' + dateTime) + '.png')

'TC49'
WebUI.click(findTestObject('ATAP HH/Module/Module_Cases'))

WebUI.click(findTestObject('ATAP HH/Verification/Tab_Open'))

WebUI.delay(1)

WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

WebUI.click(findTestObject('ATAP HH/General/Button_Cancel Case'))

WebUI.setText(findTestObject('ATAP HH/General/Cancel Case_Remarks'), 'test')

WebUI.click(findTestObject('ATAP HH/General/Checkbox_Create a copy'))

WebUI.click(findTestObject('ATAP HH/General/Button_Yes, Proceed'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC49-Cancelled Case-Copy Case_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAP HH/General/Button_OK'))

'TC50'
WebUI.click(findTestObject('ATAP HH/Module/Module_Cases'))

WebUI.click(findTestObject('ATAP HH/Verification/Tab_Resolved'))

WebUI.delay(1)

WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

WebUI.click(findTestObject('ATAP HH/Close Case/Button_Close Case'))

WebUI.click(findTestObject('ATAP HH/General/Checkbox_Create Copy_Close Case'))

WebUI.click(findTestObject('ATAP HH/Close Case/Button_Yes'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC50-Cancelled Case-Copy Case_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAP HH/General/Button_OK'))

