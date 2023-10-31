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

//for (def row = 2; row <= findTestData('URL').getRowNumbers(); row++) {
WebUI.navigateToUrl(findTestData('URL').getValue('ATAU', 1))

WebUI.delay(2)

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

WebUI.setText(findTestObject('ATAU/preferred destination/input_destination'), findTestData('ATAU Verify').getValue('Destination', 
        1))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ATAU/preferred destination/input_destination'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('ATAU/preferred destination/btn_Next_selectdestination'))

WebUI.setText(findTestObject('ATAU/details page/input_Vehicle Registration Number'), findTestData('ATAU Verify').getValue(
        'VehicleNumber', 1))

WebUI.setText(findTestObject('ATAU/details page/input_Mobile Number'), findTestData('ATAU Verify').getValue('PhoneNumber', 
        1))

WebUI.setText(findTestObject('ATAU/details page/input_Alternate Mobile Number'), findTestData('ATAU Verify').getValue('AltPhoneNumber', 
        1))

WebUI.setText(findTestObject('ATAU/details page/textfield_Email Address'), findTestData('ATAU Verify').getValue('Email', 
        1))

WebUI.setText(findTestObject('ATAU/details page/input_Name'), findTestData('ATAU Verify').getValue('Name', 1))

WebUI.click(findTestObject('ATAU/details page/tick_TC'))

WebUI.delay(10)

WebUI.click(findTestObject('ATAU/details page/button_Send to Etiqa'))

WebUI.click(findTestObject('ATAU/confirmation page/button_Yes, lets proceed'))

WebUI.delay(5)

WebUI.click(findTestObject('ATAU/submission page/expand_Your Request Details'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/your request details/button_Cancel my request'))

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/title_Help us understand'), 'Help us understand the reason')

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/small_(Note Your request to cancel cannot be undone)'), 
    '(Note: Your request to cancel cannot be undone)')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/kotak_choice'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/choice1_I waited too long'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/choice1_I waited too long'), 'I waited too long')

WebUI.click(findTestObject('ATAU/your request details/cancel request/choice1_I waited too long'))

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/choice2_I found another alternative'), 
    0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/choice2_I found another alternative'), 
    'I found another alternative')

WebUI.click(findTestObject('ATAU/your request details/cancel request/choice2_I found another alternative'))

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/choice3_My vehicle is working fine now'), 
    0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/choice3_My vehicle is working fine now'), 
    'My vehicle is working fine now')

WebUI.click(findTestObject('ATAU/your request details/cancel request/choice3_My vehicle is working fine now'))

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/choice4_I disagree with the service charge'), 
    0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/choice4_I disagree with the service charge'), 
    'I disagree with the service charge')

WebUI.click(findTestObject('ATAU/your request details/cancel request/choice4_I disagree with the service charge'))

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/choice5_Others'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/choice5_Others'), 'Others')

WebUI.click(findTestObject('ATAU/your request details/cancel request/choice5_Others'))

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/button_Cancel my request'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/button_Cancel my request'), 'Cancel my request')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/link_Keep my request'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/link_Keep my request'), 'Keep my request')

WebUI.click(findTestObject('ATAU/your request details/cancel request/link_Keep my request'))

WebUI.click(findTestObject('ATAU/your request details/button_Cancel my request'))

WebUI.click(findTestObject('ATAU/your request details/cancel request/choice5_Others'))

WebUI.click(findTestObject('ATAU/your request details/cancel request/button_Cancel my request'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/after cancel/img_sad'), 0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/after cancel/title_Your request cancelled'), 
    'Your request has been cancelled')

//removed on release 3.11 WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/after cancel/text_Service you requested cancelled'), 'Service you requested has been cancelled.')
WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/after cancel/text_Accidentally cancelled'), 
    'Accidentally cancelled this request?')

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/after cancel/text_Please call hotline for assistance'), 
    'Please call our hotline 1-800-88-6491 (Malaysia) or +603-2296 8600 (Singapore, Thailand & Brunei) for assistance.')

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/after cancel/Malaysia_1-800-88-6491'), 
    0)

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/after cancel/SgThaiBrunei_603-2296 8600'), 
    0)

WebUI.verifyElementPresent(findTestObject('ATAU/your request details/cancel request/after cancel/btn_Submit request now'), 
    0)

WebUI.verifyElementText(findTestObject('ATAU/your request details/cancel request/after cancel/btn_Submit request now'), 
    'Submit request now')

WebUI.delay(3)

WebUI.click(findTestObject('ATAU/your request details/cancel request/after cancel/btn_Submit request now'))

WebUI.delay(1)

WebUI.closeBrowser()

