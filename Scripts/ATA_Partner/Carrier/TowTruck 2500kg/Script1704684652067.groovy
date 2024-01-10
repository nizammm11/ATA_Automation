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

/*Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://canary.autoassistcare.etiqa.com.my/partner/auth/login')

WebUI.setText(findTestObject('Object Repository/ATA_Partner/LoginPage/input_Welcome to ATA Partner_p-inputtext p-_2f833e'), '122614910')

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/div_Welcome to ATA Partner_p-checkbox-box'))

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/button_Request OTP'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/ATA_Partner/LoginPage/button_Verify'))*/
WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/a_Vehicle Listing'))

WebUI.verifyElementPresent(findTestObject('ATA_Partner/Vehicle/Vehicle/a_Add Registered Vehicle'), 0)

WebUI.verifyElementText(findTestObject('ATA_Partner/Vehicle/Vehicle/a_Add Registered Vehicle'), 'Add Registered Vehicle')

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/a_Add Registered Vehicle'))

WebUI.verifyElementText(findTestObject('ATA_Partner/Vehicle/Vehicle/p_Vehicle Number'), 'Vehicle Number')

WebUI.verifyElementText(findTestObject('ATA_Partner/Vehicle/Vehicle/p_Type of Vehicle'), 'Type of Vehicle')

WebUI.verifyElementText(findTestObject('ATA_Partner/Vehicle/Vehicle/p_Vehicle Status'), 'Vehicle Status')

WebUI.setText(findTestObject('ATA_Partner/Vehicle/Vehicle/fill_vehicleNumber'), 'WCA345')

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/Type Of Truck/dropdown_vehicleTowTruck'))

WebUI.delay(2)

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/Tow_Truck'))

WebUI.delay(2)

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/dropdownStatus'))

WebUI.delay(2)

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/Available'))

WebUI.delay(2)

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/Weight/weight_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/Type Of Truck/type_truck_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/Type Of Truck/Carrier'))

WebUI.delay(2)

//WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/mpv'))
WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/basement'))

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/tyre_replace'))

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/petrol5'))

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/jumpstart'))

WebUI.scrollToPosition(14, 21)

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/span_Save'))

WebUI.click(findTestObject('ATA_Partner/Vehicle/Vehicle/Truck/button_Confirm save'))

