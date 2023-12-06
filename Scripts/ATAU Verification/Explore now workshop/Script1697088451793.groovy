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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('URL').getValue('ATAU', 1))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\1. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.click(findTestObject('Object Repository/ATAU/button_Got It'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/explore workshop/btn_workshop Explore'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\2. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.verifyElementPresent(findTestObject('ATAU/main page/EAAC logo'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/textfield_search_workshop'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/icon_filter'), 0)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_Filter'), 'Filter')

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_Workshops near you'), 'Workshops near you')

/*WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/box_workshop'), 0)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/type_Normal'), 'NORMAL')

//WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_Sum Motor Sdn Bhd'), 'Sum Motor Sdn. Bhd. (HQ)')
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_Kuala Lumpur'), 'Kuala Lumpur')*/
/*--------------------------------Filter----------------------------------------*/
WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/icon_filter'), 0)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_Filter'), 'Filter')

WebUI.click(findTestObject('ATAU/explore workshop/icon_filter'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\3. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_Distance'), 'Distance')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_Distance'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_Distance'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_1km'), '1km')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_1km'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_1km'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_5km'), '5km')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_5km'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_5km'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_10km'), '10km')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_10km'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_10km'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_Category'), 'Category')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_Category'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_Category'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_Normal'), 'Normal')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_Normal'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_Normal'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\4. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_Premier'), 'Premier')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_Premier'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_Premier'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_Super Premier'), 'Super Premier')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_Super Premier'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_Super Premier'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_State'), 'State')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_State'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_State'))

WebUI.delay(2)

/*--------------------------------JOHOR----------------------------------------*/
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_JOHOR'), 'JOHOR')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_JOHOR'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_JOHOR'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Ayer Hitam'), 'Ayer Hitam')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Ayer Hitam'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Ayer Hitam'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\5. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Batu Pahat'), 'Batu Pahat')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Batu Pahat'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Batu Pahat'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Gelang Patah'), 'Gelang Patah')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Gelang Patah'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Gelang Patah'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Johor Bahru'), 'Johor Bahru')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Johor Bahru'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Johor Bahru'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Kluang'), 'Kluang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Kluang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Kluang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Kota Tinggi'), 'Kota Tinggi')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Kota Tinggi'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Kota Tinggi'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Kulai'), 'Kulai')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Kulai'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Kulai'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Labis'), 'Labis')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Labis'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Labis'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Masai'), 'Masai')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Masai'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Masai'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Mersing'), 'Mersing')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Mersing'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Mersing'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Muar'), 'Muar')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Muar'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Muar'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pasir Gudang'), 'Pasir Gudang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pasir Gudang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pasir Gudang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pekan Nanas'), 'Pekan Nanas')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pekan Nanas'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pekan Nanas'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pengerang'), 'Pengerang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pengerang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pengerang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pontian'), 'Pontian')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pontian'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Pontian'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Segamat'), 'Segamat')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Segamat'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Segamat'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Senai'), 'Senai')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Senai'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Senai'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Skudai'), 'Skudai')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Skudai'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Skudai'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Tampoi'), 'Tampoi')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Tampoi'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Tampoi'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Tangkak'), 'Tangkak')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Tangkak'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Tangkak'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Ulu Tiram'), 'Ulu Tiram')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Ulu Tiram'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Ulu Tiram'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Yong Peng'), 'Yong Peng')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Yong Peng'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Yong Peng'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_JOHOR'))

/*--------------------------------KEDAH----------------------------------------*/
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_KEDAH'), 'KEDAH')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_KEDAH'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_KEDAH'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Alor Setar'), 'Alor Setar')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Alor Setar'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Alor Setar'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Baling'), 'Baling')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Baling'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Baling'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Bedong'), 'Bedong')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Bedong'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Bedong'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Gurun'), 'Gurun')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Gurun'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Gurun'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Jitra'), 'Jitra')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Jitra'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Jitra'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Kuala Kedah'), 'Kuala Kedah')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Kuala Kedah'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Kuala Kedah'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Kulim'), 'Kulim')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Kulim'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Kulim'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Kupang'), 'Kupang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Kupang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Kupang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Langkawi'), 'Langkawi')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Langkawi'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Langkawi'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Lunas'), 'Lunas')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Lunas'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Lunas'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Padang Serai'), 'Padang Serai')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Padang Serai'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Padang Serai'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Pendang'), 'Pendang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Pendang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Pendang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Sungai Petani'), 'Sungai Petani')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Sungai Petani'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kedah/btn_Sungai Petani'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_KEDAH'))

