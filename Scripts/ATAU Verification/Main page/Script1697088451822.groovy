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

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\Main_page\\1. Main Page_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAU/button_Got It'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\Main_page\\2. Main Page_' + dateTime) + '.png')

WebUI.verifyElementText(findTestObject('ATAU/main page/text_Get 247 services SMILE app'), 'Get 24/7 auto assist services with Etiqa SMILE app')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/link_DOWNLOAD'), 0)

WebUI.verifyElementText(findTestObject('ATAU/main page/link_DOWNLOAD'), 'DOWNLOAD')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/logo_Smile'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/main page/button_closeX'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/main page/EAAC logo'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/main page/button_hamburger'), 0)

WebUI.verifyElementText(findTestObject('ATAU/main page/EAAC_word'), 'Etiqa Auto Assist Care')

WebUI.verifyElementText(findTestObject('ATAU/main page/We are here_word'), 'We are here to help you.')

WebUI.verifyElementText(findTestObject('ATAU/main page/Where are you_word'), 'Where are you now?')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/Where Are You Now'), 0)

WebUI.click(findTestObject('ATAU/main page/Where Are You Now'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\Main_page\\3. Main Page_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAU/button_Got It'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\Main_page\\4. Main Page_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAU/location page/Back to main'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/main page/merah_Not right location_word'), 'Not the right location? Tap to change')

WebUI.verifyElementText(findTestObject('ATAU/main page/main land/word_vehicle type'), 'Select your vehicle type')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/main land/icon_car'), 0)

WebUI.verifyElementText(findTestObject('ATAU/main page/main land/word_Car'), 'Car')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/btn_Car'), 0)

WebUI.click(findTestObject('ATAU/main page/btn_Car'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\Main_page\\5. Main Page_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAU/Car service list/btn_Back'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ATAU/main page/main land/icon_motor'), 0)

WebUI.verifyElementText(findTestObject('ATAU/main page/main land/word_Motorcycle'), 'Motorcycle')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/btn_Motorcycle'), 0)

WebUI.click(findTestObject('ATAU/main page/btn_Motorcycle'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\Main_page\\6. Main Page_' + dateTime) + '.png')

WebUI.click(findTestObject('ATAU/Car service list/btn_Back'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/main page/main land/word_Quick links'), 'Quick links')

WebUI.verifyElementText(findTestObject('ATAU/main page/main land/word_Status Tracking'), 'Status Tracking')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/main land/icon_tracking'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/main page/main land/btn_Tracking'), 0)

WebUI.verifyElementText(findTestObject('ATAU/main page/main land/word_Share feedback'), 'Share feedback')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/main land/icon_feedback'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/main page/main land/btn_feedback'), 0)

WebUI.verifyElementText(findTestObject('ATAU/main page/main land/word_Locate our panel'), 'Locate our panel')

WebUI.verifyElementText(findTestObject('ATAU/main page/main land/word_Looking for workshop Explore'), 'Looking for a workshop? Explore here')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/btn_workshop Explore'), 0)

WebUI.verifyElementText(findTestObject('ATAU/main page/main land/Version'), 'Version 3.12.0')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

