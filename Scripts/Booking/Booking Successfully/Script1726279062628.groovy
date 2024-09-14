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

//Booking Success

// Open browser and navigate to URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

// Sign in
WebUI.click(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/a_Sign In'))
WebUI.setText(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/input_Need a user name and password_username'),
	'pollux')
WebUI.setEncryptedText(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/input_Need a user name and password_password'),
	'tzH6RvlfSTg=')
WebUI.click(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/input_Need a user name and password_signon'))

// Add item to cart
WebUI.click(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/img'))
WebUI.click(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/a_K9-PO-02'))
WebUI.click(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/a_Add to Cart'))

// Update quantity in the input field
WebUI.setText(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/input_false_EST-8'), '2')
WebUI.click(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/input_Sub Total 18.50_updateCartQuantities'))

// Capture the updated quantity value from the input field
String quantityText = WebUI.getAttribute(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/input_false_EST-8'), 'value')

// Convert the quantity to an integer for validation
int quantity = Integer.parseInt(quantityText.trim())

// Assert that the quantity is as expected
WebUI.verifyEqual(quantity, 2)

// Proceed to checkout and confirm
WebUI.click(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/a_Proceed to Checkout'))
WebUI.click(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/input_Ship to different address_newOrder'))
WebUI.click(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/a_Confirm'))


// Wait for the element to be visible
WebUI.waitForElementVisible(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/td_1'), 2)
// Extract quantity from the <td> element in the checkout page
String checkoutQuantityText = WebUI.getText(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/td_1')) // Replace with the actual TestObject for the <td> element

String itemIdText = WebUI.getText(findTestObject('Object Repository/Booking Successfully/Page_JPetStore Demo/td_EST-8'))
// Convert the quantity to an integer
int checkoutQuantity = Integer.parseInt(checkoutQuantityText.trim())

// Assert that the quantity is as expected in the checkout page
WebUI.verifyEqual(checkoutQuantity, 2)
// Assert that the item ID is as expected using Katalon assert function
WebUI.verifyEqual(itemIdText, 'EST-8', FailureHandling.CONTINUE_ON_FAILURE)


// Close browser
WebUI.closeBrowser()
