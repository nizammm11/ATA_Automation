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
import java.time.format.DateTimeFormatter as DateTimeFormatter

//__________________SCREENSHOT_________________________
Date today = new Date()

String dateTime = today.format('yyyyMMddHHmmss')

WebUI.openBrowser('')

WebUI.maximizeWindow()

//WebUI.navigateToUrl('https://canary.autoassistcare.etiqa.com.my/auto/help')
WebUI.navigateToUrl(findTestData('URL').getValue('ATAU', 1))

for (def row = 1; row <= findTestData('ATAU').getRowNumbers(); row++) {
    if (WebUI.verifyElementPresent(findTestObject('ATAU HH/Location/Button_Got It'), 0, FailureHandling.OPTIONAL) == true) {
        WebUI.click(findTestObject('ATAU HH/Location/Button_Got It'))
    } else {
        WebUI.delay(1)
    }
    
    //WebUI.click(findTestObject('ATAU HH/Location/Button_Got It'))
    WebUI.click(findTestObject('ATAU HH/Location/Where Are You Now'))

    WebUI.click(findTestObject('ATAU HH/Location/Button_Got It'))

    WebUI.setText(findTestObject('ATAU HH/Location/Current Location'), findTestData('ATAU').getValue('Location', row))

    WebUI.sendKeys(findTestObject('ATAU HH/Location/Current Location'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('ATAU HH/Location/Current Location'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('ATAU HH/Location/Button_Confirm Location'))

    WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAU//1. Locations Details_' + row) + '_') + dateTime) + 
        '.png')

    if (WebUI.verifyElementPresent(findTestObject('ATAU HH/Location/Button_Got It'), 0, FailureHandling.OPTIONAL) == true) {
		WebUI.click(findTestObject('ATAU HH/Location/Button_Got It'))
		
    } else {
        WebUI.delay(1)
    }
    
    //==================================================Vehicle Type SELECTION=========================================================
    if (findTestData('ATAU').getValue('VehicleType', row) == 'Car') {
        WebUI.click(findTestObject('ATAU HH/General/Vehicle Type_Car'))
    } else {
        WebUI.click(findTestObject('ATAU HH/General/Vehicle Type_Motorcycle'))
    }
    
    /*___________________________________________________SERVICE TYPE SELECTION__________________________________________________*/
    if (findTestData('ATAU').getValue('Issue', row) == 'Service 1') {
        WebUI.click(findTestObject('ATAU HH/Service Type/Issue_Brake Issue'))
    } else if (findTestData('ATAU').getValue('Issue', row) == 'Service 2') {
        WebUI.click(findTestObject('ATAU HH/Service Type/Issue_Problems Changing Gear'))
    } else if (findTestData('ATAU').getValue('Issue', row) == 'Service 3') {
        WebUI.click(findTestObject('ATAU HH/Service Type/Issue_Smoke is coming out from my engine'))
    } else if (findTestData('ATAU').getValue('Issue', row) == 'Service 4') {
        WebUI.click(findTestObject('ATAU HH/Service Type/Issue_Accident'))
    } else if (findTestData('ATAU').getValue('Issue', row) == 'Service 5') {
        WebUI.click(findTestObject('ATAU HH/Service Type/Issue_Cannot Start My Vehicle'))
    } else if (findTestData('ATAU').getValue('Issue', row) == 'Service 6') {
        WebUI.click(findTestObject('ATAU HH/Service Type/Issue_Flat Tyre'))
    } else if (findTestData('ATAU').getValue('Issue', row) == 'Service 7') {
        WebUI.click(findTestObject('ATAU HH/Service Type/Issue_Out of Petrol'))
    } else if (findTestData('ATAU').getValue('Issue', row) == 'Service 8') {
        WebUI.click(findTestObject('ATAU HH/Service Type/Issue_Locked Vehicle'))
    } else if (findTestData('ATAU').getValue('Issue', row) == 'Service 10') {
        WebUI.click(findTestObject('ATAU HH/Service Type/Issue_Cannot Start My Motorcycle'))
    } else {
        WebUI.click(findTestObject('ATAU HH/Service Type/Issue_Im not sure whats wrong'))
    }
    
    //==================================================QUESTIONS ON SERVICE REQUEST=========================================================
    if ((findTestData('ATAU').getValue('ServiceType', row) == 'Towing') & (findTestData('ATAU').getValue('VehicleType', 
        row) == 'Car')) {
        /*___________Q1___________*/
        if (findTestData('ATAU').getValue('Q1', row) == 'Yes') {
            WebUI.click(findTestObject('ATAU HH/Question/Q1_Yes'))
        } else {
            WebUI.click(findTestObject('ATAU HH/Question/Q1_No'))
        }
        
        /*___________Q2___________*/
        if (findTestData('ATAU').getValue('Q2', row) == 'Yes') {
            WebUI.click(findTestObject('ATAU HH/Question/Q2_Yes'))
        } else {
            WebUI.click(findTestObject('ATAU HH/Question/Q2_No'))
        }
        
        /*___________Q3___________*/
        if (findTestData('ATAU').getValue('Q3', row) == 'Yes') {
            WebUI.click(findTestObject('ATAU HH/Question/Q3_Yes'))
        } else {
            WebUI.click(findTestObject('ATAU HH/Question/Q3_No'))
        }
        
        /*___________Q4___________*/
        if (findTestData('ATAU').getValue('Q4', row) == 'Yes') {
            WebUI.click(findTestObject('ATAU HH/Question/Q4_Yes'))
        } else {
            WebUI.click(findTestObject('ATAU HH/Question/Q4_No'))
        }
        
        /*___________Q5___________*/
        if (findTestData('ATAU').getValue('Q5', row) == 'Yes') {
            WebUI.click(findTestObject('ATAU HH/Question/Q5_Yes'))
        } else {
            WebUI.click(findTestObject('ATAU HH/Question/Q5_No'))
        }
        
        /*___________Q6___________*/
        if (findTestData('ATAU').getValue('Q6', row) == 'Yes') {
            WebUI.click(findTestObject('ATAU HH/Question/Q6_Yes'))
        } else {
            WebUI.click(findTestObject('ATAU HH/Question/Q6_No'))
        }
        
        WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAU//2. Issue Details_' + row) + '_') + dateTime) + 
            '.png')

        WebUI.click(findTestObject('ATAU HH/General/Button_Continue'))

        //====================================Towing Destination - Where should we tow your car to?===============================================
        if (findTestData('ATAU').getValue('TowingDestination', row) == 'Preferred') {
            WebUI.click(findTestObject('ATAU HH/Location/Towing Destination_Preferred Destination'))

            WebUI.click(findTestObject('ATAU HH/General/Button_Next'))

            WebUI.setText(findTestObject('ATAU HH/Location/Towing Destination (Input)'), findTestData('ATAU').getValue('Destination', 
                    row))

            WebUI.sendKeys(findTestObject('ATAU HH/Location/Towing Destination (Input)'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('ATAU HH/Location/Towing Destination (Input)'), Keys.chord(Keys.ENTER))
        } else {
            WebUI.click(findTestObject('ATAU HH/Location/Towing Destination_No Preference'))
        }
        
        WebUI.click(findTestObject('ATAU HH/General/Button_Next'))
    } else if ((findTestData('ATAU').getValue('ServiceType', row) == 'Towing') & (findTestData('ATAU').getValue('VehicleType', 
        row) == 'Motorcycle')) {
        if (findTestData('ATAU').getValue('TowingDestination', row) == 'Preferred') {
            WebUI.click(findTestObject('ATAU HH/Location/Towing Destination_Preferred Destination'))

            WebUI.click(findTestObject('ATAU HH/General/Button_Next'))

            WebUI.setText(findTestObject('ATAU HH/Location/Towing Destination (Input)'), findTestData('ATAU').getValue('Destination', 
                    row))

            WebUI.sendKeys(findTestObject('ATAU HH/Location/Towing Destination (Input)'), Keys.chord(Keys.ARROW_DOWN))

            WebUI.sendKeys(findTestObject('ATAU HH/Location/Towing Destination (Input)'), Keys.chord(Keys.ENTER))
        } else {
            WebUI.click(findTestObject('ATAU HH/Location/Towing Destination_No Preference'))
        }
        
        WebUI.click(findTestObject('ATAU HH/General/Button_Next'))
    } else {
        WebUI.click(findTestObject('ATAU HH/Customer Details/Vehicle Registration Number'))
    }
    
    //=================================================CUSTOMER DETAILS===========================================================
    WebUI.setText(findTestObject('ATAU HH/Customer Details/Vehicle Registration Number'), findTestData('ATAU').getValue(
            'VehicleNo', row))

    WebUI.setText(findTestObject('ATAU HH/Customer Details/Mobile Number'), findTestData('ATAU').getValue('MobileNo', row))

    WebUI.setText(findTestObject('ATAU HH/Customer Details/Name'), findTestData('ATAU').getValue('Name', row))

    WebUI.click(findTestObject('ATAU HH/Submission/Checkbox_Agree TNC'))

    WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAU//3. Customer Details_' + row) + '_') + dateTime) + 
        '.png')

    WebUI.delay(30 //CAPTCHA
        //CAPTCHA
        //CAPTCHA
        //CAPTCHA
        //CAPTCHA
        //CAPTCHA
        //CAPTCHA
        //CAPTCHA
        //CAPTCHA
        //CAPTCHA
        )

    WebUI.click(findTestObject('ATAU HH/Submission/Button_Send to Etiqa (Submit)'))

    WebUI.delay(2)

    WebUI.enhancedClick(findTestObject('ATAU HH/General/Button_Yes, lets proceed'))

    //====================================================TRACKING=============================================================
    /*Can Comment start from here if not using tracking*/
    /*WebUI.click(findTestObject('ATAU HH/Submission/Button_Track Status'))

    WebUI.setText(findTestObject('ATAU HH/Submission/Vehicle Number (Track Status)'), findTestData('ATAU').getValue('VehicleNo', 
            row))

    WebUI.click(findTestObject('ATAU HH/Submission/Tracking Number (Track Status)'))

    WebUI.delay(15 //Enter tracking no - get from OTP
        )

    WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAU//4. Tracking Details_' + row) + '_') + dateTime) + '.png')

    WebUI.click(findTestObject('ATAU HH/Submission/Button_Track Now')) */
    /*CComment until here if not using tracking*/
    WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAU//5. Case Created Successfully_' + row) + 
        '_') + dateTime) + '.png')

    WebUI.click(findTestObject('ATAU HH/General/Back Main ATAU'))
}

