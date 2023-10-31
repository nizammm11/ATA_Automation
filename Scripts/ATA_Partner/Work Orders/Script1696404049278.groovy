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
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://canary.autoassistcare.etiqa.com.my/partner/auth/login')

WebUI.setText(findTestObject('Object Repository/ATA_Partner/LoginPage/input_Welcome to ATA Partner_p-inputtext p-_2f833e'), '122614910')

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/div_Welcome to ATA Partner_p-checkbox-box'))

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/button_Request OTP'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/button_Verify'))

WebUI.click(findTestObject('ATA_Partner/Work Order/span_Work Orders'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Work Order/h2_List of Work Order(s)'), 'List of Work Order(s)')

WebUI.verifyElementText(findTestObject('ATA_Partner/Work Order/th_Invoice date'), 'Invoice date')

WebUI.verifyElementText(findTestObject('ATA_Partner/Work Order/th_Work order number'), 'Work order number')

WebUI.verifyElementText(findTestObject('ATA_Partner/Work Order/th_Total'), 'Total')

WebUI.verifyElementText(findTestObject('ATA_Partner/Work Order/th_Action'), 'Action')

WebUI.verifyElementText(findTestObject('ATA_Partner/Work Order/span_View'), 'View')

WebUI.click(findTestObject('ATA_Partner/Work Order/span_View'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Work Order/workOrderReady'), 'The work order is ready. Please prepare and upload your invoice (together with the approval signatory).')

WebUI.verifyElementText(findTestObject('ATA_Partner/Work Order/span_Print'), 'Print')

WebUI.click(findTestObject('ATA_Partner/Work Order/button_Print'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.verifyElementText(findTestObject('ATA_Partner/Work Order/span_Upload'), 'Upload')

WebUI.click(findTestObject('ATA_Partner/Work Order/button_Upload'))

