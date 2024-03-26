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

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Login'), [:], FailureHandling.STOP_ON_FAILURE)

/*WebUI.openBrowser('')

WebUI.maximizeWindow()

//WebUI.navigateToUrl('https://canary.autoassistcare.etiqa.com.my/dashboard/login')
//WebUI.navigateToUrl(findTestData('URL').getValue('ATAP', num))
WebUI.navigateToUrl(GlobalVariable.SIT_ATAU)

WebUI.delay(10)*/
//KeywordLogger log = new KeywordLogger()
for (def row = 2; row <= 2; row++) {
    WebUI.click(findTestObject('ATAP/Create New Case/btn_Create New Case'))

    WebUI.refresh()

    //==============================||CUSTOMER DETAIL||==============================
    WebUI.setText(findTestObject('ATAP/Create New Case/Customer Detail/input_phone number'), findTestData('ATAP New Case').getValue(
            'contactNumber', row))

    WebUI.setText(findTestObject('ATAP/Create New Case/Customer Detail/input_second phone number'), findTestData('ATAP New Case').getValue(
            'secondContactNumber', row))

    WebUI.setText(findTestObject('ATAP/Create New Case/Customer Detail/input_third phone number'), findTestData('ATAP New Case').getValue(
            'thirdContactNumber', row))

    WebUI.setText(findTestObject('ATAP/Create New Case/Customer Detail/input_vehicle number'), findTestData('ATAP New Case').getValue(
            'vehicleNumber', row))

    WebUI.setText(findTestObject('ATAP/Create New Case/Customer Detail/input_name'), findTestData('ATAP New Case').getValue(
            'Name', row))

    WebUI.scrollToElement(findTestObject('ATAP HH/General/Customer Name'), 0)

    WebUI.delay(1)

    WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/dropdown_vehicle type'))

    if (findTestData('ATAP New Case').getValue('vehicleType', row) == 'Car') {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/li_Car'))
    } else {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/li_Motorcycle'))
    }
    
    WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/dropdown_vehicle make'))

    //WebUI.scrollToElement(findTestObject('ATAP HH/General/Customer Name'), 0)
    WebUI.setText(findTestObject('ATAP/Page_Dashboard/Page_Dashboard/input_vehicle make'), findTestData('ATAP New Case').getValue(
            'vehicleMake', row))

    WebUI.sendKeys(findTestObject('ATAP/Page_Dashboard/Page_Dashboard/input_vehicle make'), Keys.chord(Keys.ARROW_DOWN, 
            Keys.ENTER))

    WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/dropdown_vehicle model'))

    WebUI.setText(findTestObject('ATAP/Page_Dashboard/Page_Dashboard/input_vehicle model'), findTestData('ATAP New Case').getValue(
            'vehicleModel', row))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('ATAP/Page_Dashboard/Page_Dashboard/input_vehicle model'), Keys.chord(Keys.ARROW_DOWN, 
            Keys.ENTER))

    //==============================||ENTITY||==============================
    if (findTestData('ATAP New Case').getValue('Entity', row) == 'EGTB') {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/entity_EGTB'))
    } else if (findTestData('ATAP New Case').getValue('Entity', row) == 'EGIB') {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/entity_EGIB'))
    } else {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/entity_Non-Etiqa'))
    }
    
    //==============================||POLICY BENEFITS||==============================
    if (findTestData('ATAP New Case').getValue('policyBenefits', row) == '50KM') {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/policyBenefits_50KM'))
    } else if (findTestData('ATAP New Case').getValue('policyBenefits', row) == '200KM') {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/policyBenefits_200KM'))
    } else if (findTestData('ATAP New Case').getValue('policyBenefits', row) == '300KM') {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/policyBenefits_300KM'))
    } else if (findTestData('ATAP New Case').getValue('policyBenefits', row) == '175KM Per Trip') {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/policyBenefits_175KM Per Trip'))
    } else if (findTestData('ATAP New Case').getValue('policyBenefits', row) == 'Unlimited') {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/policyBenefits_Unlimited'))
    } else if (findTestData('ATAP New Case').getValue('policyBenefits', row) == 'Franchise') {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/policyBenefits_Franchise'))
    } else {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/policyBenefits_Cash Job'))
    }
    
    WebUI.setText(findTestObject('ATAP/Create New Case/Customer Detail/input_Email'), findTestData('ATAP New Case').getValue(
            'Email', row))

    WebUI.scrollToElement(findTestObject('ATAP HH/Policy Benefits/Policy Benefits_200KM'), 0)

    //WebUI.click(findTestObject('ATAP/Page_Dashboard/span_Please select'))
    //WebUI.delay(2)
    //==================================================LANGUAGE PREFERENCE=========================================================
    if (findTestData('ATAP New Case').getValue('Language', row) == 'Malay') {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/Preferred language_Malay'))
    } else {
        WebUI.click(findTestObject('ATAP/Create New Case/Customer Detail/Preferred language_English'))
    }
    
    WebUI.scrollToElement(findTestObject('ATAP/Create New Case/Customer Detail/Preferred language_English'), 0)

    //==============================||SERVICE DETAILS||==============================
    'Service Type - Car'
    if (findTestData('ATAP New Case').getValue('vehicleType', row) == 'Car') {
        WebUI.click(findTestObject('ATAP/Create New Case/Service Details/serviceType_dropdown'))

        if (findTestData('ATAP New Case').getValue('serviceType', row) == 'Repair-On-Site (ROS) - Car') {
            WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/ROS/Repair-On-Site (ROS) - Car'))

            if (findTestData('ATAP New Case').getValue('subService', row) == 'Out of Petrol') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/ROS/Car_subServiceROS_Out of Petrol'))
            } else if (findTestData('ATAP New Case').getValue('subService', row) == 'Jump Start') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/ROS/Car_subServiceROS_Jump Start'))
            } else if (findTestData('ATAP New Case').getValue('subService', row) == 'Change Battery') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/ROS/Car_subServiceROS_Change Battery'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/ROS/Car_subServiceROS_Flat Tyre'))
            }
        } else if (findTestData('ATAP New Case').getValue('serviceType', row) == 'Breakdown Towing - Car') {
            WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/BT/Breakdown Towing - Car'))

            if (findTestData('ATAP New Case').getValue('subService', row) == 'Brake') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/BT/subServiceBT_Brakes Problem'))
            } else if (findTestData('ATAP New Case').getValue('subService', row) == 'Smoke') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/BT/subServiceBT_Overheating'))
            } else if (findTestData('ATAP New Case').getValue('subService', row) == 'Gear') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/BT/subServiceBT_Transmission Issue'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/BT/subServiceBT_Electrical Issue'))
            }
            
            if (findTestData('ATAP New Case').getValue('Q1', row) == 'Yes') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q1_Yes'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q1_No'))
            }
            
            WebUI.scrollToElement(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/subtitle_Car Condition Checklists'), 
                0)

            if (findTestData('ATAP New Case').getValue('Q2', row) == 'Yes') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q2_Yes'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q2_No'))
            }
            
            if (findTestData('ATAP New Case').getValue('Q3', row) == 'Yes') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q3_Yes'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q3_No'))
            }
            
            if (findTestData('ATAP New Case').getValue('Q4', row) == 'Yes') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q4_Yes'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q4_No'))
            }
            
            if (findTestData('ATAP New Case').getValue('Q5', row) == 'Yes') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q5_Yes'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q5_No'))
            }
            
            if (findTestData('ATAP New Case').getValue('Q6', row) == 'Yes') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q6_Yes'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/QChecklist/Q6_No'))
            }
        } else if (findTestData('ATAP New Case').getValue('serviceType', row) == 'Accident - Car') {
            WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/Accident/Accident - Car'))

            if (findTestData('ATAP New Case').getValue('subService', row) == 'Claim') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/Accident/accident_Claim'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Car/Accident/accident_Non-claim'))
            }
        } else {
            WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Others - Car'))
        }
    } else {
        WebUI.delay(0)
    }
    
    'Service Type - Motorcycle'
    if (findTestData('ATAP New Case').getValue('vehicleType', row) == 'Motorcycle') {
        WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Page_Dashboard/Please select_dropdown-trigger'))

        if (findTestData('ATAP New Case').getValue('serviceType', row) == 'Repair-On-Site (ROS) - Motorcycle') {
            WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Motorcycle/ROS_motor/Repair-On-Site (ROS)_Motorcycle'))

            WebUI.delay(1)

            WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Motorcycle/ROS_motor/motorROS_Out of Petrol'))
        } else if (findTestData('ATAP New Case').getValue('serviceType', row) == 'Breakdown Towing - Motorcycle') {
            WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Motorcycle/BT_motor/Breakdown Towing_Motorcycle'))

            if (findTestData('ATAP New Case').getValue('subService', row) == 'Flat Tyre') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Motorcycle/BT_motor/motorBT_Flat Tyre'))
            } else if (findTestData('ATAP New Case').getValue('subService', row) == 'Gears Problem') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Motorcycle/BT_motor/motorBT_Gears Problem'))
            } else if (findTestData('ATAP New Case').getValue('subService', row) == 'Brakes Problem') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Motorcycle/BT_motor/motorBT_Brakes Problem'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Motorcycle/BT_motor/motorBT_Cannot Start Motorcycle'))
            }
        } else if (findTestData('ATAP New Case').getValue('serviceType', row) == 'Accident - Motorcycle') {
            WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Motorcycle/Accident_motor/Accident_Motorcycle'))

            if (findTestData('ATAP New Case').getValue('subService', row) == 'Claim') {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Motorcycle/Accident_motor/motor_Claim'))
            } else {
                WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Motorcycle/Accident_motor/motor_Non-claim'))
            }
        } else {
            WebUI.click(findTestObject('ATAP/Create New Case/Service Details/Others - Car'))
        }
    } else {
        WebUI.delay(0)
    }
    
    //=========================||LOCATION DETAILS||=========================
    WebUI.setText(findTestObject('ATAP/Create New Case/location details/input_customer location'), findTestData('ATAP New Case').getValue(
            'customerLocation', row))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('ATAP/Create New Case/location details/input_customer location'), Keys.chord(Keys.ARROW_DOWN, 
            Keys.ENTER))

    WebUI.scrollToElement(findTestObject('ATAP HH/General/Latitude'), 0)

    WebUI.delay(2)

    //=========================||PROVIDER||=========================
    //WebUI.click(findTestObject('Object Repository/ATAP HH/General/Button_Search'), 0)
    WebUI.click(findTestObject('Object Repository/ATAP HH/General/Button_Search'))

    //WebUI.click(findTestObject('Object Repository/ATAP HH/General/Button_OK'))
    WebUI.click(findTestObject('ATAP HH/General/Provider List'))

    WebUI.setText(findTestObject('ATAP HH/General/Provider Input'), findTestData('ATAP New Case').getValue('providerList', 
            row))

    WebUI.sendKeys(findTestObject('ATAP HH/General/Provider Input'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

    WebUI.delay(2)

    //=========================||DESTINATION||=========================
    if (findTestData('ATAP New Case').getValue('Destination', row) == 'Yes') {
        WebUI.scrollToElement(findTestObject('ATAP HH/Destination/Clear Remarks'), 0)

        WebUI.click(findTestObject('ATAP/Create New Case/Destination/workshop_State'))

        WebUI.setText(findTestObject('ATAP/Create New Case/Destination/textfield_state'), findTestData('ATAP New Case').getValue(
                'State', row))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('ATAP/Create New Case/Destination/textfield_state'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

        WebUI.click(findTestObject('ATAP/Create New Case/Destination/workshop_City'))

        WebUI.setText(findTestObject('ATAP/Create New Case/Destination/textfield_city'), findTestData('ATAP New Case').getValue(
                'City', row))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('ATAP/Create New Case/Destination/textfield_city'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

        WebUI.delay(1)

        WebUI.click(findTestObject('ATAP/Create New Case/Destination/workshop_dropdown'))

        WebUI.setText(findTestObject('ATAP/Create New Case/Destination/textfield_workshop'), findTestData('ATAP New Case').getValue(
                'Workshop', row))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('ATAP/Create New Case/Destination/textfield_workshop'), Keys.chord(Keys.ARROW_DOWN, 
                Keys.ENTER))
    } else {
        WebUI.delay(0)
    }
    
    WebUI.delay(2)

    WebUI.click(findTestObject('ATAP/Create New Case/button_Save'))

    WebUI.delay(5)

    WebUI.click(findTestObject('ATAP/Create New Case/button_OK'))

    WebUI.delay(2)

    WebUI.click(findTestObject('ATAP/Create New Case/button_Assign'))

    WebUI.delay(2)

    WebUI.click(findTestObject('ATAP/Create New Case/button_Yes, assign now'))

    WebUI.delay(4)

    WebUI.click(findTestObject('ATAP/Create New Case/button_OK'))

    WebUI.click(findTestObject('ATAP/Create New Case/tab_CaseListing'))

    WebUI.delay(1)
}

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Logout'), [:], FailureHandling.STOP_ON_FAILURE)

