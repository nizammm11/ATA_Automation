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

WebUI.verifyElementText(findTestObject('ATAU/main page/text_Motorcycle'), 'Motorcycle')

WebUI.verifyElementText(findTestObject('ATAU/main page/text_NEW'), 'NEW')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/btn_Motorcycle'), 0)

WebUI.click(findTestObject('ATAU/main page/btn_Motorcycle'))

WebUI.verifyElementText(findTestObject('ATAU/service issue page/text_What seems to be the issue'), 'What seems to be the issue?')

WebUI.verifyElementPresent(findTestObject('ATAU/service issue page/num_1'), 0)

WebUI.verifyElementText(findTestObject('ATAU/service issue page/text_Service Type'), 'Service Type')

WebUI.verifyElementPresent(findTestObject('ATAU/service issue page/num_2'), 0)

WebUI.verifyElementText(findTestObject('ATAU/service issue page/text_Details'), 'Details')

WebUI.verifyElementPresent(findTestObject('ATAU/service issue page/num_3'), 0)

WebUI.verifyElementText(findTestObject('ATAU/service issue page/text_Confirmation'), 'Confirmation')

WebUI.verifyElementText(findTestObject('ATAU/Motor service list/btn_motor_accident'), 'I had an accident')

WebUI.verifyElementPresent(findTestObject('ATAU/Motor service list/btn_motor_accident'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Motor service list/btn_motor_petrol'), 'I ran out of petrol')

WebUI.verifyElementPresent(findTestObject('ATAU/Motor service list/btn_motor_petrol'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Motor service list/btn_motor_tyre'), 'I have a flat tyre')

WebUI.verifyElementPresent(findTestObject('ATAU/Motor service list/btn_motor_tyre'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Motor service list/btn_motor_cannot_start'), 'I cannot start my motorcycle')

WebUI.verifyElementPresent(findTestObject('ATAU/Motor service list/btn_motor_cannot_start'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Motor service list/btn_motor_brake'), 'I\'m having brake issue')

WebUI.verifyElementPresent(findTestObject('ATAU/Motor service list/btn_motor_brake'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Motor service list/btn_motor_gear'), 'I have problems changing gear')

WebUI.verifyElementPresent(findTestObject('ATAU/Motor service list/btn_motor_gear'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Motor service list/btn_motor_Im not sure whats wrong'), 'I\'m not sure what\'s wrong')

WebUI.verifyElementPresent(findTestObject('ATAU/Motor service list/btn_motor_Im not sure whats wrong'), 0)

WebUI.closeBrowser()

