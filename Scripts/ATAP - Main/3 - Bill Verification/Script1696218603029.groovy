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

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Login'), [:], FailureHandling.STOP_ON_FAILURE)

for (def row = 1; row <= findTestData('ATAP').getRowNumbers(); row++) {
    WebUI.click(findTestObject('ATAP HH/Module/Module_Billings'))

    WebUI.click(findTestObject('ATAP HH/Bill Verification/Tab_Confirmed Bill(s)'))

    WebUI.setText(findTestObject('ATAP HH/General/Search_VehicleNo'), findTestData('ATAP').getValue('VehicleNo', row))

    WebUI.sendKeys(findTestObject('ATAP HH/General/Search_VehicleNo'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

    WebUI.click(findTestObject('ATAP HH/General/Button View'))

    WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//1. Confirmed Bill_' + row) + '_') + dateTime) + 
        '.png')

    WebUI.click(findTestObject('ATAP HH/Bill Verification/Button Verify Bill'))

    WebUI.click(findTestObject('ATAP HH/Bill Verification/Button_Yes, verify'))

    WebUI.click(findTestObject('ATAP HH/Bill Verification/Tab_Verified Bill(s)'))

    WebUI.setText(findTestObject('ATAP HH/General/Search_VehicleNo'), findTestData('ATAP').getValue('VehicleNo', row))

    WebUI.sendKeys(findTestObject('ATAP HH/General/Search_VehicleNo'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

    WebUI.click(findTestObject('ATAP HH/General/Button View'))

    WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//2. Bill Verified_' + row) + '_') + dateTime) + 
        '.png')
}

