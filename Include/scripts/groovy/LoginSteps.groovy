import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject



















public class LoginSteps {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		println '\n ** inside Given'
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}
	
	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username, String password) {
		println '\n ** inside When'
		WebUI.setText(findTestObject('WEB/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), username)
		WebUI.setEncryptedText(findTestObject('WEB/Page_OrangeHRM/input_Username_txtPassword'), password)
	}
	
	@When("clicks on login button")
	public void clicks_on_login_button() {
		println '\n ** inside And'
		WebUI.click(findTestObject('WEB/Page_OrangeHRM/input_Password_Submit'))
	}
	
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		println '\n ** inside Then'
		WebUI.click(findTestObject('WEB/Page_OrangeHRM/a_Welcome Paul'))
		WebUI.click(findTestObject('WEB/Page_OrangeHRM/a_Logout'))
		WebUI.closeBrowser()
	}
}
