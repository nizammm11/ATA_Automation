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

WebUI.navigateToUrl(findTestData('URL').getValue('ATAPartner', 1))

WebUI.setText(findTestObject('Object Repository/ATA_Partner/LoginPage/input_Welcome to ATA Partner_p-inputtext p-_2f833e'), phoneNumber)

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/div_Welcome to ATA Partner_p-checkbox-box'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATA_Partner\\Login1' + dateTime) + '.png')

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/button_Request OTP'))

WebUI.setText(findTestObject('Object Repository/LoginPage/textfield_otp'), WebUI.getAttribute(findTestObject('Object Repository/ATA_Partner/LoginPage/otp'), 'value'))

//WebUI.delay(5)

//WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATA_Partner\\Login2' + dateTime) + '.png')

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/button_Verify'))

/*WebUI.verifyElementText(findTestObject('ATA_Partner/LoginPage/span_Log Out'), 'Log Out')

WebUI.click(findTestObject('ATA_Partner/LoginPage/a_Log Out'))

WebUI.click(findTestObject('ATA_Partner/LoginPage/button_Yes, proceed'), FailureHandling.STOP_ON_FAILURE)*/

