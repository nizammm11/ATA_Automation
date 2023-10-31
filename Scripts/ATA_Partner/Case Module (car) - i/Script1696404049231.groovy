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

Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://canary.autoassistcare.etiqa.com.my/partner/auth/login')

WebUI.verifyElementText(findTestObject('ATA_Partner/LoginPage/Words/Page_Partner/Page_Partner/h1_Welcome to ATA Partner'), 'Welcome to ATA Partner', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATA_Partner/LoginPage/Words/Page_Partner/Page_Partner/SMS to verify your mobile number'), 'To get started, we will send an SMS to verify your mobile number.')

WebUI.verifyElementText(findTestObject('ATA_Partner/LoginPage/Words/Page_Partner/Page_Partner/Terms and Conditions'), 'By continuing, you are indicating that you accept Etiqa\'s Privacy Notice and agree to the Terms and Conditions')

WebUI.verifyElementText(findTestObject('ATA_Partner/LoginPage/Words/Page_Partner/Page_Partner/div_WARNING'), 'WARNING')

WebUI.verifyElementText(findTestObject('ATA_Partner/LoginPage/Words/Page_Partner/Page_Partner/div_Ver 3.8.0'), 'Ver 3.10.0 © 2022, ATA Solutions by Etiqa. All Rights Reserved')

WebUI.setText(findTestObject('Object Repository/ATA_Partner/LoginPage/input_Welcome to ATA Partner_p-inputtext p-_2f833e'), '122614910')

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/div_Welcome to ATA Partner_p-checkbox-box'))

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/button_Request OTP'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/button_Verify'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Case Listing/Tab/Page_Partner/p_Toggle On Duty to receive cases'), 'Toggle "On Duty" to receive cases')

WebUI.click(findTestObject('ATA_Partner/Case Listing/Tab/Page_Partner/div_Off Duty'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Tab/Page_Partner/div_On Duty'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Tab/Page_Partner/a_In progress'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Tab/Page_Partner/a_History'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Tab/Tab/a_New case'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Tab/Tab/button_Policy'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Assign/Page_Partner/button_Nurul Azika'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Assign/Page_Partner/button_All Drivers'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Assign/Page_Partner/button_Nearest'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Assign/Page_Partner/button_assign'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Assign/Page_Partner/button_Assign this driver'))

WebUI.click(findTestObject('ATA_Partner/Case Listing/Assign/Page_Partner/button_Yes, I want to assign'))