/*--------------------------------KELANTAN----------------------------------------*/
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_KELANTAN'), 'KELANTAN')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_KELANTAN'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_KELANTAN'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Gua Musang'), 'Gua Musang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Gua Musang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Gua Musang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Ketereh'), 'Ketereh')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Ketereh'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Ketereh'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Kota Bharu'), 'Kota Bharu')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Kota Bharu'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Kota Bharu'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Kuala Krai'), 'Kuala Krai')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Kuala Krai'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Kuala Krai'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Machang'), 'Machang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Machang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Machang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Tanah Merah'), 'Tanah Merah')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Tanah Merah'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Kelantan/btn_Tanah Merah'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_KELANTAN'))

/*--------------------------------MELAKA----------------------------------------*/
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_MELAKA'), 'MELAKA')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_MELAKA'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_MELAKA'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Alor Gajah'), 'Alor Gajah')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Alor Gajah'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Alor Gajah'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Ayer Keroh'), 'Ayer Keroh')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Ayer Keroh'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Ayer Keroh'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Ayer Molek'), 'Ayer Molek')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Ayer Molek'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Ayer Molek'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Bukit Katil'), 'Bukit Katil')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Bukit Katil'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Bukit Katil'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Jasin'), 'Jasin')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Jasin'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Jasin'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Melaka'), 'Melaka')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Melaka'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Melaka/btn_Melaka'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_MELAKA'))

/*--------------------------------NEGERI SEMBILAN----------------------------------------*/
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_NEGERI SEMBILAN'), 'NEGERI SEMBILAN')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_NEGERI SEMBILAN'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_NEGERI SEMBILAN'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Bahau'), 'Bahau')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Bahau'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Bahau'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Bandar Baru Enstek'), 'Bandar Baru Enstek')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Bandar Baru Enstek'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Bandar Baru Enstek'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Kuala Pilah'), 'Kuala Pilah')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Kuala Pilah'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Kuala Pilah'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Labu'), 'Labu')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Labu'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Labu'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Mantin'), 'Mantin')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Mantin'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Mantin'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Nilai'), 'Nilai')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Nilai'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Nilai'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Pedas'), 'Pedas')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Pedas'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Pedas'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Port Dickson'), 'Port Dickson')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Port Dickson'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Port Dickson'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Senawang'), 'Senawang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Senawang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Senawang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Seremban'), 'Seremban')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Seremban'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Seremban'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Tampin'), 'Tampin')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Tampin'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Negeri Sembilan/btn_Tampin'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_NEGERI SEMBILAN'))

/*--------------------------------PAHANG----------------------------------------*/
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_PAHANG'), 'PAHANG')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_PAHANG'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_PAHANG'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Bentong'), 'Bentong')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Bentong'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Bentong'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Brincang'), 'Brincang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Brincang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Brincang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Jerantut'), 'Jerantut')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Jerantut'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Jerantut'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Kuala Lipis'), 'Kuala Lipis')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Kuala Lipis'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Kuala Lipis'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Kuantan'), 'Kuantan')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Kuantan'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Kuantan'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Maran'), 'Maran')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Maran'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Maran'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Mentakab'), 'Mentakab')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Mentakab'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Mentakab'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Raub'), 'Raub')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Raub'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Raub'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Temerloh'), 'Temerloh')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Temerloh'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Temerloh'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Triang'), 'Triang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Triang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Pahang/btn_Triang'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_PAHANG'))

