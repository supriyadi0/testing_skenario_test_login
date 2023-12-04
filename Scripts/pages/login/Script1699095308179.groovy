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

WebUI.navigateToUrl('https://www.saucedemo.com/v1/')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('null'), 'standard_user')

WebUI.sendKeys(findTestObject('null'), 'secret_sauce')

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_add_to_cart/button_add_to_cart_tas'))

WebUI.verifyElementVisible(findTestObject('Page_add_to_cart/backpack-title'))

WebUI.verifyElementVisible(findTestObject('Page_add_to_cart/img_backpack'))

WebUI.verifyElementVisible(findTestObject('Page_add_to_cart/rate_backpack'))

WebUI.click(findTestObject('Page_1700145087818/Cart'))

WebUI.closeBrowser()

