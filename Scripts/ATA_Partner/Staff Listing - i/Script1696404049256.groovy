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

/*Date today = new Date()

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

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/button_Verify'))*/
WebUI.callTestCase(findTestCase('ATA_Partner/Partner - Login'), [('phoneNumber') : '127104130'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing/Page_Partner/Staff Listing'), 'Staff Listing')

WebUI.click(findTestObject('ATA_Partner/Staff_Listing/Page_Partner/Staff Listing'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing1/h1_Staff Listing'), 'Staff Listing')

//WebUI.verifyElementPresent(findTestObject('ATA_Partner/Staff_Listing2/staff_click'), 0)
WebUI.click(findTestObject('ATA_Partner/Staff_Listing/click_staff'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing1/p_Services Offered by Rider'), 'Services Offered by Rider')

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing1/p_Accident'), 'Accident')

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing2/Page_Partner/Page_Partner/Off_Accident'), 'Off')

WebUI.click(findTestObject('ATA_Partner/Staff_Listing2/Page_Partner/Page_Partner/Off_Accident'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing2/Page_Partner/Page_Partner/On_Accident'), 'On')

WebUI.click(findTestObject('ATA_Partner/Staff_Listing2/Page_Partner/On_Accident'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing2/Page_Partner/p_Breakdown Towing'), 'Breakdown Towing')

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing2/Page_Partner/p_Repair-on-Site'), 'Repair-on-Site')

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing2/Page_Partner/p_Motorcycle Towing'), 'Motorcycle Towing')

WebUI.click(findTestObject('ATA_Partner/Staff_Listing2/Page_Partner/Staff_Listing/Staff_Listing/Page_Partner/div_Off_BT'))

WebUI.click(findTestObject('ATA_Partner/Staff_Listing2/Staff_Listing/Page_Partner/BT_On'))

WebUI.click(findTestObject('ATA_Partner/Staff_Listing2/Staff_Listing/Page_Partner/ros_off'))

WebUI.click(findTestObject('ATA_Partner/Staff_Listing2/Staff_Listing/Page_Partner/ros_On'))

WebUI.click(findTestObject('ATA_Partner/Staff_Listing2/Staff_Listing/Page_Partner/motorTowing_Off'))

WebUI.click(findTestObject('ATA_Partner/Staff_Listing2/Staff_Listing/Page_Partner/motorTowing_On'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing2/Staff_Listing/Page_Partner/Page_Partner/p_Skills'), 'Skills')

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing2/Staff_Listing/Page_Partner/Page_Partner/label_Handbrake Repair'), 
    'Handbrake Repair')

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing2/Staff_Listing/Page_Partner/label_Gear Repair'), 'Gear Repair')

WebUI.verifyElementText(findTestObject('ATA_Partner/Staff_Listing2/Staff_Listing/Page_Partner/label_Steering Wheel Repair'), 
    'Steering Wheel Repair')

WebUI.click(findTestObject('ATA_Partner/Staff_Listing/handbrake_checkbox'))

WebUI.click(findTestObject('ATA_Partner/Staff_Listing/gearrepair_checkbox'))

WebUI.click(findTestObject('ATA_Partner/Staff_Listing/wheelrepair_checkbox'))

WebUI.callTestCase(findTestCase('ATA_Partner/Partner - Logout'), [:], FailureHandling.STOP_ON_FAILURE)

