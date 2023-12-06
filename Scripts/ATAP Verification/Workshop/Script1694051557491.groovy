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

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/List of Workshop'), 'List of Workshop')

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/No'), 'No.')

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Workshop_1'), 'Workshop')

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Category_1'), 'Category')

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Status_1'), 'Status')

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Address_1'), 'Address')

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Action'), 'Action')

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Add New Workshop'), 'Add New Workshop')

WebUI.click(findTestObject('ATAP EH/Workshop/Add New Workshop'))

WebUI.delay(2)

for (def row = 1; row <= 1; row++) {
    WebUI.setText(findTestObject('ATAP EH/Workshop/fill/name'), findTestData('ATAP New Case').getValue('nameWorkshop', row))

    WebUI.setText(findTestObject('ATAP EH/Workshop/fill/phone_number'), findTestData('ATAP New Case').getValue('contactNumber', 
            row))

    WebUI.setText(findTestObject('ATAP EH/Workshop/fill/fax'), findTestData('ATAP New Case').getValue('Fax', row))

    WebUI.setText(findTestObject('ATAP EH/Workshop/fill/email'), findTestData('ATAP New Case').getValue('Email', row))

    WebUI.setText(findTestObject('ATAP EH/Workshop/fill/address_1'), findTestData('ATAP New Case').getValue('Address1', 
            row))

    WebUI.setText(findTestObject('ATAP EH/Workshop/fill/address_2'), findTestData('ATAP New Case').getValue('Address2', 
            row))

    WebUI.setText(findTestObject('ATAP EH/Workshop/fill/postcode'), findTestData('ATAP New Case').getValue('Postcode', row))

    WebUI.setText(findTestObject('ATAP EH/Workshop/fill/city'), findTestData('ATAP New Case').getValue('City', row))

    WebUI.setText(findTestObject('ATAP EH/Workshop/fill/state'), findTestData('ATAP New Case').getValue('State', row))
}

WebUI.click(findTestObject('ATAP EH/Workshop/select_status'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Active'), 'Active')

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Inactive'), 'Inactive')

WebUI.click(findTestObject('ATAP EH/Workshop/Active'))

WebUI.click(findTestObject('ATAP EH/Workshop/dropdownCategory'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Premier'), 'Premier')

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Normal'), 'Normal')

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Motorcycle'), 'Motorcycle')

WebUI.click(findTestObject('ATAP EH/Workshop/Premier'))

WebUI.verifyElementText(findTestObject('ATAP EH/Workshop/Submit'), 'Submit')

WebUI.click(findTestObject('ATAP EH/Workshop/Submit'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ATAP EH/Workshop/search_workshop'), 0)

WebUI.setText(findTestObject('ATAP EH/Workshop/search_workshop'), 'Empayar Bengkel')

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Logout'), [:], FailureHandling.STOP_ON_FAILURE)

