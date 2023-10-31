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

//WebUI.openBrowser('')
//__________________SCREENSHOT_________________________
Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('URL').getValue('ATAU', 1))

WebUI.click(findTestObject('Object Repository/ATAU/button_Got It'))

WebUI.click(findTestObject('ATAU/main page/btn_Car'))

WebUI.click(findTestObject('ATAU/Car service list/btn_brake'))

WebUI.click(findTestObject('ATAU/Questions/btn_No_1'))

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_2'))

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_3'))

WebUI.click(findTestObject('ATAU/Questions/btn_No_4'))

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_5'))

WebUI.click(findTestObject('ATAU/Questions/btn_No_6'))

WebUI.click(findTestObject('ATAU/Questions/button_Continue'))

WebUI.click(findTestObject('ATAU/preferred destination/preferred_Destination'))

WebUI.click(findTestObject('ATAU/preferred destination/a_Next'))

WebUI.setText(findTestObject('ATAU/preferred destination/input_destination'), findTestData('ATAU Verify').getValue('Destination', 1))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ATAU/preferred destination/input_destination'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('ATAU/preferred destination/btn_Next_selectdestination'))

WebUI.setText(findTestObject('ATAU/details page/input_Vehicle Registration Number'), findTestData('ATAU Verify').getValue('VehicleNumber', 4))

WebUI.setText(findTestObject('ATAU/details page/input_Mobile Number'), findTestData('ATAU Verify').getValue('PhoneNumber', 4))

WebUI.setText(findTestObject('ATAU/details page/input_Alternate Mobile Number'), findTestData('ATAU Verify').getValue('AltPhoneNumber', 4))

WebUI.setText(findTestObject('ATAU/details page/textfield_Email Address'), findTestData('ATAU Verify').getValue('Email', 1))

WebUI.setText(findTestObject('ATAU/details page/input_Name'), findTestData('ATAU Verify').getValue('Name', 4))

WebUI.click(findTestObject('ATAU/details page/tick_TC'))

WebUI.delay(10)

WebUI.click(findTestObject('ATAU/details page/button_Send to Etiqa'))

WebUI.delay(5)

WebUI.click(findTestObject('ATAU/confirmation page/button_Yes, lets proceed'))

WebUI.delay(3)

WebUI.click(findTestObject('ATAU/submission page/expand_Your Request Details'))

WebUI.verifyElementText(findTestObject('ATAU/your request details/label_Request date time'), 'Request date & time')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/div_04092023, 1054 AM'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/label_Type of service'), 'Type of service')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/div_Im having a brake issue'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/label_Location'), 'Location')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/location_address'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/label_Destination'), 'Destination')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/destination_address'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/label_Vehicle registration number'), 'Vehicle registration number')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/plat_number'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/label_Mobile number'), 'Mobile number')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/no_phone'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/label_Alternate mobile number'), 'Alternate mobile number')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/no_altphone'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/label_Email address'), 'Email address')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/div_ab.c'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/label_Name'), 'Name')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/nama'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/button_Cancel my request'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/button_Cancel my request'), 'Cancel my request')

WebUI.delay(2)

WebUI.closeBrowser()

