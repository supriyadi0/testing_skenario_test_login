package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	@Given("open Browser")
	public void open_Browser() {
		WebUI.openBrowser("")
		WebUI.maximizeWindow()
	}

	@Then("navigate_url")
	public void navigate_url() {
		WebUI.navigateToUrl('https://www.saucedemo.com/v1/')
	}

	@Given("user input username valid {string}")
	public void user_input_username_valid(String username) {
		WebUI.callTestCase(findTestCase('pages/Input_username'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user input password valid {string}")
	public void user_input_password_valid(String password) {
		WebUI.callTestCase(findTestCase('pages/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click button login")
	public void user_click_button_login() {
		WebUI.click(findTestObject('Page_Login/btn_submit_login'))
	}

	@Then("user click button logout")
	public void user_click_button_logout() {
		WebUI.click(findTestObject('page_open_logout/button_Open_Menu'))
		WebUI.click(findTestObject('Page_logout/a_Logout'))
	}

	@When("user input password invalid {string}")
	public void user_input_password_invalid(String password) {
		WebUI.callTestCase(findTestCase('pages/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When("showing error message")
	public void showing_error_message() {
		WebUI.verifyElementVisible(findTestObject('Page_Login/error_mesagge'))
	}

	@Given("user no input username")
	public void user_no_input_username() {
		WebUI.clearText(findTestObject('Page_Login/username_login'))
	}

	@Then("user no input password")
	public void user_no_input_password() {
		WebUI.clearText(findTestObject('Page_Login/password_login'))
	}

	@Then("user close browser")
	public void user_close_browser() {
		WebUI.closeBrowser()
	}
}

