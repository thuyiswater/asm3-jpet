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

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/input__keyword'), 'aB3$dE9fG!hJkLmN2oPqRsTuVwXyZ1@cD4eF5gH^iJ6kL7mN8oP9qR*sT!uVxYz0#A1bC2dE3fG4hI5jK6lM7nO8pQ9rS&tU*vW!xYz0@A1B2C3D4E5F6G7H8I9J0K!lM^nO*pQ+rS-tU=vW+xY=z0@1A2B3C4D5E6F7G8H9I0J!kL^mN*oP+qR-sT/uV=wX+yZ')

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input__searchProducts'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_JPetStore Demo/div_Product IDName'), 0)

WebUI.closeBrowser()

