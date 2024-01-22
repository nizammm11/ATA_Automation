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

row = 1

Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Login'), [('Username') : '80007700', ('Password') : 'DragFu11/'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

/*WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://canary.autoassistcare.etiqa.com.my/dashboard/login')

WebUI.click(findTestObject('ATAP EH/Login/button_OK'))

WebUI.setText(findTestObject('ATAP EH/Login/Username'), '80008097')

WebUI.setText(findTestObject('ATAP EH/Login/Password'), 'H@z1q1234%')

WebUI.click(findTestObject('ATAP EH/Login/button_LOGIN'))*/
WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Workshops'), 'Workshops')

WebUI.click(findTestObject('ATAP EH/Workshop/Workshops'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ATAP EH/Workshop/filterWorkshop/Status_dropdown'), 0)

WebUI.click(findTestObject('ATAP EH/Workshop/filterWorkshop/Status_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ATAP EH/Workshop/filterWorkshop/Page_Dashboard/status_Active'))

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Logout'), [:], FailureHandling.STOP_ON_FAILURE)

