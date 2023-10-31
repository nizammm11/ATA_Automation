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

'TC36 - Search by Vehicle No'
WebUI.click(findTestObject('ATAP HH/Module/Module_Cases'))

WebUI.setText(findTestObject('ATAP HH/General/Search_VehicleNo'), 'JHZ12')

WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC36-Search by Vehicle No_' + dateTime) + '.png')

'TC36 - Search by Phone No'
WebUI.click(findTestObject('ATAP HH/Module/Module_Cases'))

WebUI.setText(findTestObject('ATAP HH/Verification/Search by_Phone No'), '0139996578')

WebUI.delay(5)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC36-Search by Phone No_' + dateTime) + '.png')

WebUI.sendKeys(findTestObject('ATAP HH/Verification/Search by_Phone No'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'TC36 - Search by Ticket ID'
WebUI.click(findTestObject('ATAP HH/Module/Module_Cases'))

WebUI.setText(findTestObject('ATAP HH/Verification/Search by_Ticket ID'), '0823-16011')

WebUI.delay(5)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC36-Search by Ticket ID_' + dateTime) + '.png')

WebUI.sendKeys(findTestObject('ATAP HH/Verification/Search by_Ticket ID'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'TC36 - Search by PIC'
WebUI.click(findTestObject('ATAP HH/Module/Module_Cases'))

WebUI.setText(findTestObject('ATAP HH/Verification/Search by_PIC'), 'Automation')

WebUI.delay(5)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC36-Search by PIC_' + dateTime) + '.png')

WebUI.sendKeys(findTestObject('ATAP HH/Verification/Search by_PIC'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'TC36 - Search by Provider'
WebUI.click(findTestObject('ATAP HH/Module/Module_Cases'))

WebUI.setText(findTestObject('ATAP HH/Verification/Search by_Provider'), 'ATA Baterikau', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC36-Search by Provider_' + dateTime) + '.png')

WebUI.sendKeys(findTestObject('ATAP HH/Verification/Search by_Provider'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'TC36 - Search by Channel'
WebUI.click(findTestObject('ATAP HH/Module/Module_Cases'))

WebUI.click(findTestObject('ATAP HH/Verification/Search by_Select Channel'))

WebUI.click(findTestObject('ATAP HH/Verification/Channel_Hotline'))

WebUI.delay(7)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC36-Search by Channel Hotline_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAP HH/Verification/Search by_Select Channel'))

WebUI.click(findTestObject('ATAP HH/Verification/Channel_Web'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC36-Search by Channel Web_' + dateTime) + '.png')