/*--------------------------------PERAK----------------------------------------*/
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_PERAK'), 'PERAK')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_PERAK'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_PERAK'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Ayer Tawar'), 'Ayer Tawar')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Ayer Tawar'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Ayer Tawar'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Bidor'), 'Bidor')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Bidor'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Bidor'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Gerik'), 'Gerik')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Gerik'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Gerik'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Gopeng'), 'Gopeng')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Gopeng'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Gopeng'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Hutan Melintang'), 'Hutan Melintang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Hutan Melintang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Hutan Melintang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Ipoh'), 'Ipoh')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Ipoh'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Ipoh'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kampar'), 'Kampar')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kampar'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kampar'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kamunting'), 'Kamunting')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kamunting'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kamunting'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kemunting'), 'Kemunting')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kemunting'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kemunting'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kuala Kangsar'), 'Kuala Kangsar')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kuala Kangsar'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Kuala Kangsar'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Lahat'), 'Lahat')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Lahat'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Lahat'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Langkap'), 'Langkap')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Langkap'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Langkap'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Menglembu'), 'Menglembu')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Menglembu'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Menglembu'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Pusing'), 'Pusing')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Pusing'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Pusing'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Siputeh'), 'Siputeh')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Siputeh'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Siputeh'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Sitiawan'), 'Sitiawan')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Sitiawan'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Sitiawan'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Slim River'), 'Slim River')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Slim River'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Slim River'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Sungkai'), 'Sungkai')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Sungkai'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Sungkai'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Taiping'), 'Taiping')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Taiping'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Taiping'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Tanjong Malim'), 'Tanjong Malim')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Tanjong Malim'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Tanjong Malim'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Tapah'), 'Tapah')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Tapah'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Tapah'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Teluk Intan'), 'Teluk Intan')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Teluk Intan'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perak/btn_Teluk Intan'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_PERAK'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_PERLIS'), 'PERLIS')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_PERLIS'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_PERLIS'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Arau'), 'Arau')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Arau'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Arau'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Kangar'), 'Kangar')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Kangar'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Kangar'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Kodiang'), 'Kodiang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Kodiang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Kodiang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Padang Besar'), 'Padang Besar')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Padang Besar'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Perlis/btn_Padang Besar'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_PERLIS'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_PENANG (ISLAND)'), 'PENANG (ISLAND)')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_PENANG (ISLAND)'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_PENANG (ISLAND)'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Batu Maung'), 'Batu Maung')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Batu Maung'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Batu Maung'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Bayan Lepas'), 'Bayan Lepas')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Bayan Lepas'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Bayan Lepas'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Gelugor'), 'Gelugor')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Gelugor'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Gelugor'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_George Town'), 'George Town')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_George Town'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_George Town'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Jelutong'), 'Jelutong')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Jelutong'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Jelutong'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Pulau Pinang'), 'Pulau Pinang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Pulau Pinang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Pulau Pinang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Teluk Kumbar'), 'Teluk Kumbar')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Teluk Kumbar'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (island)/btn_Teluk Kumbar'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_PENANG (ISLAND)'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_PENANG (SEBERANG PERAI)'), 'PENANG (SEBERANG PERAI)')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_PENANG (SEBERANG PERAI)'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_PENANG (SEBERANG PERAI)'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Bukit Mertajam'), 'Bukit Mertajam')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Bukit Mertajam'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Bukit Mertajam'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Butterworth'), 'Butterworth')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Butterworth'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Butterworth'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Kepala Batas'), 'Kepala Batas')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Kepala Batas'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Kepala Batas'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Nibong Tebal'), 'Nibong Tebal')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Nibong Tebal'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Nibong Tebal'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Perai'), 'Perai')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Perai'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Perai'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Permatang Pauh'), 'Permatang Pauh')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Permatang Pauh'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Permatang Pauh'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Simpang Ampat'), 'Simpang Ampat')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Simpang Ampat'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Simpang Ampat'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Sungai Jawi'), 'Sungai Jawi')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Sungai Jawi'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Penang (seberang perai)/btn_Sungai Jawi'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_PENANG (SEBERANG PERAI)'))

