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

WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Search Product/Search Product Empty/h2_Welcome to JPetStore 6'), 
    0)

WebUI.click(findTestObject('Object Repository/Search Product/Search Product Empty/a_Enter the Store'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Search Product/Search Product Empty/input__searchProducts'))

WebUI.click(findTestObject('Object Repository/Search Product/Search Product Empty/input__searchProducts'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Search Product/Search Product Empty/li_Please enter a keyword to search for, th_53394b'))

String result = WebUI.getText(findTestObject('Object Repository/Search Product/Search Product Empty/li_Please enter a keyword to search for, th_53394b'))
assert result == 'Please enter a keyword to search for, then press the search button.' : "Expected result is 'Please enter a keyword to search for, then press the search button.', but found '${result}'"
WebUI.closeBrowser()

