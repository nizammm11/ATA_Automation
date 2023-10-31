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

WebUI.click(findTestObject('ATAU/Car service list/btn_flat tyre'))

WebUI.verifyElementText(findTestObject('ATAU/details page/text_Complete the details below'), 'We\'re almost done! Complete the details below')

WebUI.verifyElementText(findTestObject('ATAU/details page/label_Type services'), 'Type of services *')

WebUI.verifyElementPresent(findTestObject('ATAU/details page/textbox_Type of service'), 0)

WebUI.verifyElementText(findTestObject('ATAU/details page/label_Location'), 'Location *')

WebUI.verifyElementPresent(findTestObject('ATAU/details page/textbox_Location'), 0)

WebUI.verifyElementText(findTestObject('ATAU/details page/label_Vehicle Number'), 'Vehicle Registration Number *')

WebUI.verifyElementPresent(findTestObject('ATAU/details page/input_Vehicle Registration Number'), 0)

WebUI.setText(findTestObject('ATAU/details page/input_Vehicle Registration Number'), findTestData('ATAU Verify').getValue('VehicleNumber', 3))

WebUI.verifyElementText(findTestObject('ATAU/details page/note_Enter your vehicle number without empty space'), 'Enter your vehicle number without empty space.')

WebUI.verifyElementText(findTestObject('ATAU/details page/label_Mobile Number'), 'Mobile Number *')

WebUI.verifyElementPresent(findTestObject('ATAU/details page/dropdown_Mobile Number'), 0)

//WebUI.click(findTestObject('null'))
//WebUI.verifyElementText(findTestObject('null'), '+65')
WebUI.verifyElementPresent(findTestObject('ATAU/details page/input_Mobile Number'), 0)

WebUI.setText(findTestObject('ATAU/details page/input_Mobile Number'), findTestData('ATAU Verify').getValue('PhoneNumber', 3))

WebUI.verifyElementText(findTestObject('ATAU/details page/label_Alternate Mobile Number'), 'Alternate Mobile Number')

WebUI.verifyElementPresent(findTestObject('ATAU/details page/input_Alternate Mobile Number'), 0)

WebUI.setText(findTestObject('ATAU/details page/input_Alternate Mobile Number'), findTestData('ATAU Verify').getValue('AltPhoneNumber', 3))

WebUI.verifyElementText(findTestObject('ATAU/details page/label_Email Address'), 'Email Address')

WebUI.verifyElementPresent(findTestObject('ATAU/details page/textfield_Email Address'), 0)

WebUI.setText(findTestObject('ATAU/details page/textfield_Email Address'), findTestData('ATAU Verify').getValue('Email', 1))

WebUI.verifyElementText(findTestObject('ATAU/details page/label_Name'), 'Name *')

WebUI.verifyElementPresent(findTestObject('ATAU/details page/input_Name'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/details page/tick_TC'), 0)

WebUI.verifyElementText(findTestObject('ATAU/details page/text_I agree with the TNC Privacy Policy'), 'I agree with the Terms & Conditions and Privacy Policy')

WebUI.verifyElementPresent(findTestObject('ATAU/details page/button_Send to Etiqa'), 0)

WebUI.closeBrowser()

