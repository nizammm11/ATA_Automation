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

//WebUI.openBrowser('')
//WebUI.maximizeWindow()
//findTestData('ATAUcarBT').getRowNumbers()
//WebUI.navigateToUrl('https://canary.autoassistcare.etiqa.com.my/auto/help')
for (def row = 1; row <= 3; row++) {
    WebUI.openBrowser('')

    WebUI.maximizeWindow()
	
	WebUI.navigateToUrl(findTestData('URL').getValue('ATAU', 1))

    WebUI.verifyElementText(findTestObject('Object Repository/ATAU/button_Got It'), 'Got It', FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/ATAU/button_Got It'))

    WebUI.click(findTestObject('Object Repository/ATAU/main page/Where Are You Now'))

    WebUI.click(findTestObject('Object Repository/ATAU/button_Got It'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/ATAU/location page/location'), findTestData('ATAUmotorRos').getValue('Location', row))

    WebUI.sendKeys(findTestObject('ATAU/location page/location'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('ATAU/location page/location'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/ATAU/location page/btn_Confirm_Location'))

    /*__________________Type of Vehicle___________________________________*/
    //WebUI.click(findTestObject('Object Repository/ATAU/main page/btn_Car'))
    if (findTestData('ATAUmotorRos').getValue('ServiceVehicle', row) == 'Car') {
        WebUI.click(findTestObject('ATAU/main page/btn_Car'))
    } else {
        WebUI.click(findTestObject('ATAU/main page/btn_Motorcycle'))
    }
    
    /*__________________Vehicle List Service___________________________________*/
    if (findTestData('ATAUmotorRos').getValue('ServiceType', row) == 'Accident') {
        WebUI.click(findTestObject('ATAU/Motor service list/btn_motor_accident'))
    } else if (findTestData('ATAUmotorRos').getValue('ServiceType', row) == 'Petrol') {
        WebUI.click(findTestObject('ATAU/Motor service list/btn_motor_petrol'))
    } else {
        WebUI.click(findTestObject('ATAU/Motor service list/btn_motor_Im not sure whats wrong'))
    }
    
    //WebUI.click(findTestObject('ATAU/Car service list/btn_Im having a brake issue'))
    /*__________________Car Condition Checklist___________________________________
	
	WebUI.click(findTestObject('ATAU/Questions/btn_No_1'))*/
    /*if (findTestData('ATAUcarBT').getValue('Q1', row) == 'Yes') {
		WebUI.click(findTestObject('ATAU/Questions/btn_Yes_1'))
	} else {
		WebUI.click(findTestObject('ATAU/Questions/btn_No_1'))
	}
	
	if (findTestData('ATAUcarBT').getValue('Q2', row) == 'Yes') {
		WebUI.click(findTestObject('ATAU/Questions/btn_Yes_2'))
	} else {
		WebUI.click(findTestObject('ATAU/Questions/btn_No_2'))
	}
	
	if (findTestData('ATAUcarBT').getValue('Q3', row) == 'Yes') {
		WebUI.click(findTestObject('ATAU/Questions/btn_Yes_3'))
	} else {
		WebUI.click(findTestObject('ATAU/Questions/btn_No_3'))
	}
	
	if (findTestData('ATAUcarBT').getValue('Q4', row) == 'Yes') {
		WebUI.click(findTestObject('ATAU/Questions/btn_Yes_4'))
	} else {
		WebUI.click(findTestObject('ATAU/Questions/btn_No_4'))
	}
	
	if (findTestData('ATAUcarBT').getValue('Q5', row) == 'Yes') {
		WebUI.click(findTestObject('ATAU/Questions/btn_Yes_5'))
	} else {
		WebUI.click(findTestObject('ATAU/Questions/btn_No_5'))
	}
	
	if (findTestData('ATAUcarBT').getValue('Q6', row) == 'Yes') {
		WebUI.click(findTestObject('ATAU/Questions/btn_Yes_6'))
	} else {
		WebUI.click(findTestObject('ATAU/Questions/btn_No_6'))
	}
	
	WebUI.click(findTestObject('Object Repository/ATAU/Questions/button_Continue'))*/
    /*__________________Destination_____________________________________________________________________________

	WebUI.click(findTestObject('ATAU/preferred destination/preferred_Destination'), */
    /*if (findTestData('ATAUcarBT').getValue('TowingDestination', row) == 'Preferred destination') {
		WebUI.click(findTestObject('ATAU/preferred destination/preferred_Destination'))
	} else {
		WebUI.click(findTestObject('ATAU/no_Preference'))
	}
	
	WebUI.click(findTestObject('ATAU/preferred destination/a_Next'))

	WebUI.setText(findTestObject('ATAU/preferred destination/input_destination'), findTestData('ATAUcarBT').getValue('Destination',
			row))

	WebUI.sendKeys(findTestObject('ATAU/preferred destination/input_destination'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

	WebUI.click(findTestObject('ATAU/preferred destination/a_Next'))*/
    //__________________Details_____________________________________________________________________________
    //WebUI.setText(findTestObject('ATAU/details page/input_Vehicle Registration Number'), 'JSF3235')
    WebUI.setText(findTestObject('ATAU/details page/input_Vehicle Registration Number'), findTestData('ATAUmotorRos').getValue('VehicleNumber', 
            row))

    WebUI.setText(findTestObject('ATAU/details page/input_Mobile Number'), findTestData('ATAUmotorRos').getValue('PhoneNumber', row))

    WebUI.setText(findTestObject('ATAU/details page/input_Name'), findTestData('ATAUmotorRos').getValue('Nama', row))

    WebUI.click(findTestObject('ATAU/details page/tick_TC'))

    WebUI.delay(10)

    WebUI.click(findTestObject('ATAU/details page/button_Send to Etiqa'))

    //__________________Status tracking_____________________________________________________________________________
    WebUI.click(findTestObject('ATAU/confirmation page/button_Yes, lets proceed' /*WebUI.click(findTestObject('ATAU/submission page/I want to track my status'))

	WebUI.delay(10)

	WebUI.click(findTestObject('ATAU/submission page/button_Track Now'))*/ ))

    WebUI.delay(5)

    WebUI.closeBrowser()
}

