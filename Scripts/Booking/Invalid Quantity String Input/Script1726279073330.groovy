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

// Invalid Quantity String Input

WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

WebUI.click(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/a_Sign In_1'))

WebUI.setText(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/input_Need a user name and password_username_1'),
	'pollux')

WebUI.setEncryptedText(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/input_Need a user name and password_password'),
	'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/input_Need a user name and password_signon'))

WebUI.click(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/img'))

WebUI.click(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/a_K9-PO-02'))

WebUI.click(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/a_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/input_false_EST-8'), 'two')

WebUI.click(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/input_Sub Total 18.50_updateCartQuantities'))

WebUI.click(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/a_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/input_Ship to different address_newOrder'))

WebUI.click(findTestObject('Object Repository/Invalid Quantity String Input/Page_JPetStore Demo/a_Confirm'))

// Wait for the element to be visible
WebUI.waitForElementVisible(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/td_1'), 2)
// Extract quantity from the <td> element in the checkout page
String checkoutQuantityText = WebUI.getText(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/td_1')) // Replace with the actual TestObject for the <td> element

// Convert the quantity to an integer
int checkoutQuantity = Integer.parseInt(checkoutQuantityText.trim())

// Assert that the quantity is as expected in the checkout page
// Verify if the quantity is either the number 2 or the word "two"
if (checkoutQuantityText.equals("2") || checkoutQuantityText.equalsIgnoreCase("two")) {
	WebUI.comment("Quantity is either integer '2' or string 'two', as expected.")
} else {
	WebUI.verifyEqual(checkoutQuantityText,'two',  FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyEqual(checkoutQuantityText, '2',  FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.closeBrowser()
