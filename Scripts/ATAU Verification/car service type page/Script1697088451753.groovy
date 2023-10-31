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

//findTestData('ATAUcarBT').getRowNumbers()
WebUI.navigateToUrl(findTestData('URL').getValue('ATAU', 1))

WebUI.click(findTestObject('Object Repository/ATAU/button_Got It'))

WebUI.verifyElementText(findTestObject('ATAU/main page/btn_Car'), 'Car')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/btn_Car'), 0)

WebUI.click(findTestObject('ATAU/main page/btn_Car'))

WebUI.verifyElementText(findTestObject('ATAU/Car service list/btn_accident'), 'I had an accident')

WebUI.verifyElementPresent(findTestObject('ATAU/Car service list/btn_accident'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Car service list/btn_cannot start'), 'I cannot start my vehicle')

WebUI.verifyElementPresent(findTestObject('ATAU/Car service list/btn_cannot start'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Car service list/btn_flat tyre'), 'I have a flat tyre')

WebUI.verifyElementPresent(findTestObject('ATAU/Car service list/btn_flat tyre'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Car service list/btn_brake'), 'I\'m having a brake issue')

WebUI.verifyElementPresent(findTestObject('ATAU/Car service list/btn_brake'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Car service list/btn_petrol'), 'I ran out of petrol')

WebUI.verifyElementPresent(findTestObject('ATAU/Car service list/btn_petrol'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Car service list/btn_Smoke'), 'Smoke is coming out from my engine')

WebUI.verifyElementPresent(findTestObject('ATAU/Car service list/btn_Smoke'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Car service list/btn_locked'), 'I\'m locked out of my vehicle')

WebUI.verifyElementPresent(findTestObject('ATAU/Car service list/btn_locked'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Car service list/btn_gear'), 'I have problems changing gear')

WebUI.verifyElementPresent(findTestObject('ATAU/Car service list/btn_gear'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Car service list/btn_Im not sure whats wrong'), 'I\'m not sure what\'s wrong')

WebUI.verifyElementPresent(findTestObject('ATAU/Car service list/btn_Im not sure whats wrong'), 0)

WebUI.closeBrowser()

