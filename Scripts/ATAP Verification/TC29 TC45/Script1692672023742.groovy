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

'TC45'
WebUI.click(findTestObject('ATAP HH/Verification/Tab_In progress'))

WebUI.setText(findTestObject('ATAP HH/Verification/Search by_PIC'), 'Automation')

WebUI.delay(5)

WebUI.takeScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC45-In Progress - Status Assigned_' + dateTime) + '.png')

'T29 - Calculate Button'
WebUI.sendKeys(findTestObject('ATAP HH/Verification/Search by_PIC'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

WebUI.click(findTestObject('ATAP HH/Verification/Button_Calculate'))

WebUI.verifyElementClickable(findTestObject('ATAP HH/Verification/Button_Calculate'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC29-Assigned Case - Calculate_' + dateTime) + '.png')

