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

WebUI.callTestCase(findTestCase('ATA_Partner/Partner - Login'), [('phoneNumber') : '122614910'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ATA_Partner/Add Photo/Resolved'), 'Resolved')

WebUI.click(findTestObject('ATA_Partner/Add Photo/Resolved'))

WebUI.delay(2)

WebUI.click(findTestObject('ATA_Partner/Add Photo/policy_button (3)'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Add Photo/Add Photos'), 'Add Photos')

WebUI.click(findTestObject('ATA_Partner/Add Photo/Add Photos'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Add Photo/Photos by DSP'), 'Photos by DSP')

WebUI.click(findTestObject('ATA_Partner/Add Photo/Photos by DSP'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Add Photo/button_Add photo'), 'Add photo')

WebUI.click(findTestObject('ATA_Partner/Add Photo/button_Add photo'))

WebUI.delay(0)

