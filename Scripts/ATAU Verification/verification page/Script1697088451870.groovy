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

WebUI.sendKeys(findTestObject('ATAU/preferred destination/input_destination'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('ATAU/preferred destination/btn_Next_selectdestination'))

WebUI.setText(findTestObject('ATAU/details page/input_Vehicle Registration Number'), findTestData('ATAU Verify').getValue('VehicleNumber', 6))

WebUI.setText(findTestObject('ATAU/details page/input_Mobile Number'), findTestData('ATAU Verify').getValue('PhoneNumber', 6))

WebUI.setText(findTestObject('ATAU/details page/input_Alternate Mobile Number'), findTestData('ATAU Verify').getValue('AltPhoneNumber', 6))

WebUI.setText(findTestObject('ATAU/details page/textfield_Email Address'), findTestData('ATAU Verify').getValue('Email', 1))

WebUI.setText(findTestObject('ATAU/details page/input_Name'), findTestData('ATAU Verify').getValue('Name', 6))

WebUI.click(findTestObject('ATAU/details page/tick_TC'))

WebUI.delay(10)

WebUI.click(findTestObject('ATAU/details page/button_Send to Etiqa'))

WebUI.click(findTestObject('ATAU/confirmation page/button_Yes, lets proceed'))

WebUI.delay(5)

WebUI.click(findTestObject('ATAU/submission page/btn_I want to track my status'))

WebUI.verifyElementText(findTestObject('ATAU/verification page/title_Track request'), 'Track your request')

WebUI.verifyElementText(findTestObject('ATAU/verification page/text_To proceed, key in vehicle number'), 'To proceed, key in your vehicle number below')

WebUI.verifyElementPresent(findTestObject('ATAU/verification page/input1_Track your request'), 0)

WebUI.verifyElementText(findTestObject('ATAU/verification page/small_Enter vehicle number without empty space'), 'Enter your vehicle number without empty space.')

WebUI.verifyElementText(findTestObject('ATAU/verification page/text_Tracking number'), 'Tracking number')

WebUI.verifyElementPresent(findTestObject('ATAU/verification page/input2_tracking number'), 0)

WebUI.verifyElementText(findTestObject('ATAU/verification page/small_You get 9 digit number from SMS'), 'You can get the 9-digit tracking number from your SMS')

WebUI.verifyElementPresent(findTestObject('ATAU/verification page/button_Track Now'), 0)

WebUI.verifyElementText(findTestObject('ATAU/verification page/button_Track Now'), 'Track Now')

WebUI.delay(2)

WebUI.closeBrowser()

