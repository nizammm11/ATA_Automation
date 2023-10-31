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

'TC03'
WebUI.click(findTestObject('Object Repository/ATAP HH/Module/Module_Cases'))

WebUI.click(findTestObject('Object Repository/ATAP HH/Verification/Button Create New Case'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC03-Create New Case_' + dateTime) + '.png')

'TC10'
WebUI.click(findTestObject('Object Repository/ATAP HH/Module/Module_Cases'))

WebUI.setText(findTestObject('ATAP HH/General/Search_VehicleNo'), 'JHZ12')

WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

WebUI.click(findTestObject('Object Repository/ATAP HH/Verification/Button_Add Activity'))

WebUI.setText(findTestObject('Object Repository/ATAP HH/Verification/Add Activity (Input)'), 'Assign test')

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC10-Add Activity_' + dateTime) + '.png')

WebUI.click(findTestObject('Object Repository/ATAP HH/Verification/Button_Save'))

'TC Activity Logs viewed'
WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC10-Activity Log_' + dateTime) + '.png')

