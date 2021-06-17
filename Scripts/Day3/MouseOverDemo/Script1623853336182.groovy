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

WebUI.navigateToUrl('https://www.katalon.com/')

WebUI.mouseOver(findTestObject('WEB/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/a_Products'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('WEB/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/a_Resources'))

WebUI.verifyTextPresent('Community', false)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('WEB/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/a_Company'))

WebUI.delay(1)

WebUI.click(findTestObject('WEB/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/div_About Katalon'))

WebUI.closeBrowser()

