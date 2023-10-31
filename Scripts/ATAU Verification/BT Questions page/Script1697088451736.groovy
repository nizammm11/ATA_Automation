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

WebUI.click(findTestObject('ATAU/main page/btn_Car'))

WebUI.click(findTestObject('ATAU/Car service list/btn_brake'))

WebUI.verifyElementText(findTestObject('ATAU/Questions/title_having_brake_issue'), 'I\'m having a brake issue')

WebUI.verifyElementText(findTestObject('ATAU/Questions/question1'), 'Can you release your handbrake? *')

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_Yes_1'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_Yes_1'), 'Yes')

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_1'))

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_No_1'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_No_1'), 'No')

WebUI.click(findTestObject('ATAU/Questions/btn_No_1'))

WebUI.verifyElementText(findTestObject('ATAU/Questions/question2'), 'Can you shift your gear? *')

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_Yes_2'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_Yes_2'), 'Yes')

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_2'))

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_No_2'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_No_2'), 'No')

WebUI.click(findTestObject('ATAU/Questions/btn_No_2'))

WebUI.verifyElementText(findTestObject('ATAU/Questions/question3'), 'Is your steering wheel locked? *')

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_Yes_3'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_Yes_3'), 'Yes')

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_3'))

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_No_3'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_No_3'), 'No')

WebUI.click(findTestObject('ATAU/Questions/btn_No_3'))

WebUI.verifyElementText(findTestObject('ATAU/Questions/question4'), 'Has your vehicle been modified to be lower? *')

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_Yes_4'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_Yes_4'), 'Yes')

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_4'))

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_No_4'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_No_4'), 'No')

WebUI.click(findTestObject('ATAU/Questions/btn_No_4'))

WebUI.verifyElementText(findTestObject('ATAU/Questions/question5'), 'Is your vehicle in a basement / multi-level car park? *')

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_Yes_5'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_Yes_5'), 'Yes')

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_5'))

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_No_5'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_No_5'), 'No')

WebUI.click(findTestObject('ATAU/Questions/btn_No_5'))

WebUI.verifyElementText(findTestObject('ATAU/Questions/question6'), 'Is your vehicle at an open space? *')

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_Yes_6'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_Yes_6'), 'Yes')

WebUI.click(findTestObject('ATAU/Questions/btn_Yes_6'))

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/btn_No_6'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/btn_No_6'), 'No')

WebUI.click(findTestObject('ATAU/Questions/btn_No_6'))

WebUI.verifyElementPresent(findTestObject('ATAU/Questions/button_Continue'), 0)

WebUI.verifyElementText(findTestObject('ATAU/Questions/button_Continue'), 'Continue')

WebUI.click(findTestObject('ATAU/Questions/btn_closeX'))

WebUI.click(findTestObject('ATAU/Car service list/btn_Smoke'))

WebUI.verifyElementText(findTestObject('ATAU/Questions/title_Smoke'), 'Smoke is coming out from my engine')

WebUI.click(findTestObject('ATAU/Questions/btn_closeX'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/Car service list/btn_gear'))

WebUI.verifyElementText(findTestObject('ATAU/Questions/title_gear'), 'I have problems changing gear')

WebUI.click(findTestObject('ATAU/Questions/btn_closeX'))

WebUI.closeBrowser()

