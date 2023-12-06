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

WebUI.callTestCase(findTestCase('ATAP - Main/ATAP - Login'), [:], FailureHandling.STOP_ON_FAILURE)

/*WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://canary.autoassistcare.etiqa.com.my/dashboard/login')*/
for (def row = 1; row <= findTestData('ATAP').getRowNumbers(); row++) {
	WebUI.click(findTestObject('ATAP/Case Listing/filter_dropdown'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('ATAP/Case Listing/filter_Vehicle Number'))
	
	WebUI.setText(findTestObject('ATAP/Case Listing/inputFilter_Vehicle Number'), findTestData('ATAP').getValue('VehicleNo', row))
	
	WebUI.click(findTestObject('ATAP/Case Listing/button_SearchFilter'))
	
	WebUI.delay(2)
	
    /*WebUI.setText(findTestObject('ATAP HH/General/Search_VehicleNo'), findTestData('ATAP').getValue('VehicleNo', row))

    WebUI.sendKeys(findTestObject('ATAP HH/General/Search_VehicleNo'), Keys.chord(Keys.ENTER))*/

    WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//1. New Request Case_' + row) + '_') + dateTime) + 
        '.png')

    //WebUI.delay(1)

    WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

    WebUI.delay(2)

    WebUI.scrollToElement(findTestObject('ATAP HH/General/Customer Name'), 0)

    WebUI.click(findTestObject('ATAP HH/Vehicle Model/Vehicle Make'))

    WebUI.setText(findTestObject('ATAP HH/Vehicle Model/Vehicle Make_Input'), findTestData('ATAP').getValue('VehicleMake', 
            row))

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('ATAP HH/Vehicle Model/Vehicle Make_Input'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

    WebUI.click(findTestObject('ATAP HH/Vehicle Model/Vehicle Model'))

    WebUI.setText(findTestObject('ATAP HH/Vehicle Model/Vehicle Model_Input'), findTestData('ATAP').getValue('VehicleModel', 
            row))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('ATAP HH/Vehicle Model/Vehicle Model_Input'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

    //==================================================ENTITY SELECTION=========================================================
    if (findTestData('ATAP').getValue('Entity', row) == 'EGTB') {
        WebUI.click(findTestObject('ATAP HH/Entity/Etiqa General Takaful Berhad'))
    } else if (findTestData('ATAP').getValue('Entity', row) == 'EGIB') {
        WebUI.click(findTestObject('ATAP HH/Entity/Etiqa General Insurance Berhad'))
    } else {
        WebUI.click(findTestObject('ATAP HH/Entity/Non-Etiqa'))
    }
    
    if (findTestData('ATAP').getValue('PolicyBenefits', row) == '50KM') {
        WebUI.click(findTestObject('ATAP HH/Policy Benefits/Policy Benefits_50KM'))
    } else if (findTestData('ATAP').getValue('PolicyBenefits', row) == '200KM') {
        WebUI.click(findTestObject('ATAP HH/Policy Benefits/Policy Benefits_200KM'))
    } else if (findTestData('ATAP').getValue('PolicyBenefits', row) == '300KM') {
        WebUI.click(findTestObject('ATAP HH/Policy Benefits/Policy Benefits_300KM'))
    } else if (findTestData('ATAP').getValue('PolicyBenefits', row) == '175KM') {
        WebUI.click(findTestObject('ATAP HH/Policy Benefits/Policy Benefits_175KM Per Trip'))
    } else if (findTestData('ATAP').getValue('PolicyBenefits', row) == 'Franchise') {
        WebUI.click(findTestObject('ATAP HH/Policy Benefits/Policy Benefits_Franchise'))
    } else if (findTestData('ATAP').getValue('PolicyBenefits', row) == 'Unlimited') {
        WebUI.click(findTestObject('ATAP HH/Policy Benefits/Policy Benefits_Unlimited'))
    } else {
        WebUI.click(findTestObject('ATAP HH/Policy Benefits/Policy Benefits_Cash Job'))
    }
    
    WebUI.scrollToElement(findTestObject('ATAP HH/Policy Benefits/Policy Benefits_200KM'), 0)

    //==================================================LANGUAGE PREFERENCE=========================================================
    if (findTestData('ATAP').getValue('Language', row) == 'Malay') {
        WebUI.click(findTestObject('ATAP HH/General/Language_Malay'))
    } else {
        WebUI.click(findTestObject('ATAP HH/General/Language_English'))
    }
    
    WebUI.scrollToElement(findTestObject('ATAP HH/General/Language_English'), 0)

    /*'Service Type - Car for BT and SERVICE 8 ONLY'
	if ((findTestData('ATAP').getValue('VehicleType', row) == 'Car') & (findTestData('ATAP').getValue('Issue', row) == 'NIL')) {
		WebUI.click(findTestObject('ATAP HH/Service Type/Service Type'))

		WebUI.click(findTestObject('ATAP HH/Service Type Car/Car_Repair-On-Site (ROS)'))

		if (findTestData('ATAP').getValue('SubService', row) == 'Out of Petrol') {
			WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Out of Petrol'))
		} else if (findTestData('ATAP').getValue('SubService', row) == 'Jump Start') {
			WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Jump Start'))
		} else if (findTestData('ATAP').getValue('SubService', row) == 'Change Battery') {
			WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Change Battery'))
		} else {
			WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Flat Tyre'))
		}
	} else {
		WebUI.delay(0)
	}	*/
    'Service Type - Car for ROS and SERVICE 8 ONLY'
    if ((findTestData('ATAP').getValue('VehicleType', row) == 'Car') & (findTestData('ATAP').getValue('Issue', row) == 'NIL')) {
        WebUI.click(findTestObject('ATAP HH/Service Type/Service Type'))
		
		if (findTestData('ATAP').getValue('ServiceType', row) == 'Repair-On-Site (ROS) - Car') {
			WebUI.click(findTestObject('ATAP HH/Service Type Car/Car_Repair-On-Site (ROS)'))
			
			if (findTestData('ATAP').getValue('SubService', row) == 'Out of Petrol') {
				WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Out of Petrol'))
				} else if (findTestData('ATAP').getValue('SubService', row) == 'Jump Start') {
					WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Jump Start'))
        		} else if (findTestData('ATAP').getValue('SubService', row) == 'Change Battery') {
            		WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Change Battery'))
        		} else {
            		WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Flat Tyre'))
           		}
				   
		} else if (findTestData('ATAP').getValue('ServiceType', row) == 'Breakdown Towing - Car') {
			WebUI.click(findTestObject('ATAP HH/Service Type/Car_Breakdown Towing'))

            if (findTestData('ATAP').getValue('SubService', row) == 'Brake') {
                WebUI.click(findTestObject('ATAP HH/Service Type/Car Towing_Brakes Problem'))
            } else if (findTestData('ATAP').getValue('SubService', row) == 'Smoke') {
                WebUI.click(findTestObject('ATAP HH/Service Type/Car Towing_Overheating'))
            } else {
                WebUI.click(findTestObject('ATAP HH/Service Type/Car Towing_Transmission Issue'))
            }
			
        } else if (findTestData('ATAP').getValue('ServiceType', row) == 'Accident - Car') {
            WebUI.click(findTestObject('ATAP HH/Service Type/Car_Accident'))

            if (findTestData('ATAP').getValue('SubService', row) == 'Claim') {
                WebUI.click(findTestObject('ATAP HH/Service Type/Accident_Claim'))
            } else {
                WebUI.click(findTestObject('ATAP HH/Service Type/Accident_Non-claim'))
            }
			
        } else {
            WebUI.click(findTestObject('ATAP HH/Service Type/Others - Car'))
        }
		
    } else {
        WebUI.delay(0)
    }
        
		 /*	
		 ==================================
        WebUI.click(findTestObject('ATAP HH/Service Type Car/Car_Repair-On-Site (ROS)'))

        if (findTestData('ATAP').getValue('SubService', row) == 'Out of Petrol') {
            WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Out of Petrol'))
        } else if (findTestData('ATAP').getValue('SubService', row) == 'Jump Start') {
            WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Jump Start'))
        } else if (findTestData('ATAP').getValue('SubService', row) == 'Change Battery') {
            WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Change Battery'))
        } else {
            WebUI.click(findTestObject('ATAP HH/Service Type Car/Car ROS_Flat Tyre'))
        }
    } else {
        WebUI.delay(0)
    }
	===================================== */
    
    'Sub Service/Service Type - Motorcycle For Accident and Im Not Sure'
    if ((findTestData('ATAP').getValue('VehicleType', row) == 'Motorcycle') & (findTestData('ATAP').getValue('Issue', row) == 
    'NIL')) {
        WebUI.click(findTestObject('ATAP HH/Service Type/Service Type'))

        if (findTestData('ATAP').getValue('ServiceType', row) == 'Repair-On-Site (ROS) - Motorcycle') {
            WebUI.click(findTestObject('ATAP HH/Service Type/Repair-On-Site (ROS) - Motorcycle'))

            WebUI.delay(2)

            WebUI.click(findTestObject('ATAP HH/Service Type/ROS_Out of Petrol'))
        } else if (findTestData('ATAP').getValue('ServiceType', row) == 'Accident - Motorcycle') {
            WebUI.click(findTestObject('ATAP HH/Service Type/Accident - Motorcycle'))

            if (findTestData('ATAP').getValue('SubService', row) == 'Claim') {
                WebUI.click(findTestObject('ATAP HH/Service Type/Accident_Claim'))
            } else {
                WebUI.click(findTestObject('ATAP HH/Service Type/Accident_Non-claim'))
            }
        } else if (findTestData('ATAP').getValue('ServiceType', row) == 'Breakdown Towing - Motorcycle') {
            WebUI.click(findTestObject('ATAP HH/Service Type/Breakdown Towing - Motorcycle'))

            if (findTestData('ATAP').getValue('SubService', row) == 'Flat Tyre') {
                WebUI.click(findTestObject('ATAP HH/Service Type/Towing_Flat Tyre'))
            } else if (findTestData('ATAP').getValue('SubService', row) == 'Gears Problem') {
                WebUI.click(findTestObject('ATAP HH/Service Type/Towing_Gears Problem'))
            } else if (findTestData('ATAP').getValue('SubService', row) == 'Brakes Problem') {
                WebUI.click(findTestObject('ATAP HH/Service Type/Towing_Brakes Problem'))
            } else {
                WebUI.click(findTestObject('ATAP HH/Service Type/Towing_Cannot Start Motorcycle'))
            }
        } else {
            WebUI.click(findTestObject('ATAP HH/Service Type/Others - Car'))
        }
    } else {
        WebUI.delay(0)
    }
    
    WebUI.scrollToElement(findTestObject('ATAP HH/General/Latitude'), 0)

    WebUI.click(findTestObject('Object Repository/ATAP HH/General/Button_Search'))

    //WebUI.click(findTestObject('Object Repository/ATAP HH/General/Button_OK'))
    WebUI.click(findTestObject('ATAP HH/General/Provider List'))

    WebUI.setText(findTestObject('ATAP HH/General/Provider Input'), findTestData('ATAP').getValue('Provider', row))

    WebUI.sendKeys(findTestObject('ATAP HH/General/Provider Input'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

    WebUI.delay(2)

    WebUI.scrollToElement(findTestObject('Object Repository/ATAP HH/General/Button_Search'), 0)

    'PROVIDER - DSP'
    if (findTestData('ATAP').getValue('Provider', row) == 'DSP') {
        WebUI.click(findTestObject('ATAP HH/General/Reason for Manual Assignment (DSP)'))

        WebUI.setText(findTestObject('ATAP HH/General/Input_Reason Manual Assignment'), findTestData('ATAP').getValue('ReasonDSP', 
                row))

        WebUI.delay(2)

        WebUI.sendKeys(findTestObject('ATAP HH/General/Input_Reason Manual Assignment'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

        WebUI.click(findTestObject('ATAP HH/General/Reason Details (DSP)'))

        WebUI.setText(findTestObject('ATAP HH/General/Input_Reason Details'), findTestData('ATAP').getValue('ReasonDetails', 
                row))

        WebUI.delay(2)

        WebUI.sendKeys(findTestObject('ATAP HH/General/Input_Reason Details'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))
    } else {
        WebUI.delay(1)
    }
    
    /*if (findTestData('ATAP').getValue('VehicleType', row) == 'Motorcycle') {
        WebUI.scrollToElement(findTestObject('ATAP HH/Destination/Clear Remarks'), 0)

        WebUI.click(findTestObject('ATAP HH/Destination/Workshop'))

        WebUI.setText(findTestObject('ATAP HH/Destination/Workshop Destination'), findTestData('ATAP').getValue('Workshop', row))

        WebUI.sendKeys(findTestObject('ATAP HH/Destination/Workshop Destination'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))
    } else {
        WebUI.delay(0)
    }*/
    if (findTestData('ATAP').getValue('Destination', row) == 'Yes') {
        WebUI.scrollToElement(findTestObject('ATAP HH/Destination/Clear Remarks'), 0)

        WebUI.click(findTestObject('ATAP HH/Destination/Workshop Destination'))

        WebUI.setText(findTestObject('ATAP HH/Destination/Workshop Destination'), findTestData('ATAP').getValue('Workshop', 
                row))

        WebUI.sendKeys(findTestObject('ATAP HH/Destination/Workshop Destination'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))
    } else {
        WebUI.delay(0)
    }
    
    WebUI.click(findTestObject('ATAP HH/General/Button_Save'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ATAP HH/General/Button_OK'))

    WebUI.click(findTestObject('ATAP HH/General/Button_Assign'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ATAP HH/General/Button_Yes, Assign Now'))

    WebUI.delay(1)

    WebUI.click(findTestObject('ATAP HH/General/Button_OK'))

    WebUI.takeFullPageScreenshot(((('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//2. Case Details_' + row) + '_') + dateTime) + 
        '.png')

    WebUI.click(findTestObject('ATAP HH/Module/Module_Cases'))
}

