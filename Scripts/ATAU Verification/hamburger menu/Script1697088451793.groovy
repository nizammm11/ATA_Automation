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

//__________________SCREENSHOT_________________________
Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('URL').getValue('ATAU', 1))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/button_Got It'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/main page/btn_Car'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/Car service list/btn_flat tyre'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/main page/main land/button_hamburger'))

WebUI.click(findTestObject('ATAU/main page/main land/a_Home'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/main page/btn_Car'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/Car service list/btn_brake'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/Questions/btn_No_1'))

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_2'))

WebUI.click(findTestObject('ATAU/Questions/btn_No_3'))

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_4'))

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_5'))

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_6'))

WebUI.click(findTestObject('ATAU/Questions/button_Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/preferred destination/preferred_Destination'))

WebUI.click(findTestObject('ATAU/preferred destination/btn_Next_destination'))

WebUI.setText(findTestObject('ATAU/preferred destination/input_destination'), findTestData('ATAU Verify').getValue('Destination', 
        1))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ATAU/preferred destination/input_destination'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('ATAU/preferred destination/btn_Next_selectdestination'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/details page/btn_Back'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/preferred destination/btn_Back_destination'))

WebUI.delay(2)

WebUI.closeBrowser()

