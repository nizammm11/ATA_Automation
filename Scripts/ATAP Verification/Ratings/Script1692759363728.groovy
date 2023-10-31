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

WebUI.click(findTestObject('ATAP HH/Module/Module_Ratings'))

WebUI.delay(5)

'TC105'
WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//1. Ratings - Negative Ratings_' + dateTime) + '.png')

'TC103'
WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//2. Ratings - View Ratings_' + dateTime) + '.png')

'TC104'
WebUI.click(findTestObject('ATAP HH/Module/Module_Ratings'))

WebUI.click(findTestObject('ATAP HH/Ratings/Tab_Pending'))

WebUI.click(findTestObject('ATAP HH/General/Case Select Vehicle No'))

WebUI.click(findTestObject('ATAP HH/Ratings/Button_Add Ratings'))

WebUI.click(findTestObject('ATAP HH/Ratings/Ratings 1 Details'))

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 1_Very Difficult'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 1_Difficult'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 1_Ok'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 1_Easy'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 1_Very Easy'), 0)

WebUI.click(findTestObject('ATAP HH/Ratings/Ratings 1_Easy'))

WebUI.click(findTestObject('ATAP HH/Ratings/Ratings 2 Details'))

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_0 (Not Likely)'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_1'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_2'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_3'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_4'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_5'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_6'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_7'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_8'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_9'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 2_10 (Extremely likely)'), 0)

WebUI.click(findTestObject('ATAP HH/Ratings/Ratings 2_9'))

WebUI.click(findTestObject('ATAP HH/Ratings/Ratings 3 Details'))

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 3_Terrible (Waiting Time)'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 3_Bad (Waiting Time)'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 3_Ok (Waiting Time)'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 3_Good (Waiting Time)'), 0)

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Ratings 3_Great (Waiting Time)'), 0)

WebUI.click(findTestObject('ATAP HH/Ratings/Ratings 3_Good (Waiting Time)'))

WebUI.setText(findTestObject('ATAP HH/Ratings/Ratings 4 Details Suggestions'), 'TESTING')

WebUI.delay(3)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//3. Ratings - Feedbacks Details_' + dateTime) + 
    '.png')

WebUI.verifyElementPresent(findTestObject('ATAP HH/Ratings/Button_Close (Ratings)'), 0)

WebUI.click(findTestObject('ATAP HH/Ratings/Button_Save (Ratings)'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//4. Ratings - View Service Rate_' + dateTime) + 
    '.png')

'TC106'
WebUI.click(findTestObject('ATAP HH/Module/Module_Ratings'))

WebUI.setText(findTestObject('ATAP HH/General/Date From'), '02/08/2023')

WebUI.setText(findTestObject('ATAP HH/General/Date To'), '20/08/2023')

WebUI.sendKeys(findTestObject('ATAP HH/General/Date To'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ATAP HH/General/Export CSV'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\//ATAP//Verification//5. Ratings - Surveys Download_' + dateTime) + '.png')
