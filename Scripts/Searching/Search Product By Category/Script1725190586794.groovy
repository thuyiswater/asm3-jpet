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

WebUI.verifyElementPresent(findTestObject('Object Repository/Search Product/Search Product By Category/h2_Welcome to JPetStore 6'), 
    0)

WebUI.click(findTestObject('Object Repository/Search Product/Search Product By Category/a_Enter the Store'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Search Product/Search Product By Category/input__searchProducts'))

WebUI.setText(findTestObject('Object Repository/Search Product/Search Product By Category/input__keyword'), 'reptiles')

WebUI.sendKeys(findTestObject('Object Repository/Search Product/Search Product By Category/input__keyword'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Search Product/Search Product By Category/table_Product IDName'))

// Locate the table element
TestObject table = findTestObject('Object Repository/Search Product/Search Product By Category/table_Product IDName')

// Get the text content of the table
String tableText = WebUI.getText(table)

// Verify if 'Goldfish' is present in the table
boolean isReptilesPresent = tableText.contains('Reptiles')

// Assert that 'Goldfish' is found in the table
assert isReptilesPresent : "The table does not contain 'Reptiles'."

WebUI.closeBrowser()

