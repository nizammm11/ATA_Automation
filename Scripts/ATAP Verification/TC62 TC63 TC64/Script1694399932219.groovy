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

WebUI.click(findTestObject('ATAP HH/Module/Module_Providers'))

'TC62'
WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC62-Provider-List Details_' + dateTime) + '.png')

'TC63'
WebUI.click(findTestObject('ATAP HH/Provider/Button_Add New Provider'))

WebUI.setText(findTestObject('ATAP HH/Provider/Provider_Name'), 'TOWING XYZ')

WebUI.setText(findTestObject('ATAP HH/Provider/Provider_Phone Number'), '0123456787')

WebUI.setText(findTestObject('ATAP HH/Provider/Provider_Phone Number 2'), '0198765656')

WebUI.verifyElementPresent(findTestObject('ATAP HH/Provider/Provider_Email'), 0)

//WebUI.setText(findTestObject('ATAP HH/Provider/Provider_Email'), 'XYZ@GMAIL.COM')
WebUI.setText(findTestObject('ATAP HH/Provider/Provider_Address1'), 'NO.23, JALAN AMAN')

WebUI.setText(findTestObject('ATAP HH/Provider/Provider_Address2'), 'TAMAN IMPIAN')

WebUI.setText(findTestObject('ATAP HH/Provider/Provider_Address3'), 'KUALA LUMPUR')

WebUI.setText(findTestObject('ATAP HH/Provider/Provider_Postcode'), '59000')

WebUI.setText(findTestObject('ATAP HH/Provider/Provider_City'), 'KUALA LUMPUR')

WebUI.setText(findTestObject('ATAP HH/Provider/Provider_State'), 'WP KL')

WebUI.setText(findTestObject('ATAP HH/Provider/Provider_Coverage Area'), '')

WebUI.click(findTestObject('ATAP HH/Provider/Provider_Select a Status'))

WebUI.verifyElementPresent(findTestObject('ATAP HH/Provider/Status_Inactive'), 0)

WebUI.click(findTestObject('ATAP HH/Provider/Status_Active'))

WebUI.click(findTestObject('ATAP HH/Provider/Provider_Select provider type'))

WebUI.verifyElementPresent(findTestObject('ATAP HH/Provider/Provider Type_Broker'), 0)

WebUI.click(findTestObject('ATAP HH/Provider/Provider Type_Direct'))

WebUI.verifyElementPresent(findTestObject('ATAP HH/Provider/Button_Cancel'), 0)

WebUI.click(findTestObject('ATAP HH/Provider/Button_Submit'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC63-Provider-New Provider Added Successfully_' + 
    dateTime) + '.png')

WebUI.setText(findTestObject('ATAP HH/Provider/Search by Name'), 'TOWING XYZ')

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC63-Provider-New Provider_' + dateTime) + '.png')

'TC64'
WebUI.click(findTestObject('ATAP HH/Provider/Edit Provider'))

WebUI.sendKeys(findTestObject('ATAP HH/Provider/Provider_Address1'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('ATAP HH/Provider/Provider_Address1'), 'NO.25, JALAN KLANG2')

WebUI.click(findTestObject('ATAP HH/Provider/Button_Save (Edit Provider)'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//TC64-Provider-Edit Details Successfully_' + dateTime) + 
    '.png')

