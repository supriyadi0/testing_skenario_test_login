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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/i_fa_bars'))

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/input_Username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/input_Password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/input_Apply'))

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/span_visit'))

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/th_dec_2023'))

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/th_2023'))

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/span_2024'))

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/span_Jun'))

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/td_4'))

WebUI.setText(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/freetext_comment'), 'hopefully we\'ll meet soon')

WebUI.click(findTestObject('Object Repository/Page_for_Login_Cura/Page_CURA Healthcare Service/btn_Book'))

WebUI.takeAreaScreenshot(Screenshots/Targets/Page_CURA Healthcare Service/)

WebUI.delay(5)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

