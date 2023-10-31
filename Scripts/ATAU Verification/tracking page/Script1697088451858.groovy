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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

WebUI.setText(findTestObject('ATAU/preferred destination/input_destination'), 'bengkel')

WebUI.sendKeys(findTestObject('ATAU/preferred destination/input_destination'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('ATAU/preferred destination/btn_Next_selectdestination'))

WebUI.setText(findTestObject('ATAU/details page/input_Vehicle Registration Number'), 'ATAD96')

WebUI.setText(findTestObject('ATAU/details page/input_Mobile Number'), '160935836')

WebUI.setText(findTestObject('ATAU/details page/input_Alternate Mobile Number'), '172661884')

WebUI.setText(findTestObject('ATAU/details page/textfield_Email Address'), 'atau@etiqa.com.my')

WebUI.setText(findTestObject('ATAU/details page/input_Name'), 'zarith')

WebUI.click(findTestObject('ATAU/details page/tick_TC'))

WebUI.delay(10)

WebUI.click(findTestObject('ATAU/details page/button_Send to Etiqa'))

WebUI.click(findTestObject('ATAU/confirmation page/button_Yes, lets proceed'))

WebUI.delay(5)

WebUI.click(findTestObject('ATAU/submission page/btn_I want to track my status'))

WebUI.setText(findTestObject('ATAU/verification page/input1_Track your request'), 'ATAD96')

WebUI.delay(30)

WebUI.click(findTestObject('ATAU/tracking page/button_Track Now2'))

WebUI.verifyElementPresent(findTestObject('ATAU/tracking page/img_lottie1'), 0)

WebUI.verifyElementText(findTestObject('ATAU/tracking page/title_Were looking someone assist you'), 'We’re looking for someone to assist you!')

WebUI.verifyElementText(findTestObject('ATAU/tracking page/subtitle_Please give us a moment'), 'Please give us a moment.')

WebUI.verifyElementPresent(findTestObject('ATAU/tracking page/bar_Your Request Details'), 0)

WebUI.verifyElementText(findTestObject('ATAU/tracking page/bar_Your Request Details'), 'Your Request Details')

WebUI.delay(280)

WebUI.verifyElementPresent(findTestObject('ATAU/tracking page/img_lottie2'), 0)

WebUI.verifyElementText(findTestObject('ATAU/tracking page/title_We need a bit more time'), 'We need a bit more time to locate the nearest service provider to you.')

WebUI.verifyElementText(findTestObject('ATAU/tracking page/subtitle_Thank you for your patience'), 'Thank you for your patience!')

WebUI.delay(305)

WebUI.verifyElementPresent(findTestObject('ATAU/tracking page/img_lottie3'), 0)

WebUI.verifyElementText(findTestObject('ATAU/tracking page/title_There high volume of requests'), 'There is currently a high volume of requests.')

WebUI.verifyElementText(findTestObject('ATAU/tracking page/subtitle_Thank you for waiting. Our consultant will assist ASAP'), 
    'Thank you for waiting. Our consultant will assist you as soon as possible.')

WebUI.delay(2)

WebUI.closeBrowser()

