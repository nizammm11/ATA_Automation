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

Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Login'), [('Username') : '80007700', ('Password') : 'DragCk23/'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ATAP Verification/TC74 Inbox'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ATAP Verification/Workshop'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ATAP Verification/Franchise'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ATAP Verification/Tariff'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ATAP Verification/Knowledge'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ATAP Verification/Audit Trail'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ATAP Verification/Insights'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ATAP Verification/Claims'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.scrollToElement(findTestObject('ATAP HH/Module/Module_Ratings'), 0)

WebUI.callTestCase(findTestCase('ATAP Verification/Ratings'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Logout'), [:], FailureHandling.STOP_ON_FAILURE)

