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

WebUI.click(findTestObject('ATA_Partner/Invoice/Page_Partner/span_Invoices'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Invoice/Page_Partner/h2_List of Invoice(s)'), 'List of Invoice(s)')

WebUI.verifyElementText(findTestObject('ATA_Partner/Invoice/Page_Partner/th_Invoice Date'), 'Invoice Date')

WebUI.verifyElementText(findTestObject('ATA_Partner/Invoice/Page_Partner/th_Invoice(s) Number'), 'Invoice(s) Number')

WebUI.verifyElementText(findTestObject('ATA_Partner/Invoice/Page_Partner/th_Entity'), 'Entity')

WebUI.verifyElementText(findTestObject('ATA_Partner/Invoice/Page_Partner/th_Status'), 'Status')

WebUI.verifyElementText(findTestObject('ATA_Partner/Invoice/Page_Partner/th_Total'), 'Total')

WebUI.verifyElementText(findTestObject('ATA_Partner/Invoice/Page_Partner/th_Action'), 'Action')

WebUI.click(findTestObject('ATA_Partner/Invoice/Page_Partner/dateFrom'))

WebUI.click(findTestObject('ATA_Partner/Invoice/Page_Partner/errorLeft'))

WebUI.click(findTestObject('ATA_Partner/Invoice/Page_Partner/span_1'))

WebUI.click(findTestObject('Invoice/Page_Partner/Page_Partner/dateTo'))

WebUI.click(findTestObject('ATA_Partner/Invoice/Page_Partner/leftError'))

WebUI.click(findTestObject('Invoice/Page_Partner/Page_Partner/span_31'))

WebUI.click(findTestObject('Invoice/Page_Partner/Page_Partner/span_Export CSV'))