/*========================SABAH======================

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_SABAH'), 'SABAH')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_SABAH'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_SABAH'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Beaufort'), 'Beaufort')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Beaufort'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Beaufort'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Inaman'), 'Inaman')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Inaman'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Inaman'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Keningau'), 'Keningau')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Keningau'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Keningau'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Kota Kinabalu'), 'Kota Kinabalu')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Kota Kinabalu'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Kota Kinabalu'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Labuan'), 'Labuan')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Labuan'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Labuan'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Lahad Datu'), 'Lahad Datu')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Lahad Datu'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Lahad Datu'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Membakut'), 'Membakut')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Membakut'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Membakut'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Papar'), 'Papar')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Papar'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Papar'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Penampang'), 'Penampang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Penampang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Penampang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Putatan'), 'Putatan')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Putatan'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Putatan'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Ranau'), 'Ranau')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Ranau'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Ranau'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Sandakan'), 'Sandakan')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Sandakan'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Sandakan'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Kota Marudu'), 'Kota Marudu')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Kota Marudu'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Kota Marudu'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Semporna'), 'Semporna')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Semporna'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Semporna'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Tawau'), 'Tawau')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Tawau'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Tawau'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Tuaran'), 'Tuaran')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Tuaran'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sabah/btn_Tuaran'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_SABAH')) */
/*========================SARAWAK=====================
 
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_SARAWAK'), 'SARAWAK')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_SARAWAK'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_SARAWAK'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Bintangor'), 'Bintangor')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Bintangor'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Bintangor'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Bintulu'), 'Bintulu')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Bintulu'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Bintulu'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Kota Samarahan'), 'Kota Samarahan')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Kota Samarahan'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Kota Samarahan'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Kuching'), 'Kuching')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Kuching'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Kuching'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Limbang'), 'Limbang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Limbang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Limbang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Miri'), 'Miri')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Miri'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Miri'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Mukah'), 'Mukah')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Mukah'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Mukah'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Sarikei'), 'Sarikei')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Sarikei'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Sarikei'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Sibu'), 'Sibu')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Sibu'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Sibu'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Sri Aman'), 'Sri Aman')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Sri Aman'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Sarawak/btn_Sri Aman'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_SARAWAK')) */
/*====================SELANGOR=======================
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_SELANGOR'), 'SELANGOR')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_SELANGOR'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_SELANGOR'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Ampang'), 'Ampang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Ampang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Ampang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Ampang Jaya'), 'Ampang Jaya')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Ampang Jaya'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Ampang Jaya'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Balakong'), 'Balakong')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Balakong'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Balakong'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Bandar Baru Bangi'), 'Bandar Baru Bangi')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Bandar Baru Bangi'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Bandar Baru Bangi'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Banting'), 'Banting')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Banting'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Banting'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Batang Kali'), 'Batang Kali')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Batang Kali'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Batang Kali'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Batu Caves'), 'Batu Caves')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Batu Caves'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Batu Caves'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Cheras'), 'Cheras')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Cheras'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Cheras'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Hulu Langat'), 'Hulu Langat')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Hulu Langat'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Hulu Langat'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Jenjarom'), 'Jenjarom')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Jenjarom'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Jenjarom'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Serendah'), 'Serendah')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Serendah'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Serendah'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Jeram'), 'Jeram')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Jeram'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Jeram'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Kajang'), 'Kajang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Kajang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Kajang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Klang'), 'Klang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Klang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Klang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Pelabuhan Klang'), 'Pelabuhan Klang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Pelabuhan Klang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Pelabuhan Klang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Petaling Jaya'), 'Petaling Jaya')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Petaling Jaya'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Petaling Jaya'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Puchong'), 'Puchong')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Puchong'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Puchong'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Rawang'), 'Rawang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Rawang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Rawang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Selayang'), 'Selayang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Selayang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Selayang'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Semenyih'), 'Semenyih')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Semenyih'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Semenyih'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Seri Kembangan'), 'Seri Kembangan')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Seri Kembangan'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Seri Kembangan'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Shah Alam'), 'Shah Alam')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Shah Alam'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Shah Alam'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Subang Jaya'), 'Subang Jaya')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Subang Jaya'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Subang Jaya'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Sungai Besar'), 'Sungai Besar')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Sungai Besar'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Sungai Besar'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Sungai Buloh'), 'Sungai Buloh')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Sungai Buloh'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Sungai Buloh'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Tanjong Karang'), 'Tanjong Karang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Tanjong Karang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Selangor/btn_Tanjong Karang'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_SELANGOR')) */
/*==================TERENGGANU=======================
 
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_TERENGGANU'), 'TERENGGANU')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_TERENGGANU'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_TERENGGANU'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Chukai'), 'Chukai')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Chukai'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Chukai'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Dungun'), 'Dungun')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Dungun'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Dungun'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Jerteh'), 'Jerteh')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Jerteh'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Jerteh'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Kemaman'), 'Kemaman')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Kemaman'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Kemaman'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Kuala Terengganu'), 'Kuala Terengganu')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Kuala Terengganu'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Kuala Terengganu'))

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Marang'), 'Marang')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Marang'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Terengganu/btn_Marang'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_TERENGGANU')) */
/*=========================WILAYAH PERSEKUTUAN==================*/
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/btn_WILAYAH PERSEKUTUAN'), 'WILAYAH PERSEKUTUAN')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/btn_WILAYAH PERSEKUTUAN'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_WILAYAH PERSEKUTUAN'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/Filter/Wilayah Persekutuan/btn_Kuala Lumpur'), 'Kuala Lumpur')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/Wilayah Persekutuan/btn_Kuala Lumpur'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Wilayah Persekutuan/btn_Kuala Lumpur'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/button_Reset'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_WILAYAH PERSEKUTUAN'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_JOHOR'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/btn_Premier'))

