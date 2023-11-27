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
    WebUI.click(findTestObject('Object Repository/ATAP HH/Close Case/Tab_Resolved'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('ATAP HH/General/Search_VehicleNo'), findTestData('ATAP').getValue('VehicleNo', row))

    WebUI.sendKeys(findTestObject('ATAP HH/General/Search_VehicleNo'), Keys.chord(Keys.ENTER))

    WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//1. Case Resolved_' + row) + '_') + dateTime) + 
        '.png')

    WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

    WebUI.click(findTestObject('Object Repository/ATAP HH/Close Case/Button_Close Case'))

    WebUI.click(findTestObject('Object Repository/ATAP HH/Close Case/Button_Yes'))

    WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//2. Case Close_' + row) + '_') + dateTime) + 
        '.png')

    WebUI.click(findTestObject('ATAP HH/General/Button_OK'))
}

