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

num = 1

row = 1

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Login'), [:], FailureHandling.STOP_ON_FAILURE)

/*WebUI.openBrowser('')

WebUI.maximizeWindow()

//WebUI.navigateToUrl('https://canary.autoassistcare.etiqa.com.my/dashboard/login')
//WebUI.navigateToUrl(findTestData('URL').getValue('ATAP', num))
WebUI.navigateToUrl(GlobalVariable.SIT_ATAU)

WebUI.delay(10)*/
WebUI.click(findTestObject('ATAP/Create New Case/btn_Create New Case'))

//==============================||CUSTOMER DETAIL||==============================
WebUI.setText(findTestObject('ATAP/Create New Case/input_phone number'), findTestData('ATAP New Case').getValue('contactNumber', 
        row))

WebUI.setText(findTestObject('ATAP/Create New Case/input_second phone number'), findTestData('ATAP New Case').getValue('secondContactNumber', 
        row))

WebUI.setText(findTestObject('ATAP/Create New Case/input_third phone number'), findTestData('ATAP New Case').getValue('thirdContactNumber', 
        row))

WebUI.setText(findTestObject('ATAP/Create New Case/input_vehicle number'), findTestData('ATAP New Case').getValue('vehicleNumber', 
        row))

WebUI.setText(findTestObject('ATAP/Create New Case/input_name'), findTestData('ATAP New Case').getValue('Name', row))

WebUI.click(findTestObject('ATAP/Create New Case/span_vehicle type'))

if (findTestData('ATAP New Case').getValue('vehicleType', row) == 'Car') {
    WebUI.click(findTestObject('ATAP/Page_Dashboard/li_Car'))
} else {
    WebUI.click(findTestObject('ATAP/Page_Dashboard/li_Motorcycle'))
}

WebUI.click(findTestObject('ATAP/Create New Case/span_vehicle make'))

WebUI.setText(findTestObject('ATAP/Page_Dashboard/Page_Dashboard/input_vehicle make'), findTestData('ATAP New Case').getValue(
        'vehicleMake', row))