WebUI.click(findTestObject('ATAU/explore workshop/Filter/Johor/btn_Johor Bahru'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\6. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.click(findTestObject('ATAU/explore workshop/Filter/button_Apply'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\7. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.click(findTestObject('ATAU/explore workshop/icon_filter'))

WebUI.delay(2)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/button_Reset'))

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\8. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.click(findTestObject('ATAU/explore workshop/Filter/button_Apply'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\9. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.click(findTestObject('ATAU/explore workshop/icon_filter'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/button_close'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/Filter/button_close'))

WebUI.setText(findTestObject('ATAU/explore workshop/textfield_search_workshop'), findTestData('ATAU Verify').getValue('Workshop', 
        1))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/box_workshop'), 0)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/type_Normal'), 'NORMAL')

//WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_Sum Motor Sdn Bhd'), 'Sum Motor Sdn. Bhd. (HQ)')
WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_Kuala Lumpur'), 'Kuala Lumpur')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/btn_See details'), 0)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/btn_See details'), 'See details')

WebUI.click(findTestObject('ATAU/explore workshop/btn_See details'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\10. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/img_click see details'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/icon_call click details'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/icon_map click details'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/Filter/icon_pin'), 0)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/address2'), 'Jalan Kelang Lama')

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/address1'), '173-AB, Batu 4 1/4')

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/address3'), '58000, Kuala Lumpur, Wilayah Persekutuan')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/icon_phone'), 0)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/phone number'), '03-79831953')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/icon_email'), 0)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_email'), 'summotor@yahoo.com')

WebUI.click(findTestObject('ATAU/explore workshop/btn_close'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/icon_call'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/icon_map'), 0)

WebUI.click(findTestObject('ATAU/explore workshop/icon_map'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_Open With'), 'Open With')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/btn_Google Maps'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/icon_google maps'), 0)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_Google Maps'), 'Google Maps')

WebUI.takeFullPageScreenshot(('D:\\AutomationATA\\ATA_Screenshot\\ATAU\\ExploreWorkshop\\11. Explore Workshop_' + dateTime) + 
    '.png')

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/btn_Waze'), 0)

WebUI.verifyElementPresent(findTestObject('ATAU/explore workshop/icon_waze'), 0)

WebUI.verifyElementText(findTestObject('ATAU/explore workshop/word_Waze'), 'Waze')

WebUI.closeBrowser()