WebUI.sendKeys(findTestObject('ATAP/Page_Dashboard/Page_Dashboard/input_vehicle make'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('ATAP/Create New Case/span_vehicle model'))

WebUI.setText(findTestObject('ATAP/Page_Dashboard/Page_Dashboard/input_vehicle model'), findTestData('ATAP New Case').getValue(
        'vehicleModel', row))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ATAP/Page_Dashboard/Page_Dashboard/input_vehicle model'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

//==============================||ENTITY||==============================
if (findTestData('ATAP New Case').getValue('Entity', row) == 'EGTB') {
    WebUI.click(findTestObject('ATAP/Create New Case/entity_Etiqa General Takaful Berhad'))
} else if (findTestData('ATAP New Case').getValue('Entity', row) == 'EGIB') {
    WebUI.click(findTestObject('ATAP/Create New Case/entity_Etiqa General Insurance Berhad'))
} else {
    WebUI.click(findTestObject('ATAP/Create New Case/entity_Non-Etiqa'))
}

WebUI.scrollToElement(findTestObject('ATAP/Create New Case/entity_Etiqa General Takaful Berhad'), 0)

//==============================||POLICY BENEFITS||==============================
if (findTestData('ATAP New Case').getValue('policyBenefits', row) == '50KM') {
    WebUI.click(findTestObject('ATAP/Create New Case/policyBenefits_50KM'))
} else if (findTestData('ATAP New Case').getValue('policyBenefits', row) == '200KM') {
    WebUI.click(findTestObject('ATAP/Create New Case/policyBenefits_200KM'))
} else if (findTestData('ATAP New Case').getValue('policyBenefits', row) == '300KM') {
    WebUI.click(findTestObject('ATAP/Create New Case/policyBenefits_300KM'))
} else if (findTestData('ATAP New Case').getValue('policyBenefits', row) == '175KM Per Trip') {
    WebUI.click(findTestObject('ATAP/Create New Case/policyBenefits_175KM Per Trip'))
} else if (findTestData('ATAP New Case').getValue('policyBenefits', row) == 'Unlimited') {
    WebUI.click(findTestObject('ATAP/Create New Case/policyBenefits_Unlimited'))
} else if (findTestData('ATAP New Case').getValue('policyBenefits', row) == 'Franchise') {
    WebUI.click(findTestObject('ATAP/Create New Case/policyBenefits_Franchise'))
} else {
    WebUI.click(findTestObject('ATAP/Create New Case/policyBenefits_Cash Job'))
}

WebUI.setText(findTestObject('ATAP/Create New Case/input_Email'), findTestData('ATAP New Case').getValue('Email', row))

WebUI.click(findTestObject('ATAP/Page_Dashboard/span_Please select'))

WebUI.delay(2)

//==============================||SERVICE DETAILS||==============================
WebUI.setText(findTestObject('ATAP/Create New Case/input_service type'), findTestData('ATAP New Case').getValue('serviceType', 
        row))

WebUI.sendKeys(findTestObject('ATAP/Create New Case/input_service type'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

//==============================||SUB-SERVICE||==============================
if (findTestData('ATAP New Case').getValue('subService', row) == 'Transmission Issue') {
    WebUI.click(findTestObject('ATAP/Create New Case/subServiceBT_Transmission Issue'))
} else if (findTestData('ATAP New Case').getValue('subService', row) == 'Electrical Issue') {
    WebUI.click(findTestObject('ATAP/Create New Case/subServiceBT_Electrical Issue'))
} else if (findTestData('ATAP New Case').getValue('subService', row) == 'Brakes Problem') {
    WebUI.click(findTestObject('ATAP/Create New Case/subServiceBT_Brakes Problem'))
} else {
    WebUI.click(findTestObject('ATAP/Create New Case/subServiceBT_Overheating'))
}

//=========================||CAR CONDITION CHECKLISTS||=========================
if (findTestData('ATAP New Case').getValue('Q1', row) == 'Yes') {
    WebUI.click(findTestObject('ATAP/Create New Case/Q1_Yes'))
} else {
    WebUI.click(findTestObject('ATAP/Create New Case/Q1_No'))
}

if (findTestData('ATAP New Case').getValue('Q2', row) == 'Yes') {
    WebUI.click(findTestObject('ATAP/Create New Case/Q2_Yes'))
} else {
    WebUI.click(findTestObject('ATAP/Create New Case/Q2_No'))
}

if (findTestData('ATAP New Case').getValue('Q3', row) == 'Yes') {
    WebUI.click(findTestObject('ATAP/Create New Case/Q3_Yes'))
} else {
    WebUI.click(findTestObject('ATAP/Create New Case/Q3_No'))
}

if (findTestData('ATAP New Case').getValue('Q4', row) == 'Yes') {
    WebUI.click(findTestObject('ATAP/Create New Case/Q4_Yes'))
} else {
    WebUI.click(findTestObject('ATAP/Create New Case/Q4_No'))
}

if (findTestData('ATAP New Case').getValue('Q5', row) == 'Yes') {
    WebUI.click(findTestObject('ATAP/Create New Case/Q5_Yes'))
} else {
    WebUI.click(findTestObject('ATAP/Create New Case/Q5_No'))
}

if (findTestData('ATAP New Case').getValue('Q6', row) == 'Yes') {
    WebUI.click(findTestObject('ATAP/Create New Case/Q6_Yes'))
} else {
    WebUI.click(findTestObject('ATAP/Create New Case/Q6_No'))
}

//=========================||LOCATION DETAILS||=========================
WebUI.setText(findTestObject('ATAP/Create New Case/input_customer location'), findTestData('ATAP New Case').getValue('customerLocation', 
        row))

WebUI.sendKeys(findTestObject('ATAP/Create New Case/input_customer location'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

//=========================||PROVIDER||=========================
WebUI.click(findTestObject('ATAP/Create New Case/button_Search coverage area'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('ATAP/Create New Case/span_Provider list'), findTestData('ATAP New Case').getValue('providerList', 
        row))

WebUI.sendKeys(findTestObject('ATAP/Create New Case/span_Provider list'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

//=========================||DESTINATION||=========================
WebUI.setText(findTestObject('ATAP/Create New Case/workshop_State'), findTestData('ATAP New Case').getValue('State', row))

WebUI.sendKeys(findTestObject('ATAP/Create New Case/workshop_State'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('ATAP/Create New Case/workshop_City'), findTestData('ATAP New Case').getValue('City', row))

WebUI.sendKeys(findTestObject('ATAP/Create New Case/workshop_City'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('ATAP/Create New Case/Select workshop'), findTestData('ATAP New Case').getValue('Workshop', 
        row))

WebUI.sendKeys(findTestObject('ATAP/Create New Case/Select workshop'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

